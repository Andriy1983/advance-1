package ua.service.imp;

import java.util.Base64;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.BookDAO;
import ua.entity.Book;
import ua.service.BookService;

@Service
public class BookServiceImp implements BookService {
	private BookDAO bookDAO;

	@Autowired
	public BookServiceImp(BookDAO bookDAO) {
		this.bookDAO = bookDAO;
	}

	@Transactional
	public void addBook(Book book) {
		
		bookDAO.save(book);

	}
	
	

	public Book getSingleBook(int id) {
		return bookDAO.findOne(id);
	}

	public List<Book> getAllBooks() {
		return bookDAO.findAll();
	}

//	@Transactional
//	public BookDTO getSingleBookDTO(int id) {
//		Book book = getSingleBook(id);
//		Author author = book.getAuthor();
//		BookDTO bookDTO = new BookDTO(book.getTitle(), author.getName(), author.getSurname());
//
//		return bookDTO;
//	}

	@Transactional
	public void mergeBook(Book book) {
			bookDAO.save(book);
	}

	public String getImg(int id) {
		
		String image = Base64.getEncoder().encodeToString(bookDAO.getImg(1));
		return image;
	}

}
