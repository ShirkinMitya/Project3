package GUI;

import Service.Manager;
import Service.MyException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
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
        ScrollPane = new javax.swing.JScrollPane();
        TreeStucture = new javax.swing.JTree();
        LabelInfoReactors = new javax.swing.JLabel();
        ButtonCreateDB = new javax.swing.JButton();
        ButtonCalculationsCountry = new javax.swing.JButton();
        ButtonCalculationsRegion = new javax.swing.JButton();
        ButtonCalculationsOwner = new javax.swing.JButton();
        ButtonCalculationsCountryOperator = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
        LabelInfoConsumption = new javax.swing.JLabel();
        LabelConsumption = new javax.swing.JLabel();
        ButtonUploadDB = new javax.swing.JButton();

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

        javax.swing.tree.DefaultMutableTreeNode treeNode1 = new javax.swing.tree.DefaultMutableTreeNode("root");
        TreeStucture.setModel(new javax.swing.tree.DefaultTreeModel(treeNode1));
        ScrollPane.setViewportView(TreeStucture);

        LabelInfoReactors.setText("Данные о ректорах");

        ButtonCreateDB.setText("Создать БД");
        ButtonCreateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateDBActionPerformed(evt);
            }
        });

        ButtonCalculationsCountry.setText("Расчёт по Странам");
        ButtonCalculationsCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculationsCountryActionPerformed(evt);
            }
        });

        ButtonCalculationsRegion.setText("Расчёт по регионам");
        ButtonCalculationsRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculationsRegionActionPerformed(evt);
            }
        });

        ButtonCalculationsOwner.setText("Расчёт по владельцам");
        ButtonCalculationsOwner.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculationsOwnerActionPerformed(evt);
            }
        });

        ButtonCalculationsCountryOperator.setText("Расчёт по операторам");
        ButtonCalculationsCountryOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculationsCountryOperatorActionPerformed(evt);
            }
        });

        Table.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Title 1", "Объём ежигодного потребления, т.", "Год"
            }
        ));
        jScrollPane1.setViewportView(Table);

        LabelInfoConsumption.setText("Всего потреблено:");

        LabelConsumption.setText("jLabel3");

        ButtonUploadDB.setText("Выгрузить БД");
        ButtonUploadDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonUploadDBActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(LabelInfoReactors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonExit))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(ButtonChooseFile)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(LabelInfoConsumption, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE)
                                    .addComponent(ButtonCreateDB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonUploadDB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(ButtonCalculationsCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ButtonCalculationsRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ButtonCalculationsOwner, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(ButtonCalculationsCountryOperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(LabelConsumption, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonExit)
                    .addComponent(LabelInfoReactors))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPane, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(LabelInfoConsumption, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(LabelConsumption, javax.swing.GroupLayout.PREFERRED_SIZE, 21, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(15, 15, 15)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCreateDB)
                    .addComponent(ButtonCalculationsCountry)
                    .addComponent(ButtonChooseFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCalculationsRegion)
                    .addComponent(ButtonUploadDB))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCalculationsOwner)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ButtonCalculationsCountryOperator)
                .addContainerGap(14, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChooseFileActionPerformed
        try {
            File currentDirectory = new File(getClass().getProtectionDomain().
                    getCodeSource().getLocation().toURI().getPath()).getParentFile();
            JFileChooser fileChooser = new JFileChooser(currentDirectory);
            fileChooser.setFileFilter(new FileNameExtensionFilter("task files", "json", "xml", "yaml"));
            int window = fileChooser.showDialog(this, "Выберете файл");
            if (window == JFileChooser.APPROVE_OPTION) {

                manager.readFile(fileChooser.getSelectedFile());
                TreeStucture.setModel(new DefaultTreeModel(manager.addInfotoGUI()));
            }
        } catch (IOException | URISyntaxException ex) {
            //ex.printStackTrace();
            JOptionPane.showMessageDialog(this, "Не удалось прочитать файл");
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }

    }//GEN-LAST:event_ButtonChooseFileActionPerformed

    private void ButtonCreateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateDBActionPerformed
        manager.createDB();
    }//GEN-LAST:event_ButtonCreateDBActionPerformed

    private void ButtonCalculationsCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculationsCountryActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCalculationsCountryActionPerformed

    private void ButtonCalculationsRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculationsRegionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCalculationsRegionActionPerformed

    private void ButtonCalculationsOwnerActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculationsOwnerActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCalculationsOwnerActionPerformed

    private void ButtonCalculationsCountryOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculationsCountryOperatorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_ButtonCalculationsCountryOperatorActionPerformed

    private void ButtonUploadDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUploadDBActionPerformed
        manager.uploadDB();
    }//GEN-LAST:event_ButtonUploadDBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalculationsCountry;
    private javax.swing.JButton ButtonCalculationsCountryOperator;
    private javax.swing.JButton ButtonCalculationsOwner;
    private javax.swing.JButton ButtonCalculationsRegion;
    private javax.swing.JButton ButtonChooseFile;
    private javax.swing.JButton ButtonCreateDB;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonUploadDB;
    private javax.swing.JLabel LabelConsumption;
    private javax.swing.JLabel LabelInfoConsumption;
    private javax.swing.JLabel LabelInfoReactors;
    private javax.swing.JScrollPane ScrollPane;
    private javax.swing.JTable Table;
    private javax.swing.JTree TreeStucture;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
