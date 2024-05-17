package GUI;

import Service.Manager;
import Service.MyException;
import java.io.File;
import java.io.IOException;
import java.net.URISyntaxException;
import java.sql.SQLException;
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
        ScrollPaneTree = new javax.swing.JScrollPane();
        TreeStucture = new javax.swing.JTree();
        LabelInfoReactors = new javax.swing.JLabel();
        ButtonCreateDB = new javax.swing.JButton();
        ButtonCalculateCountry = new javax.swing.JButton();
        ButtonCalculateRegion = new javax.swing.JButton();
        ButtonCalculateOperator = new javax.swing.JButton();
        jScrollPaneTable = new javax.swing.JScrollPane();
        Table = new javax.swing.JTable();
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
        ScrollPaneTree.setViewportView(TreeStucture);

        LabelInfoReactors.setText("Данные о классах ректоров");

        ButtonCreateDB.setText("Создать БД");
        ButtonCreateDB.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCreateDBActionPerformed(evt);
            }
        });

        ButtonCalculateCountry.setText("Расчёт по Странам");
        ButtonCalculateCountry.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculateCountryActionPerformed(evt);
            }
        });

        ButtonCalculateRegion.setText("Расчёт по Регионам");
        ButtonCalculateRegion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculateRegionActionPerformed(evt);
            }
        });

        ButtonCalculateOperator.setText("Расчёт по Oператорам");
        ButtonCalculateOperator.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ButtonCalculateOperatorActionPerformed(evt);
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
                "", "", ""
            }
        ));
        jScrollPaneTable.setViewportView(Table);

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
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(21, 21, 21)
                                .addComponent(ScrollPaneTree, javax.swing.GroupLayout.PREFERRED_SIZE, 288, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(72, 72, 72)
                                .addComponent(ButtonChooseFile)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 66, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 535, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addComponent(ButtonCreateDB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonUploadDB, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 135, Short.MAX_VALUE))
                                .addGap(53, 53, 53)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(ButtonCalculateCountry, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonCalculateRegion, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(ButtonCalculateOperator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(LabelInfoReactors)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ButtonExit)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonExit)
                    .addComponent(LabelInfoReactors))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(ScrollPaneTree, javax.swing.GroupLayout.DEFAULT_SIZE, 327, Short.MAX_VALUE)
                    .addComponent(jScrollPaneTable, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                .addGap(59, 59, 59)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCreateDB)
                    .addComponent(ButtonCalculateCountry)
                    .addComponent(ButtonChooseFile))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(ButtonCalculateRegion)
                    .addComponent(ButtonUploadDB))
                .addGap(18, 18, 18)
                .addComponent(ButtonCalculateOperator)
                .addContainerGap(60, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void ButtonExitActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonExitActionPerformed
        System.exit(0);
    }//GEN-LAST:event_ButtonExitActionPerformed

    private void ButtonChooseFileActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonChooseFileActionPerformed
        try {
            File file = new File(getClass().getProtectionDomain().getCodeSource().getLocation().toURI().getPath()).getParentFile();
            JFileChooser fileChooser = new JFileChooser(file);
            fileChooser.setFileFilter(new FileNameExtensionFilter("task files", "json", "xml", "yaml"));
            int window = fileChooser.showDialog(this, "Выберете файл");
            if (window == JFileChooser.APPROVE_OPTION) {

                manager.readFile(fileChooser.getSelectedFile());
                TreeStucture.setModel(new DefaultTreeModel(manager.addTreeToGUI()));
            }
        } catch (IOException | URISyntaxException ex) {
            JOptionPane.showMessageDialog(this, "Не удалось прочитать файл");
        } catch (MyException ex) {
            JOptionPane.showMessageDialog(this, ex.getMessage());
        }
    }//GEN-LAST:event_ButtonChooseFileActionPerformed

    private void ButtonCreateDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCreateDBActionPerformed
        try {
            manager.createDB();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Oшибка при создании БД");
        }
        JOptionPane.showMessageDialog(this, "БД создана");
    }//GEN-LAST:event_ButtonCreateDBActionPerformed

    private void ButtonCalculateCountryActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculateCountryActionPerformed
        if (!manager.isReadyForCalculations()) {
            JOptionPane.showMessageDialog(this, "Сначала загрузите файл и выгрузите БД");
            return;
        }
        manager.calculateConsumptionForReactor();
        Table.setModel(manager.addTableCountriesToGui());
    }//GEN-LAST:event_ButtonCalculateCountryActionPerformed

    private void ButtonCalculateRegionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculateRegionActionPerformed
        if (!manager.isReadyForCalculations()) {
            JOptionPane.showMessageDialog(this, "Сначала загрузите файл и выгрузите БД");
            return;
        }
        manager.calculateConsumptionForReactor();
        Table.setModel(manager.addTableRegionsToGui());
    }//GEN-LAST:event_ButtonCalculateRegionActionPerformed

    private void ButtonCalculateOperatorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonCalculateOperatorActionPerformed
        if (!manager.isReadyForCalculations()) {
            JOptionPane.showMessageDialog(this, "Сначала загрузите файл и выгрузите БД");
            return;
        }
        manager.calculateConsumptionForReactor();
        Table.setModel(manager.addTableOperatorsToGui());
    }//GEN-LAST:event_ButtonCalculateOperatorActionPerformed

    private void ButtonUploadDBActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ButtonUploadDBActionPerformed
        try {
            manager.uploadDB();
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(this, "Ошибка при выгрузке БД");
        }
        JOptionPane.showMessageDialog(this, "БД выгружена");
    }//GEN-LAST:event_ButtonUploadDBActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton ButtonCalculateCountry;
    private javax.swing.JButton ButtonCalculateOperator;
    private javax.swing.JButton ButtonCalculateRegion;
    private javax.swing.JButton ButtonChooseFile;
    private javax.swing.JButton ButtonCreateDB;
    private javax.swing.JButton ButtonExit;
    private javax.swing.JButton ButtonUploadDB;
    private javax.swing.JLabel LabelInfoReactors;
    private javax.swing.JScrollPane ScrollPaneTree;
    private javax.swing.JTable Table;
    private javax.swing.JTree TreeStucture;
    private javax.swing.JScrollPane jScrollPaneTable;
    // End of variables declaration//GEN-END:variables
}
