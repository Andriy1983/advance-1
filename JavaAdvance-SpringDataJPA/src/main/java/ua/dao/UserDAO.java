package ua.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.User;

public interface UserDAO extends JpaRepository<User, Integer>{
	
	@Query("select u from User u where u.username like :username")
	User getUser(@Param("username")String username); 

}
