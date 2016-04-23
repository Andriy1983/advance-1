package ua.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import ua.dto.BookDTO;
import ua.entity.Author;
import ua.entity.Book;

public interface BookService {

	/* user + admin */

	List<Book> bookserviceFindBooksByTitle(String title);

	List<Book> bookServiceGetAllBooks();

	/* admin */
	void bookServiceSaveOrUpdateBook(String id,String title, String description, short year, List<Author> authors);
	
	void bookServiceDeleteBook(int id);
	
	List<BookDTO> bookServiceGetAllBooksWithAuthors();
	
	List<BookDTO> bookServiceGetAllBooksWithAuthorsByTitle(String title);
	
	Book bookServiceFindBookByID(int id);
}
