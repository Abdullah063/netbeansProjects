/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

/**
 *
 * @author ABDULLAH
 */
public class DbConnection {

        static  String kulaniciIsmi = "root";
        static  String sifre = "alttun0";
        static  String dbUrl = "jdbc:mysql://localhost:3306/otoparkdb";
        
        public static void main(String[] args) throws SQLException {
                deleteDemo();
        }
       
        public static void deleteDemo() throws SQLException
        {
                Connection connection =null;
                PreparedStatement statement = null;
                ResultSet resultSet;
                try {
                        connection = DriverManager.getConnection(dbUrl,kulaniciIsmi,sifre);
                        System.out.println("bağlantı gerçekleşti");                  
                        
                        String delete = "delete  from tablo where plate= '48 dr' ";
                                
                        statement =connection.prepareStatement(delete);
                       
                        
                        int result = statement.executeUpdate();//id güncelemme                      
                        System.out.println("kulanıcı güncellendi ");
                        
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }finally{      
                        statement.close();
                        connection.close();
                }
        }
        public static void updateDemo() throws SQLException
        {
                Connection connection =null;
                PreparedStatement statement = null;
                ResultSet resultSet;
                try {
                        connection = DriverManager.getConnection(dbUrl,kulaniciIsmi,sifre);
                        System.out.println("bağlantı gerçekleşti");                  
                        
                        String update = "UPDATE bilgi SET Kulanici_Adi= 'enes63' WHERE  Ad_Soyad = 'enes'";
                                

                        statement =connection.prepareStatement(update);
                       
                        
                        int result = statement.executeUpdate();//id güncelemme                      
                        System.out.println("kulanıcı güncellendi ");
                        
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }finally{      
                        statement.close();
                        connection.close();
                }
        }
        public static void insertDemo() throws SQLException
        {
                Connection connection =null;
                PreparedStatement statement = null;
                ResultSet resultSet;
                try {
                        connection = DriverManager.getConnection(dbUrl,kulaniciIsmi,sifre);
                        System.out.println("bağlantı gerçekleşti");                  
                        
                        String insert = "INSERT into bilgi(Ad_Soyad,Email,Kulanici_Adi,Sifre) "
                                + "value(?,?,?,?);";

                        statement =connection.prepareStatement(insert);
                        statement.setString(1, "habib şahin");
                        statement.setString(2, "habib@gmil.com");
                        statement.setString(3, "arif");
                        statement.setString(4, "12345");
                        
                        int result = statement.executeUpdate();//id güncelemme                      
                        System.out.println("kulanıcı eklendi ");
                        
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }finally{      
                        statement.close();
                        connection.close();
                }
        }
        public static void selectDemo() throws SQLException
        {
                Connection connection =null;
                Statement statement = null;
                ResultSet resultSet;
                try {
                        connection = DriverManager.getConnection(dbUrl,kulaniciIsmi,sifre);
                        System.out.println("bağlantı gerçekleşti");
                        statement = connection.createStatement();//hangi veri tgabanına bağlanması gerektiğini belirler
                        resultSet = statement.executeQuery("select * from bilgi");//select komutu
                        
                        ArrayList<Users> user = new ArrayList<Users>();
                        
                        while (resultSet.next()) {   
                                user.add(new Users(
                                        resultSet.getString("Ad_Soyad"),
                                        resultSet.getString("Email"),
                                        resultSet.getString("Kulanici_Adi"),
                                        resultSet.getString("Sifre")
                                ));
                                System.out.println(resultSet.getString("Ad_Soyad"));
                                
                        }
                System.out.println("Kulanıcı sayısı : "+user.size());
                } catch (SQLException e) {
                        System.out.println(e.getMessage());
                }finally{       
                        connection.close();
                }
        }
}
