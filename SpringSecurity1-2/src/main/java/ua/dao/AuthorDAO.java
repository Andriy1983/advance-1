package ua.dao;

import java.util.List;

import ua.entity.Author;

public interface AuthorDAO {
	
	void addAuthor(Author author);
	Author getSingleAuthor(int id);
	List<Author> getAllAuthors();
	
	void mergeAuthor(Author author);
	

}
