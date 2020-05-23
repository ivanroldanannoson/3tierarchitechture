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
 * @author ivanroldan
 */
public class DBConnection {

    private static DBConnection instance;
    private final String username = "root";
    private final String password = "123456";
    private final String url = "jdbc:mysql://localhost/black_lotus?&useSSL=false";
    Connection conn;

    public static DBConnection getInstance() throws SQLException {
        if (instance == null) {
            instance = new DBConnection();
        } else if (instance.getConnection().isClosed()) {
            instance = new DBConnection();
        }

        return instance;
    }

    public Connection getConnection() {
        try {
            Class.forName("com.mysql.jdbc.Driver");
            conn = DriverManager.getConnection(url, username, password);
        } catch (ClassNotFoundException e) {
            System.out.println("Cannot load JDBC driver");
        } catch (SQLException e) {
            if (e.getErrorCode() == 1044) {
                System.out.println("Wrong username or password");
            } else if (e.getErrorCode() == 1049) {
                System.out.println("Wrong schema");
            }
        } catch (Exception e) {
            System.out.println("Wrong schema");
        }
        return conn;
    }

}
