/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package com.mycompany.cima;

import java.awt.List;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author HP
 */
public class SortDoB extends javax.swing.JFrame {
        private CustomerManagement cm;
        DefaultTableModel model;
        
    /**
     * Creates new form SortDoB
     */
    public SortDoB(java.awt.Frame parent, boolean modal) {
        initComponents();
        this.setLocationRelativeTo(null);
        cm = (CustomerManagement) parent;
        model = (DefaultTableModel) ListSortDoB.getModel();
    }
   
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        ListCustomer = new javax.swing.JTable();
        lblName = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        ListSortDoB = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        btnFurthest = new javax.swing.JButton();
        btnNearest = new javax.swing.JButton();

        ListCustomer.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Số Điện Thoại", "Ngày Sinh", "Ngày Đăng Kí"
            }
        ));
        jScrollPane1.setViewportView(ListCustomer);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        lblName.setFont(new java.awt.Font("Segoe UI Variable", 1, 18)); // NOI18N
        lblName.setText("Sắp Xếp Theo Ngày Sinh !");

        ListSortDoB.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Id", "Name", "Số Điện Thoại", "Ngày Sinh", "Ngày Đăng Kí"
            }
        ));
        jScrollPane2.setViewportView(ListSortDoB);

        jButton1.setText("Trở Về");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        btnFurthest.setText("Xa Nhất");
        btnFurthest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFurthestActionPerformed(evt);
            }
        });

        btnNearest.setText("Gần Nhất");
        btnNearest.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNearestActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblName)
                                .addGap(234, 234, 234)
                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 526, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(144, 144, 144)
                        .addComponent(btnNearest, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(70, 70, 70)
                        .addComponent(btnFurthest, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(36, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblName)
                    .addComponent(jButton1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 340, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnFurthest)
                    .addComponent(btnNearest))
                .addContainerGap(11, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        this.dispose();
        
    }//GEN-LAST:event_jButton1ActionPerformed
    private void SortDoBDown(ArrayList<Customers> list) {
    SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
    Collections.sort(list, new Comparator<Customers>() {
        @Override
        public int compare(Customers c1, Customers c2) {
            try {
                return dateFormat.parse(c2.getDoB()).compareTo(dateFormat.parse(c1.getDoB())); // Chú ý sự khác biệt ở đây
            } catch (ParseException e) {
                e.printStackTrace();
                return 0;
            }
        }
        });
        model.setRowCount(0);
        for (Customers c : list) {
            model.addRow(new Object[]{c.getId(), c.getName(),c.getSdt(),
                c.getDoB(), c.getDoS()});
        }
    }

    private void SortDoBUp(ArrayList<Customers> list) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Collections.sort(list, new Comparator<Customers>() {
            @Override
            public int compare(Customers c1, Customers c2) {
                try {
                    return dateFormat.parse(c1.getDoB()).compareTo(dateFormat.parse(c2.getDoB())); // Không có sự thay đổi ở đây
                } catch (ParseException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        });
        model.setRowCount(0);
        for (Customers c : list) {
            model.addRow(new Object[]{c.getId(), c.getName(),c.getSdt(),
                c.getDoB(), c.getDoS()});
        }
    }
    private void btnFurthestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFurthestActionPerformed
       ArrayList<Customers> customerList = cm.getCustomerList();
       SortDoBUp(customerList);
    }//GEN-LAST:event_btnFurthestActionPerformed

    private void btnNearestActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNearestActionPerformed
       ArrayList<Customers> customerList = cm.getCustomerList();
       SortDoBDown(customerList);
    }//GEN-LAST:event_btnNearestActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SortDoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SortDoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SortDoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SortDoB.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                SortDoB sb = new SortDoB(new javax.swing.JFrame(), true);
                sb.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                sb.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable ListCustomer;
    private javax.swing.JTable ListSortDoB;
    private javax.swing.JButton btnFurthest;
    private javax.swing.JButton btnNearest;
    private javax.swing.JButton jButton1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JLabel lblName;
    // End of variables declaration//GEN-END:variables

    public void setSortDoB(ArrayList<Customers> list) {
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Collections.sort(list, new Comparator<Customers>() {
            @Override
            public int compare(Customers c1, Customers c2) {
                try {
                    return dateFormat.parse(c1.getDoB()).compareTo(dateFormat.parse(c2.getDoB()));
                } catch (ParseException e) {
                    e.printStackTrace();
                    return 0;
                }
            }
        });
        model.setRowCount(0);
        for (Customers c : list) {
            model.addRow(new Object[]{c.getId(), c.getName(),c.getSdt(),
                c.getDoB(), c.getDoS()});
        }
    }
}
