package ua.service;

import java.util.List;

import ua.dto.AuthorDTO;
//import ua.dto.AuthorDTO;
import ua.entity.Author;

public interface AuthorService {
	
	void addAuthor(Author author);
	Author getSingleAuthor(int id);
	List<Author> getAllAuthors();
	
	AuthorDTO getAuthorDTO(int id);
	
	void mergeAuthor(Author author);
}
