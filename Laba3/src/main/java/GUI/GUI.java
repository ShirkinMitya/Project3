package GUI;

import Service.Manager;
import Service.MyException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFileChooser;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.tree.DefaultTreeModel;

public class GUI extends javax.swing.JFrame {
    
    Manager manager;

    public GUI() {
        initComponents();
        manager = new Manager();
        
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ButtonExit = new javax.swing.JButton();
        ButtonChooseFile = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTree1 = new javax.swing.JTree();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        ButtonExit.setText("Выход");
        ButtonExit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonExitActionPerformed(evt);
            }
        });

        ButtonChooseFile.setText("Загрузить файл");
        ButtonChooseFile.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonChooseFileActionPerformed(evt);
            }
        });

        jScrollPane1.setViewportView(jTree1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(147, 147, 147)
                                .addComponent(ButtonChooseFile))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 346, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 63, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(ButtonExit)
                .addGap(2, 2, 2)
                .addComponent(ButtonChooseFile)
                .addGap(57, 57, 57)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(143, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
         System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChooseFileActionPerformed
          JFileChooser fileChooser = new JFileChooser();
        fileChooser.setFileFilter(new FileNameExtensionFilter("files", "json","xml","yaml"));
        int window = fileChooser.showDialog(this, "Выберете файл");
        if (window == JFileChooser.APPROVE_OPTION) {   
            try {
                manager.getFirstHandler().handleRequest( fileChooser.getSelectedFile());
                jTree1.setModel( new DefaultTreeModel(manager.addInfotoGUI()));
           } catch (IOException ex) {
               //ex.printStackTrace();
               JOptionPane.showMessageDialog(this, "Не удалось прочитать файл");
           } catch (MyException ex) {
                JOptionPane.showMessageDialog(this, ex.getMessage());
           }
        }
    }//GEN-LAST:event_ButtonChooseFileActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonChooseFile;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTree jTree1;
    // End of variables declaration//GEN-END:variables
}