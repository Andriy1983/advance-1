package ua.dao;

import java.util.List;

import ua.entity.Author;

public interface AuthorDAO {
	
	void insertAuthor(Author author);
	List<Author> getAuthors();
	Author findAuthor(int id);

}
