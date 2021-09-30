package Modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Conexion {

    private static Connection conn;
    private static final String driver = "com.microsoft.sqlserver.jdbc.SQLServerDriver";
    private static final String user = "user";
    private static final String password = "user";
    private static final String url = "jdbc:sqlserver://localhost:1433;databaseName=SISVENTA";

    public Conexion() {
        conn = null;
        try {
            Class.forName(driver);
            conn = DriverManager.getConnection(url, user, password);
            if (conn != null) {
                System.out.println("Conexion estabecida");
            }
        } catch (ClassNotFoundException | SQLException e) {
            System.out.println("Error al conectar" + e);
        }
    }

    public Connection getConnection() {
        return conn;
    }
}
