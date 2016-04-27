package ua.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import ua.dto.BookDAO;
import ua.entity.Book;
import ua.service.BookService;
@Service
public class BookServiceImp implements BookService{
	@Autowired
	BookDAO bookDAO;
	
	public List<Book> MyBookServiceGetAllBooks() {
		return null;
	}

	public List<Book> MyBookServiceGetBooksByTitle() {
		// TODO Auto-generated method stub
		return null;
	}

	public Book MyBookServiceGetSingleBook(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	public void MyBookServiceAddBook(Book book) {
		// TODO Auto-generated method stub
		
	}

}
