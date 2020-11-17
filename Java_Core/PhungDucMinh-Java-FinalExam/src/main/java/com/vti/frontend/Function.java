package com.vti.frontend;

import com.vti.backend.presentationlayer.UserController;
import com.vti.entity.Manager;
import com.vti.entity.User;
import com.vti.utils.ScannerUtils;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

public class Function {
    private UserController userController;

    public Function() throws SQLException, IOException, ClassNotFoundException {
        userController = new UserController();
    }

    // show all user of project
    public void showUserByProjectId() throws Exception {
        System.out.print("Input id of user's project which you want to find: ");
        while (true){
            int projectId = ScannerUtils.inputInt("Invalide ID");
            List<User> users = userController.getUserByProjectId(projectId);

            try{
                for (User u : users) {
                    System.out.println(u.toString());
                }
                return;
            } catch (Exception e){
                System.err.println(e.getMessage());
            }
        }
    }

    // show manager list
    public void showAllManger() throws Exception {
        System.out.println("Show all managers");
        List<Manager> managers = userController.getListManager();
        for (Manager m : managers) {
            System.out.println(m.toString());
        }
    }

    // login
    public void login() {
        System.out.println("Login account ");
        while (true) {
            System.out.print("Pleas input your email: ");
            String email = ScannerUtils.inputEmail("Invalid email! \nPlease, reinput!");

            System.out.print("Pleas input your password: ");
            String password = ScannerUtils.inputPassword("Password length must be from 6 to 12 letters and get UPPERCASE letters! \nPlease reinput!");

            try {
                String userString = userController.login(email, password).toString();
                System.out.println(userString);
                System.out.println("Login successfull!");
                return;

            } catch (Exception e) {
                System.err.println(e.getMessage());
            }
        }
    }
}
