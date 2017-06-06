package com.jc.service;

import com.jc.domain.dao.UserDAO;
import com.jc.domain.pojo.User;

public class UserService {

	private UserDAO userDAO;

	public void setUserDAO(UserDAO userDAO) {
		this.userDAO = userDAO;
	}

	public User checkUser(String usercode, String userpswd) throws Exception {
		return userDAO.login(usercode, userpswd);
	}
}
