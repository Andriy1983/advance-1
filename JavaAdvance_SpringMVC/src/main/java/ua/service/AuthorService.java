package ua.service;

import java.util.List;

import ua.entity.Author;

public interface AuthorService {
	
	void insertAuthor(String name,String surname);
	
	List<Author> getAuthors();
	
	Author findByID(int id);

}
