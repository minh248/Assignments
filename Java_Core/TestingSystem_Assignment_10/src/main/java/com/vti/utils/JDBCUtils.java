package com.vti.utils;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

public class JDBCUtils {
    private Properties properties;
    private Connection connection;

    public JDBCUtils() throws IOException, ClassNotFoundException, SQLException {
        properties = new Properties();
        properties.load(new FileInputStream("src/main/resource/com/config.properties"));
        connect();
    }

    public Connection connect() throws SQLException, ClassNotFoundException {
        if (connection != null && !connection.isClosed()) {
            return connection;
        }

        String url = properties.getProperty("URL");
        String username = properties.getProperty("USERNAME");
        String password = properties.getProperty("PASSWORD");
        String driver = properties.getProperty("DRIVER");

        Class.forName(driver);

        connection = DriverManager.getConnection(url, username, password);
        return connection;
    }

    public void connectForTesting() throws SQLException {

        String url = properties.getProperty("URL");
        String username = properties.getProperty("USERNAME");
        String password = properties.getProperty("PASSWORD");
        String driver = properties.getProperty("DRIVER");

        connection = DriverManager.getConnection(url, username, password);

        System.out.println("Connect success!");
    }



    public void disconnect() throws SQLException {
        connection.close();
    }
}
