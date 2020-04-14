package com.pactera.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.pactera.dao.UserDAO;
import com.pactera.entity.User;

@Service
public class UserService {
	
	@Autowired
	UserDAO userDAO;
	
	public User getUser(int id) {
		return userDAO.getUser(id);
	}
}
