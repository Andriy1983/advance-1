package lgs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lgs.dao.BookDAO;
import lgs.entity.Book;

@Service
public class BookService {
	
	@Autowired
	private BookDAO bookDAO;
	
	
	
	public void insertBook(String title){
		Book book = new Book(title);
		bookDAO.inserBook(book);
	}
	
	public Book getBookByID(int id){
		return bookDAO.getBookByID(id);
	}

}
