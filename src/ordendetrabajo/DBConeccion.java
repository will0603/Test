
package ordendetrabajo;


import java.sql.Connection;
import java.sql.DriverManager;
import javax.swing.JOptionPane;

public class DBConeccion {
    private static String DRIVER  ="com.mysql.jdbc.Driver";
    private static String USUARIO ="root";
    private static String PASSWORD="123456789";
    private static String URL     ="jdbc:mysql://localhost:3306/workorder";
    
    static{
        try{
            Class.forName(DRIVER);
        } catch(ClassNotFoundException e){
            JOptionPane.showMessageDialog(null,"ERROR EN EL DRIVER: "+e);
        }
    }
    
    public Connection getConnection(){
            Connection con = null;
            try{
                con = DriverManager.getConnection(URL, USUARIO, PASSWORD);
                JOptionPane.showMessageDialog(null, "Conexion Exitosa");
            } catch(Exception e){
                JOptionPane.showMessageDialog(null, "Error en la Conexion"+e);
            }
            return con;
    }
}
