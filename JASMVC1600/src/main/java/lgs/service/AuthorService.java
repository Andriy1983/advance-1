package lgs.service;

import java.util.List;

import lgs.entity.Author;

public interface AuthorService {

	
	void inserAuthor(String name);
	Author getAuthorByID(int id);
	List<Author> getAllAuthors();
}
