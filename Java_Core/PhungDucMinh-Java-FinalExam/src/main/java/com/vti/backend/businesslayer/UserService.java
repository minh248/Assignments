package com.vti.backend.businesslayer;

import java.io.IOException;
import java.sql.SQLException;
import java.util.List;

import com.vti.backend.datalayer.UserRepository;
import com.vti.entity.Manager;
import com.vti.entity.User;

public class UserService implements IUserService{

	private UserRepository repository;

	public UserService() throws IOException, SQLException, ClassNotFoundException {
		repository = new UserRepository();
	}

	@Override
	public List<User> getUserByProjectId(int id) throws Exception {
		return repository.getUserByProjectId(id);
	}

	@Override
	public List<Manager> getListManager() throws Exception {
		return repository.getListManager();
	}

	@Override
	public User login(String email, String password) throws Exception {
		return repository.login(email, password);
	}
}
