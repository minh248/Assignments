package com.vti.backend.datalayer;

import com.vti.entity.Manager;
import com.vti.entity.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserRepository {
    List<User> getUserByProjectId(int id) throws Exception;

    List<Manager> getListManager() throws Exception;

    User login(String email, String password) throws Exception;
}
