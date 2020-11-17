package com.vti.backend.datalayer;

import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

import com.vti.entity.Employee;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.JDBCUtils;


public class UserRepository implements IUserRepository {
    private Connection connection;
    private JDBCUtils jdbcUtils;

    public UserRepository() throws IOException, SQLException, ClassNotFoundException {
        jdbcUtils = new JDBCUtils();
    }

    @Override
    public List<User> getUserByProjectId(int ID) throws Exception {
        List<User> users = new ArrayList<>();
        try {
            connection = jdbcUtils.connect();

            // get manager in project
            String sql1 = "SELECT m.* FROM project p\n" +
                    "INNER JOIN manager m ON m.id = p.idManager\n" +
                    "WHERE p.projectId = ?   \n" +
                    "GROUP BY m.id;";
            PreparedStatement preparedStatement1 = connection.prepareStatement(sql1);
            preparedStatement1.setInt(1, ID);

            ResultSet resultSet = preparedStatement1.executeQuery();

            // add into list
            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String fullName = resultSet.getString(2);
                String email = resultSet.getString(3);
                String password = resultSet.getString(4);
                int expInYear = resultSet.getInt(5);

                User user = new Manager(id, fullName, email, password, expInYear);

                users.add(user);
            }

            // get all employees in project
            String sql2 = "" +
                    "SELECT e.* FROM project p\n" +
                    "INNER JOIN employee e ON e.id = p.idEmployee\n" +
                    "WHERE p.projectId = ? \n" +
                    "GROUP BY e.id;";
            PreparedStatement preparedStatement2 = connection.prepareStatement(sql2);
            preparedStatement2.setInt(1, ID);

            ResultSet resultSet2 = preparedStatement2.executeQuery();

            // add into list
            while (resultSet2.next()) {
                int id = resultSet2.getInt(1);
                String fullName = resultSet2.getString(2);
                String email = resultSet2.getString(3);
                String password = resultSet2.getString(4);
                String proSkill = resultSet2.getString(5);

                User user = new Employee(id, fullName, email, password, ID, proSkill);

                users.add(user);
            }

        } finally {
            connection.close();
        }
        return users;
    }

    @Override
    public List<Manager> getListManager() throws Exception {
        List<Manager> managers = new ArrayList<>();
        try {
            connection = jdbcUtils.connect();

            String sql = "SELECT * FROM manager";
            Statement statement = connection.createStatement();

            ResultSet resultSet = statement.executeQuery(sql);

            while (resultSet.next()) {
                int id = resultSet.getInt(1);
                String fullName = resultSet.getString(2);
                String email = resultSet.getString(3);
                String password = resultSet.getString(4);
                int expInYear = resultSet.getInt(5);

                Manager manager = new Manager(id, fullName, email, password, expInYear);
                managers.add(manager);
            }
            return managers;
        } finally {
            connection.close();
        }
    }

    @Override
    public User login(String email, String password) throws Exception {
        try {
            connection = jdbcUtils.connect();

            String sql = "SELECT id, fullname, email, `password` FROM manager\n" +
                    "WHERE email = ? AND  `password` = ?\n" +
                    "union all\n" +
                    "SELECT id, fullname, email, `password` FROM employee\n" +
                    "WHERE email = ? AND  `password` = ?;";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);

            preparedStatement.setString(1, email);
            preparedStatement.setString(2, password);
            preparedStatement.setString(3, email);
            preparedStatement.setString(4, password);


            ResultSet resultSet = preparedStatement.executeQuery();

            if (resultSet.next()) {
                int id = resultSet.getInt(1);
                String fullName = resultSet.getString(2);

                User user = new User(id, fullName, email, password);
                return user;
            } else {
                throw new Exception("\n Unavailable user !");
            }
        } finally {
            connection.close();
        }
    }
}
