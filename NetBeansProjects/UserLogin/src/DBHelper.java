/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ABDULLAH
 */
public class DBHelper  {
        
        public static final String kullanici_adi="root";
        public static final String parola ="alttun0";
        public static final String db_isim="users";
        public static final String host="localhost";
        public static final int port =3306; 
        String dbUrl="jdbc:mysql://" + host + ":" + port + "/" + db_isim ;
        public Connection getConnection() throws SQLException
        {
                return DriverManager.getConnection(dbUrl,kullanici_adi,parola);
        }
        public void showErorMesage(SQLException e)
        {
                System.out.println("Error : "+e.getMessage());
                System.out.println("Error code : "+e.getErrorCode());
        }

        void showErorMesage(Exception e) {
                throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        }
        
}

