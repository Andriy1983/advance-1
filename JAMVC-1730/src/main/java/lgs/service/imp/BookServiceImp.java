package lgs.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lgs.dao.BookDAO;
import lgs.entity.Book;
import lgs.service.BookService;

@Service
public class BookServiceImp implements BookService  {
	
	@Autowired
	private BookDAO bookDAO;
	@Transactional
	public void insertBook(String title) {
			bookDAO.insertBook(new Book(title));
	}

	public Book getBookByID(int id) {
		return bookDAO.getBookByID(id);
	}

	public List<Book> getAllBooks() {
		return bookDAO.getAllBooks();
	}
	
	

}
