/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Library_automation;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

/**
 *
 * @author ABDULLAH
 */
public class JFrame extends javax.swing.JFrame {

        DefaultTableModel model ;
        public JFrame() {
                initComponents();
                userTable();
        }
        public void userTable()
        {
                model = (DefaultTableModel) tblUsers.getModel();
             
                try {
                        ArrayList<Users> eleman = getUserses();
                        for (Users user : eleman) {
                                Object[] row = {user.getId_bilgi(),user.getAd_Soyad(),
                                user.getEmail(),user.getKulanici_Adi(),user.getSifre()};
                                model.addRow(row);
                        }
                } catch (SQLException ex) {
                       
                }
        }
        public ArrayList<Users> getUserses() throws SQLException
        {
                Connection connection = null;
                DBHelper dBHelper = new DBHelper();
                Statement statement = null;//göndereceğimiz sorgu için 
                ResultSet resultSet ;
                ArrayList<Users> arrayListUser = null;
                try {
                        connection = dBHelper.getConnection();//bağlantıyı sağlamak için 
                        statement = connection.createStatement(); //sorgu oluşturmak için ortam 
                        resultSet = statement.executeQuery("select * from bilgi");
                        arrayListUser = new ArrayList<Users>();
                        while (resultSet.next()) {                                
                                arrayListUser.add(new Users(
                                        resultSet.getInt("id_bilgi"),
                                        resultSet.getString("Ad_Soyad"),
                                        resultSet.getString("Email"),
                                        resultSet.getString("Kulanici_Adi"),
                                        resultSet.getString("Sifre")
                                        ));
                        }
                } catch (SQLException e) {
                        dBHelper.showErorMesage(e);
                }finally{
                        statement.close();
                        connection.close();
                }
                return arrayListUser;
               
        }
        
       
        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jScrollPane1 = new javax.swing.JScrollPane();
                tblUsers = new javax.swing.JTable();
                jLabel1 = new javax.swing.JLabel();
                txtsearch = new javax.swing.JTextField();
                btnCreate = new javax.swing.JButton();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

                tblUsers.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Id", "Adı soyadı", "E-Posta", "Kulanıcı Adı", "Şifresi"
                        }
                ) {
                        Class[] types = new Class [] {
                                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
                        };
                        boolean[] canEdit = new boolean [] {
                                false, false, false, false, false
                        };

                        public Class getColumnClass(int columnIndex) {
                                return types [columnIndex];
                        }

                        public boolean isCellEditable(int rowIndex, int columnIndex) {
                                return canEdit [columnIndex];
                        }
                });
                tblUsers.setGridColor(new java.awt.Color(255, 102, 102));
                tblUsers.setRowHeight(20);
                jScrollPane1.setViewportView(tblUsers);
                if (tblUsers.getColumnModel().getColumnCount() > 0) {
                        tblUsers.getColumnModel().getColumn(0).setResizable(false);
                        tblUsers.getColumnModel().getColumn(0).setPreferredWidth(1);
                        tblUsers.getColumnModel().getColumn(1).setResizable(false);
                        tblUsers.getColumnModel().getColumn(2).setResizable(false);
                        tblUsers.getColumnModel().getColumn(3).setResizable(false);
                        tblUsers.getColumnModel().getColumn(4).setResizable(false);
                }

                jLabel1.setText("Aramak istediğiniz veriyi giriniz  :");

                txtsearch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtsearchActionPerformed(evt);
                        }
                });
                txtsearch.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyReleased(java.awt.event.KeyEvent evt) {
                                txtsearchKeyReleased(evt);
                        }
                });

                btnCreate.setText("yeni kayıt ");
                btnCreate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                btnCreateActionPerformed(evt);
                        }
                });

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                                .addGap(116, 116, 116)
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 204, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, 439, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnCreate)
                                .addContainerGap(76, Short.MAX_VALUE))
                        .addGroup(layout.createSequentialGroup()
                                .addGap(49, 49, 49)
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(89, 89, 89)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtsearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(btnCreate))
                                .addGap(58, 58, 58)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 276, Short.MAX_VALUE)
                                .addGap(31, 31, 31))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        
        
        private void txtsearchKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtsearchKeyReleased
                String searchKey = txtsearch.getText();
                TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);
                tblUsers.setRowSorter(rowSorter);
                rowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
        }//GEN-LAST:event_txtsearchKeyReleased

        private void btnCreateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateActionPerformed
                JCreateUsers createUsers = new JCreateUsers();
                createUsers.setVisible(true);
        }//GEN-LAST:event_btnCreateActionPerformed

        private void txtsearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtsearchActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtsearchActionPerformed

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
                        java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(JFrame.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new JFrame().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton btnCreate;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tblUsers;
        private javax.swing.JTextField txtsearch;
        // End of variables declaration//GEN-END:variables
}
