/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package codigo_farmacia;
import java.sql.*;
import javax.swing.JOptionPane;

/**
 *
 * @author LuisA
 */
public class conexion {
    
        Connection conectar=null;
        public Connection conectar(){
            try{
                 Class.forName("com.mysql.jdbc.Driver");
                        conectar=DriverManager.getConnection("jdbc:mysql://localhost:3306/farmacia","root","");
                        JOptionPane.showMessageDialog(null,"Conexion exitosa","Conexion",JOptionPane.INFORMATION_MESSAGE);
            }catch(ClassNotFoundException | SQLException e){
                           JOptionPane.showMessageDialog(null,"Conexion"+e,"Conexion",JOptionPane.ERROR_MESSAGE);
                           } 
                        return conectar;
            
            }
        }

