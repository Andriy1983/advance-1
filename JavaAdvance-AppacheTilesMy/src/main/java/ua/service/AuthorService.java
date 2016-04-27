package ua.service;

import java.util.List;

import ua.dto.AuthorDTO;
import ua.entity.Author;

public interface AuthorService {
	void insertAuthor(String name,String surname);

	List<Author> getAuthors();

	Author findAuthors(int id);

	public List<AuthorDTO> authorsWithBook();
}
