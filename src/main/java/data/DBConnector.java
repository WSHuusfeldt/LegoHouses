/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package data;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author APC
 */
public class DBConnector {
    private static final String DRIVER = "com.mysql.jdbc.Driver"; //ret
    private static final String URL = "jdbc:mysql://138.68.77.14:3306/legohouse";
    private static final String USER = "Admin";
    private static final String PASSWORD = "pass";
    private static Connection connection = null;

    public static Connection getConnection() {
        if (connection == null) {
            try {
                Class.forName(DRIVER);
                connection = DriverManager.getConnection(URL, USER, PASSWORD);
            } catch (ClassNotFoundException | SQLException ex) {
                ex.printStackTrace();
            }
        }
        return connection;
    }
    
}
