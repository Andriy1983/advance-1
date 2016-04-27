package ua.serv.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.dao.BookDAO;
import ua.entity.Book;
import ua.service.BookService;

@Service
public class BookServImpl implements BookService {

	private BookDAO bookDAO;

	@Autowired
	public BookServImpl(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	public void insertBook(String title) {
		Book book = new Book(title);
		bookDAO.insertBook(book);
	}

	public List<Book> getBooks() {
		return bookDAO.getBooks();
	}

	public Book findBook(int id) {
		return bookDAO.findBook(id);
	}

}
