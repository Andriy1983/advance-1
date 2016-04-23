package ua.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.Author;

public interface AuthorDAO extends JpaRepository<Author, Integer>{
	/*user + admin*/
	@Query(value="select a from Author a where a.id =:id")
	Author authorDAOgetSingleAuthor(@Param("id")int id);
	
	
	

	
	

}
