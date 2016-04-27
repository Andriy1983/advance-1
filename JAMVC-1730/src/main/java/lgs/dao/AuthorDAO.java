package lgs.dao;

import java.util.List;

import lgs.entity.Author;

public interface AuthorDAO {
	
	void insertAuthor(Author author);
	Author getAuthorByID(int id);
	List<Author> getAllAuthors();

}
