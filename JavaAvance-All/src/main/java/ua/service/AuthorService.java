package ua.service;

import java.util.List;

import ua.entity.Author;

public interface AuthorService {
	
	List<Author> MyAuthorServiceGetAllAuthors();
	List<Author> MyAuthorServiceGetAuthorsByName(String authorsName);
	List<Author> MyAuthorServiceGetAuthorsBySurname(String surname);
	Author MyAuthorServiceGetSingleAuthor(int id);
	void MyAuthorServiceAddAuthor(Author Author);
	
	
}
