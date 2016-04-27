package lgs.service;

import java.util.List;

import lgs.entity.Author;

public interface AuthorService {
	void insertAuthor(String name);
	
	List<Author> getAllAuthors();
	
	Author getAuthor(int id);
	
}
