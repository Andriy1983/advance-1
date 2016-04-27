package ua.service;

import java.util.List;

import ua.entity.Author;

public interface AuthorService {
	
	void saveAuthor(String name,String surname);
	
	List<Author> showAuthors();
	
	Author getAuthorByID(int id);

}
