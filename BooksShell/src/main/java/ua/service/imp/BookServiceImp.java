package ua.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import antlr.collections.impl.LList;
import ua.dao.BookDAO;
import ua.dto.BookDTO;
import ua.entity.Author;
import ua.entity.Book;
import ua.service.BookService;

@Service
public class BookServiceImp implements BookService {
	@Autowired
	private BookDAO bookDAO;

	public List<Book> bookserviceFindBooksByTitle(String title) {

		return bookDAO.bookDAOfindBooksByTitle(title);
	}

	public List<Book> bookServiceGetAllBooks() {
		return bookDAO.findAll();
	}

	public void bookServiceSaveOrUpdateBook(Book book) {
		bookDAO.save(book);
	}

	@Transactional
	public void bookServiceSaveOrUpdateBook(String id, String title, String description, short year,
			List<Author> authors) {
		Book book = new Book(title, description, year, authors);
		if (id != null && !id.isEmpty()) {
			book.setId(Integer.parseInt(id));
		}
		bookDAO.save(book);
	}

	@Transactional
	public void bookServiceDeleteBook(int id) {
		bookDAO.delete(id);

	}

	public List<BookDTO> bookServiceGetAllBooksWithAuthors() {

		List<BookDTO> bookDTOs = new ArrayList<BookDTO>();
		List<Book> books = bookServiceGetAllBooks();

		for (Book book : books) {
			List<String> temp = new ArrayList<String>(); // емкость для имен
			List<Author> authors = book.getAuthors(); // список авторов данной
														// книги

			for (Author author : authors) {
				temp.add(author.getName() + " " + author.getSurname());
			}
			bookDTOs.add(new BookDTO(book.getId(), book.getTitle(), book.getDescription(), book.getYear(), temp));

		}

		return bookDTOs;

	}

	public List<BookDTO> bookServiceGetAllBooksWithAuthorsByTitle(String title) {
		BookDTO bookDTO = null;
		List<BookDTO> bookDTOs = new ArrayList<BookDTO>();

		List<Book> books = bookserviceFindBooksByTitle(title);
		for (Book book : books) {
			List<Author> authors = book.getAuthors();
			List<String> names = new ArrayList<String>();
			for (Author author : authors) {
				String nameAndSurname = author.getName() + " " + author.getSurname();
				names.add(nameAndSurname);
			}
			bookDTOs.add(new BookDTO(book.getId(), book.getTitle(), book.getDescription(), book.getYear(), names));

		}

		return null;
	}

	public Book bookServiceFindBookByID(int id) {

		return bookDAO.findOne(id);
	}

	/* delete */

}
