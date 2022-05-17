
package pe.edu.upeu.ws01.config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Copito
 */
public class Conexion {
    private static final String URL ="jdbc:mysql://localhost:3306/bdsoap";
    private static final String  DRIVER ="com.mysql.cj.jdbc.Driver";
    private static final String PASS="1234";
    private static final String USER="root";
    private static Connection cx = null;
    
    public static Connection getConex(){
        try {
            Class.forName(DRIVER);
            if(cx==null){
                cx = DriverManager.getConnection(URL, USER, PASS);
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error:"+e);
        }
        return cx;
    }
}
