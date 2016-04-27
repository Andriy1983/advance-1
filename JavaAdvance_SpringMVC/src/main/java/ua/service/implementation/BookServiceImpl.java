package ua.service.implementation;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Hibernate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.BookDAO;
import ua.dto.BookAllDTO;
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
		Author author = authorService.findByID(authorId);
		Book book = new Book(bookName);
		book.setAuthor(author);
		bookDAO.insertBook(bookName);
	
	}
	
	@Transactional
	public List<BookAllDTO> getBooks() {
		List<BookAllDTO> list = new ArrayList<BookAllDTO>();
		List<Book> books = bookDAO.getBooks();
		
		for (Book book : books) {
			if(book.getAuthor()==null){
			list.add(new BookAllDTO(book.getTitle(), "none", "none",book.getId_book()));
			}else{
				list.add(new BookAllDTO(book.getTitle(), book.getAuthor().getName(), book.getAuthor().getSurname(),book.getId_book()));
			}
		}
		return list ;
		
	}

	public Book findByID(int id) {
		Book book = bookDAO.findBookById(id);
		Hibernate.initialize(book.getAuthor());
		return book;
	}

	

}
