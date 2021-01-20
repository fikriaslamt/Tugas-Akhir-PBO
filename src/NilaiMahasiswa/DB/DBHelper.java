/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package NilaiMahasiswa.DB;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author ASUS
 */
public class DBHelper {
    
    private static final String USER = "root";
    private static final String PASSWORD = "";
    private static final String DB = "nilaimahasiswa";
    private static final String MYCONN = "jdbc:mysql://localhost/" + DB;
    
    public static Connection getConnection(String driver) throws SQLException{
        Connection con = null;
        switch(driver){
            case "MYSQL": {
                try {
                    Class.forName("com.mysql.jdbc.Driver");           
                    DriverManager.getConnection(MYCONN,USER,PASSWORD);
                    }catch (ClassNotFoundException ex){
                        System.out.println("Library tidak ada");
                        Logger.getLogger(DBHelper.class.getName()).log(Level.SEVERE, null, ex);
                    }
                break;
            }
            
        }
        return con;
    }
    
    
}
