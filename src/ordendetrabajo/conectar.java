/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordendetrabajo;

import java.sql.*;
import java.sql.DriverManager;
import java.sql.SQLException;
import javax.swing.*;

/**
 *
 * @author LENOVO
 */
public class conectar {
       Connection conectar=null;
    public Connection conexion(){   
        try{
            Class.forName("org.gjt.mm.mysql.Driver");//.newInstance();
            conectar=DriverManager.getConnection("jdbc:mysql://localhost/service","root","");
            //conectar=DriverManager.getConnection("jdbc:mysql://192.168.1.5:3306/personas","luis","");
    
        }catch(SQLException ex) {
             JOptionPane.showMessageDialog(null, "Error de conexion de la base de datos");
                                   }catch(ClassNotFoundException ex) {                                                                }
        return conectar;
    }
}

