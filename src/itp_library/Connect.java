package itp_library;

import java.sql.*;

public class Connect {
     public static Connection getConnection(){
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost/bd_ds", "root", "");
            return   conn;
        } catch (SQLException e) {
            System.out.println("Error en conexión local " + e);
        }
        return (null);
    }
}

        