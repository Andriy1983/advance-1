package ua.dao;

import java.util.List;

import ua.entity.Author;

public interface AuthorDAO {

	 void insertAuthor(String name, String surname);

	 List<Author> getAuthor();

	 Author findByID(int id);

}
