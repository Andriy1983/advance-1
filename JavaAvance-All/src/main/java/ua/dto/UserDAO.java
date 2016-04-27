package ua.dto;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.User;

public interface UserDAO extends JpaRepository<User,Integer> {
	
	@Query(value="select a from User a where name like:username")
	User MyUserGetSingleUserByName(@Param("username")String username);
	
}
