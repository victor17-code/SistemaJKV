package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {
Connection cn = null;

public Connection conexcion() {
        try {
            Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver").newInstance();
            cn = DriverManager.getConnection("jdbc:sqlserver:SYSTEMKEL/SYSTEMKEL:1433;"
                    + "databaseName=SISVENTA;user=sa;password=system");
            
        } catch (ClassNotFoundException | InstantiationException | IllegalAccessException | SQLException e1) {
            
        }
        
        return cn;
    }

  
    
}