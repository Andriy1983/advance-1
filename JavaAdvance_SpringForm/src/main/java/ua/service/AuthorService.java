package ua.service;

import java.util.List;

import ua.dto.AuthorDTO;
import ua.entity.Author;

public interface AuthorService {
	
	void addAuthor(String name,String surname);
	Author getSingleAuthor(int id);
	List<Author> getAllAuthors();
	AuthorDTO getAuthorDTO(int id);
}
