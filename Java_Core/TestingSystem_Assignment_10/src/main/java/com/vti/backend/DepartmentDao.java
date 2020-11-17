package com.vti.backend;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;
import com.vti.entity.Department;
import com.vti.utils.JDBCUtils;
import com.vti.utils.ScannerUtils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class DepartmentDao {
    private JDBCUtils jdbcUtils;

    public DepartmentDao() throws ClassNotFoundException, IOException, SQLException {
        jdbcUtils = new JDBCUtils();
    }

    public List<Department> getDepartments() throws ClassNotFoundException, SQLException {

        List<Department> departments = new ArrayList<>();

        Connection connection = jdbcUtils.connect();

        Statement statement = connection.createStatement();

        String sql = "SELECT * FROM Department";
        ResultSet resultSet = statement.executeQuery(sql);

        while (resultSet.next()) {
            Department department = new Department();
            department.setId(resultSet.getInt("DepartmentId"));
            department.setName(resultSet.getString("DepartmentName"));

            departments.add(department);
        }

        jdbcUtils.disconnect();

        return departments;
    }

    public Department getDepartmentByID(int id) throws Exception {
        Connection connection = jdbcUtils.connect();

        String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            Department department = new Department();
            department.setId(resultSet.getInt("DepartmentId"));
            department.setName(resultSet.getString("DepartmentName"));

            jdbcUtils.disconnect();
            return department;

        } else {
            jdbcUtils.disconnect();
            throw new Exception("Cannot find department by Id: " + id);
        }
    }

    public Department getDepartmentByIDusingScanner() throws Exception {
        Connection connection = jdbcUtils.connect();

        String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        int id = ScannerUtils.inputInt("Invalid input! Please, reinput.");
        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()) {
            Department department = new Department();
            department.setId(resultSet.getInt("DepartmentId"));
            department.setName(resultSet.getString("DepartmentName"));

            jdbcUtils.disconnect();
            return department;

        } else {
            jdbcUtils.disconnect();
            throw new Exception("Cannot find department by Id: " + id);
        }
    }

    public boolean isDepartmentNameExistsByName(String name) throws SQLException, ClassNotFoundException {
        Connection connection = jdbcUtils.connect();

        String sql = "SELECT * FROM Department WHERE DepartmentName = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, name);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){
            jdbcUtils.disconnect();
            return true;
        } else {
            jdbcUtils.disconnect();
            return false;
        }
    }

    public boolean isDepartmentNameExistsById(int id) throws SQLException, ClassNotFoundException {
        Connection connection = jdbcUtils.connect();

        String sql = "SELECT * FROM Department WHERE DepartmentId = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, id);

        ResultSet resultSet = preparedStatement.executeQuery();

        if (resultSet.next()){
            jdbcUtils.disconnect();
            return true;
        } else {
            jdbcUtils.disconnect();
            return false;
        }
    }


    public void createDepartment(String name) throws Exception {
        if (isDepartmentNameExistsByName(name)) {
            throw new Exception("Department name is exists: " + name);
        }

        Connection connection = jdbcUtils.connect();

        String sql = "	INSERT INTO Department (DepartmentName)" + "VALUE(?)";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, name);

        preparedStatement.executeUpdate();

        jdbcUtils.disconnect();
    }

    public void updateDepartment(int id, String newName) throws SQLException, Exception {
        if (!isDepartmentNameExistsById(id)) {
            throw new Exception("Cannot find department by Id" + id);
        }

        Connection connection = jdbcUtils.connect();

        String sql = "	UPDATE Department SET DepartmentName = ? WHERE DepartmentId = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setString(1, newName);
        preparedStatement.setInt(2, id);

        preparedStatement.executeUpdate();

        jdbcUtils.disconnect();
    }

    public void deleteDepartment(int id) throws Exception {
        if (!isDepartmentNameExistsById(id)) {
            throw new Exception("cannot find department by ID:"+ id);
        }

        Connection connection = jdbcUtils.connect();

        String sql = "DELETE FROM Department WHERE DepartmentID = ?";
        PreparedStatement preparedStatement = connection.prepareStatement(sql);

        preparedStatement.setInt(1, id);

        preparedStatement.executeUpdate();

        jdbcUtils.disconnect();
    }
}
