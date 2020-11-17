package com.vti.backend.presentationlayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.businesslayer.UserService;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserController{

	private UserService service;

	public UserController() throws IOException, SQLException, ClassNotFoundException {
		service = new UserService();
	}

	public List<User> getUserByProjectId(int id) throws Exception {
		return service.getUserByProjectId(id);
	}

	public List<Manager> getListManager() throws Exception {
		return service.getListManager();
	}

	public User login(String email, String password) throws Exception {
		return service.login(email, password);
	}
}