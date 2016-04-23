package ua.service;

import ua.entity.User;

public interface UserService {
	
	User getUser(String username);
	void userServiceSaveUser(User user);

}
