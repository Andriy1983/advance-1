package ua.service;

import java.util.List;

import ua.dto.AuthorDTO;
import ua.entity.Author;

public interface AuthorService {

	List<Author> authorServiceGetAllAuthors();

	Author authorServiceGetSingleAuthorByID(int id);

	void authorServiceSaveOrUpdateAuthor(String id, String name, String surname);

	void authorServiceDeleteAuthor(int id);
	
	AuthorDTO authorServiceGetAuthorBookList(int id);
	
}
