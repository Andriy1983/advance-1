package ua.dao;

import java.util.List;

import ua.entity.Author;

public interface AuthorDAO {

	public void insertAuthor(Author author);

	public List<Author> getAuthor();

	public Author findByID(int id);

}
