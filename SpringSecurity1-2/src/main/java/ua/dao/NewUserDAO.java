package ua.dao;

import ua.entity.NewUser;

public interface NewUserDAO {

	void insertUser(NewUser newUser);
	NewUser getUser(String name);
}
