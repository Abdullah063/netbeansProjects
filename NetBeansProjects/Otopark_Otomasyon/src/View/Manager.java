package View;


import Model.Customer;
import Database.DbConnection;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

public class Manager extends javax.swing.JFrame {


        DefaultTableModel model ;
        
        public Manager() {
                initComponents();
                CustomerTable();
        }
        
        public void CustomerTable()
        {
                model = (DefaultTableModel) tabloCustomer.getModel();
                //listedeki dinamik olarak kaydederken tekrarlanmasını engeleme amacli 
                model.setRowCount(0);
                try {
                        ArrayList<Customer> eleman = getUserses();
                        for (Customer user : eleman) {
                                Object[] row = {user.getName(),
                                user.getLastName(),user.getNumber(),user.getPlate(), user.getTime()};
                                model.addRow(row);
                        }
                } catch (SQLException ex) {
                       
                }
        }
        public ArrayList<Customer> getUserses() throws SQLException
        {
                Connection connection = null;
                DbConnection dBHelper = new DbConnection();
                Statement statement = null;//göndereceğimiz sorgu için 
                ResultSet resultSet ;
                ArrayList<Customer> arrayListCustomer = null;
                try {
                        connection = dBHelper.getConnection();//bağlantıyı sağlamak için 
                        statement = connection.createStatement(); //sorgu oluşturmak için ortam 
                        resultSet = statement.executeQuery("select * from car");
                        arrayListCustomer = new ArrayList<Customer>();
                        while (resultSet.next()) {                                
                                arrayListCustomer.add(new Customer(
                                        resultSet.getInt("id"),
                                        resultSet.getString("name"),
                                        resultSet.getString("lastName"),
                                        resultSet.getString("number"),
                                        resultSet.getString("plate"),
                                        resultSet.getString("time")
                                        ));
                        }
                } catch (SQLException e) {
                        dBHelper.ShowEror(e);
                }finally{
                        statement.close();
                        connection.close();
                }
                return arrayListCustomer;
               
        }

        @SuppressWarnings("unchecked")
        // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
        private void initComponents() {

                jLabel6 = new javax.swing.JLabel();
                jPanel1 = new javax.swing.JPanel();
                txtName = new javax.swing.JTextField();
                jLabel1 = new javax.swing.JLabel();
                jLabel2 = new javax.swing.JLabel();
                txtLastName = new javax.swing.JTextField();
                jLabel3 = new javax.swing.JLabel();
                txtNumber = new javax.swing.JTextField();
                jLabel4 = new javax.swing.JLabel();
                txtPlate = new javax.swing.JTextField();
                jLabel5 = new javax.swing.JLabel();
                txtTime = new javax.swing.JTextField();
                jButton1 = new javax.swing.JButton();
                jButton2 = new javax.swing.JButton();
                jButton3 = new javax.swing.JButton();
                jLabel8 = new javax.swing.JLabel();
                jPanel2 = new javax.swing.JPanel();
                jScrollPane1 = new javax.swing.JScrollPane();
                tabloCustomer = new javax.swing.JTable();
                jLabel7 = new javax.swing.JLabel();
                txtSearch = new javax.swing.JTextField();
                jLabel9 = new javax.swing.JLabel();

                setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
                setBackground(new java.awt.Color(255, 255, 255));
                setLocation(new java.awt.Point(500, 200));

                jPanel1.setBackground(new java.awt.Color(153, 153, 255));

                jLabel1.setText("Adı  :");

                jLabel2.setText("Soyadı :");

                jLabel3.setText("Telefon Numara :");

                jLabel4.setText("Plaka :");

                txtPlate.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtPlateActionPerformed(evt);
                        }
                });

                jLabel5.setText("Giriş Saati :");

                jButton1.setText("kayıt Yap");
                jButton1.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton1ActionPerformed(evt);
                        }
                });

                jButton2.setText("Çıkış Yap");
                jButton2.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton2ActionPerformed(evt);
                        }
                });

                jButton3.setText("kayıt Sil");
                jButton3.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                jButton3ActionPerformed(evt);
                        }
                });

                jLabel8.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
                jLabel8.setText("ARAÇ KAYIT");

                javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
                jPanel1.setLayout(jPanel1Layout);
                jPanel1Layout.setHorizontalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                .addComponent(jButton3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jButton1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(43, 43, 43)
                                                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE))
                                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                                        .addGap(55, 55, 55)
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addComponent(jLabel1)
                                                                .addComponent(jLabel2)))
                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                        .addGap(6, 6, 6))
                                                                .addGroup(jPanel1Layout.createSequentialGroup()
                                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                                                .addComponent(jLabel5)
                                                                                .addComponent(jLabel4))
                                                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                .addComponent(txtLastName)
                                                                .addComponent(txtPlate)
                                                                .addComponent(txtNumber)
                                                                .addComponent(txtName)
                                                                .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(20, Short.MAX_VALUE))
                );
                jPanel1Layout.setVerticalGroup(
                        jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addContainerGap(15, Short.MAX_VALUE)
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel1)
                                        .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(13, 13, 13)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(txtLastName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtNumber, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtPlate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel4))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(txtTime, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jLabel5))
                                .addGap(7, 7, 7)
                                .addComponent(jButton1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton3))
                );

                jPanel2.setBackground(new java.awt.Color(255, 51, 51));

                tabloCustomer.setModel(new javax.swing.table.DefaultTableModel(
                        new Object [][] {

                        },
                        new String [] {
                                "Ad", "Soyad", "Numara", "Plaka ", "Giriş Saatil"
                        }
                ));
                tabloCustomer.addMouseListener(new java.awt.event.MouseAdapter() {
                        public void mouseClicked(java.awt.event.MouseEvent evt) {
                                tabloCustomerMouseClicked(evt);
                        }
                });
                jScrollPane1.setViewportView(tabloCustomer);

                jLabel7.setFont(new java.awt.Font("Dialog", 1, 24)); // NOI18N
                jLabel7.setText("AKTİF ARAÇLAR");

                javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
                jPanel2.setLayout(jPanel2Layout);
                jPanel2Layout.setHorizontalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(282, 282, 282)
                                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(279, Short.MAX_VALUE))
                        .addGroup(jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jScrollPane1)
                                .addContainerGap())
                );
                jPanel2Layout.setVerticalGroup(
                        jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 48, Short.MAX_VALUE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 207, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18))
                );

                txtSearch.addActionListener(new java.awt.event.ActionListener() {
                        public void actionPerformed(java.awt.event.ActionEvent evt) {
                                txtSearchActionPerformed(evt);
                        }
                });
                txtSearch.addKeyListener(new java.awt.event.KeyAdapter() {
                        public void keyPressed(java.awt.event.KeyEvent evt) {
                                txtSearchKeyPressed(evt);
                        }
                });

                jLabel9.setText("Arama Yap :");

                javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
                getContentPane().setLayout(layout);
                layout.setHorizontalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 540, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(82, 82, 82))
                        .addGroup(layout.createSequentialGroup()
                                .addContainerGap(21, Short.MAX_VALUE)
                                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(layout.createSequentialGroup()
                                                .addGap(18, 18, Short.MAX_VALUE)
                                                .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addContainerGap(12, Short.MAX_VALUE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 83, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 332, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(192, Short.MAX_VALUE))))
                );
                layout.setVerticalGroup(
                        layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addContainerGap(33, Short.MAX_VALUE)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGroup(layout.createSequentialGroup()
                                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                                        .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                        .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE))))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addContainerGap(35, Short.MAX_VALUE))
                );

                pack();
        }// </editor-fold>//GEN-END:initComponents

        private void txtPlateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPlateActionPerformed
                // TODO add your handling code here:
        }//GEN-LAST:event_txtPlateActionPerformed

        private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
                Connection connection = null;
                PreparedStatement statement = null; 
                DbConnection dBHelper = new DbConnection();
                try {
                        connection = dBHelper.getConnection();
                        String sql = "insert into car(name,lastName,number,plate,time) values(?,?,?,?,?)";
                        statement = connection.prepareStatement(sql);
                        statement.setString(1,txtName.getText());
                        statement.setString(2,txtLastName.getText());
                        statement.setString(3,txtNumber.getText());
                        statement.setString(4,txtPlate.getText());
                        statement.setString(5,txtTime.getText());
                        int result = statement.executeUpdate();
                 
                } catch (SQLException e) {
                        JOptionPane.showMessageDialog(null,e.getMessage());
                        dBHelper.ShowEror(e);
                }finally{
                        try {
                                statement.close();
                                connection.close();
                                CustomerTable();
                        } catch (SQLException ex) {
                                 
                        }
                } 
        }//GEN-LAST:event_jButton1ActionPerformed
        
        private void logOut(String sql)
        {
                Connection connection = null;
                PreparedStatement statement = null; 
                DbConnection dBHelper = new DbConnection();
                
                try {
                        connection = dBHelper.getConnection();
                        statement = connection.prepareStatement(sql);
                        int result = statement.executeUpdate();
                        
                         
                } catch (SQLException e) {
                        dBHelper.ShowEror(e);
                }finally{
                        try {
                                CustomerTable();
                                statement.close();
                                connection.close();     
                        } catch (SQLException ex) {
        
                        }
                }
        }
        private void priceCalculate()
        {
              String outTime = JOptionPane.showInputDialog("çıkış saati");
                if (outTime.equals("")) {
                        outTime = "0.0";
                }
              double out = Double.parseDouble(outTime);
              double in =Double.parseDouble(txtTime.getText()); 
              double total =(out-in);
              double price =(total*20);
              JOptionPane.showMessageDialog(null,"Gecen Süre : "+total+" Saat\n"
                                                                +" Ücret :"+price+" TL");
        }
        
        private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
                String primaryKey , sql;
                // DELETE FROM TABLO WHERE İD=KEY;
                primaryKey = txtPlate.getText();
                sql = "delete  from car where plate='"+primaryKey+"'";
                
                priceCalculate();
                logOut(sql);
                
        }//GEN-LAST:event_jButton2ActionPerformed
        //tabloda eleman seçildiği zaman
        private void tabloCustomerMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabloCustomerMouseClicked
               DefaultTableModel user;
                user = (DefaultTableModel) tabloCustomer.getModel();
                
                int userId = tabloCustomer.getSelectedRow();
                txtName.setText(user.getValueAt(userId,0).toString());
                txtLastName.setText(user.getValueAt(userId,1).toString());
                txtNumber.setText(user.getValueAt(userId,2).toString());
                txtPlate.setText(user.getValueAt(userId,3).toString());
                txtTime.setText(user.getValueAt(userId,4).toString());
                 
        }//GEN-LAST:event_tabloCustomerMouseClicked

        private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
                String primaryKey , sql;
                primaryKey = txtPlate.getText();
                sql = "delete  from car where plate='"+primaryKey+"'";
                logOut(sql);
                
        }//GEN-LAST:event_jButton3ActionPerformed

        private void txtSearchActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtSearchActionPerformed
               
        }//GEN-LAST:event_txtSearchActionPerformed

        private void txtSearchKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchKeyPressed
                String searchKey = txtSearch.getText();
                TableRowSorter<DefaultTableModel> rowSorter = new TableRowSorter<DefaultTableModel>(model);
                tabloCustomer.setRowSorter(rowSorter);
                rowSorter.setRowFilter(RowFilter.regexFilter(searchKey));
        }//GEN-LAST:event_txtSearchKeyPressed

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
                        java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (InstantiationException ex) {
                        java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (IllegalAccessException ex) {
                        java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                } catch (javax.swing.UnsupportedLookAndFeelException ex) {
                        java.util.logging.Logger.getLogger(Manager.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
                }
                //</editor-fold>

                /* Create and display the form */
                java.awt.EventQueue.invokeLater(new Runnable() {
                        public void run() {
                                new Manager().setVisible(true);
                        }
                });
        }

        // Variables declaration - do not modify//GEN-BEGIN:variables
        private javax.swing.JButton jButton1;
        private javax.swing.JButton jButton2;
        private javax.swing.JButton jButton3;
        private javax.swing.JLabel jLabel1;
        private javax.swing.JLabel jLabel2;
        private javax.swing.JLabel jLabel3;
        private javax.swing.JLabel jLabel4;
        private javax.swing.JLabel jLabel5;
        private javax.swing.JLabel jLabel6;
        private javax.swing.JLabel jLabel7;
        private javax.swing.JLabel jLabel8;
        private javax.swing.JLabel jLabel9;
        private javax.swing.JPanel jPanel1;
        private javax.swing.JPanel jPanel2;
        private javax.swing.JScrollPane jScrollPane1;
        private javax.swing.JTable tabloCustomer;
        private javax.swing.JTextField txtLastName;
        private javax.swing.JTextField txtName;
        private javax.swing.JTextField txtNumber;
        private javax.swing.JTextField txtPlate;
        private javax.swing.JTextField txtSearch;
        private javax.swing.JTextField txtTime;
        // End of variables declaration//GEN-END:variables
}
