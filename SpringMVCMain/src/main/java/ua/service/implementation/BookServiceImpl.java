package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.BookDAO;
import ua.entity.Author;
import ua.entity.Book;
import ua.service.AuthorService;
import ua.service.BookService;

@Service
public class BookServiceImpl implements BookService {

	private BookDAO bookDAO;
	private AuthorService authorService;
	
	@Autowired
	public BookServiceImpl(BookDAO bookDAO,AuthorService authorService) {
		this.bookDAO = bookDAO;
		this.authorService = authorService;
	}

	@Transactional
	public void insertBook(String bookName, int authorId) {
		Author author = authorService.getAuthorByID(authorId);
		Book book = new Book(bookName);
		book.setAuthor(author);
		bookDAO.insertBook(book);
	
	}

	public List<Book> showBooks() {
		return bookDAO.getBooks();
	}

	public Book findBookById(int id) {
		return bookDAO.findBookById(id);
	}

}
