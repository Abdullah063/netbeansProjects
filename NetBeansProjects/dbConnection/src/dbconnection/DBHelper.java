/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dbconnection;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ABDULLAH
 */
public class DBHelper  {
        
        static  String kulaniciIsmi = "root";
        static  String sifre = "alttun0";
        static  String dbUrl = "jdbc:mysql://localhost:3306/library";
        public Connection getConnection() throws SQLException
        {
                return (Connection) DriverManager.getConnection(dbUrl,kulaniciIsmi,sifre);
        }
}
