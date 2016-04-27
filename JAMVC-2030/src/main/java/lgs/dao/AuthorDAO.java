package lgs.dao;

import java.util.List;

import lgs.entity.Author;

public interface AuthorDAO {
	
	void insertAuthor(Author author);
	List<Author> getAllAuthors ();
	Author getAuthor(int id);

}
