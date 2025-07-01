/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package registerAndLoginForm;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Admin
 */
public class Dbc {
    
      public static Connection connectTOCB(){
        
        try {
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/noone", "root","");
            return con;
            
        }catch(SQLException ex){
            Logger.getLogger(Dbc.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
