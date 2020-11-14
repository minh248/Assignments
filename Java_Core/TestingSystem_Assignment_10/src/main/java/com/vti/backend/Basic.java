package com.vti.backend;

import com.vti.utils.ScannerUtils;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.Arrays;
import java.util.Properties;

public class Basic {
    private Properties properties;
    private Connection connection;

    public Basic() throws IOException {
        properties = new Properties();

        properties.load(new FileInputStream(
                "src\\main\\java\\resource\\config.properties"));
    }

    // connection
    public void question1() throws SQLException {
        String url = properties.getProperty("URL");
        String username = properties.getProperty("USERNAME");
        String password = properties.getProperty("PASSWORD");

        try {
            connection = DriverManager.getConnection(url, username, password);
        } catch (Exception e) {
            System.out.println(Arrays.toString(e.getStackTrace()));
        }
    }

    // print position information
    public void question2() throws SQLException {
        Statement statement = connection.createStatement();
        ResultSet result = statement.executeQuery("SELECT  * FROM positions");

        while (result.next()) {
            System.out.println("ID: " + result.getInt(1) + " | " + "Position: " + result.getString(2));
        }
    }

    // insert position by name
    public int question3() throws SQLException {
        String sql = "INSERT INTO Positions (PositionName) VALUES (?)";
        PreparedStatement statement = connection.prepareStatement(sql);

        statement.setString(1, ScannerUtils.inputString("Please, input string"));

        return statement.executeUpdate();
    }

    // change name of position which have id equal to 5 into "Develop"
    public int question4() throws SQLException {
        String sql = "INSERT INTO Positions SET PositionName = \"Develop\" WHERE PositionID = 5";
        PreparedStatement statement = connection.prepareStatement(sql);

        return statement.executeUpdate();
    }

    public int question5(){

        return 1;
    }
}
