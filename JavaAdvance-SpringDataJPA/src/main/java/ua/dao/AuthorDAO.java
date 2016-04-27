package ua.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Author;

public interface AuthorDAO extends JpaRepository<Author, Integer>{
	
	
	

}
