package ua.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.AuthorDAO;
import ua.dto.AuthorDTO;
//import ua.dto.AuthorDTO;
import ua.entity.Author;
import ua.entity.Book;
import ua.service.AuthorService;

@Service
public class AuthorServiceImp implements AuthorService {

	private AuthorDAO authorDAO;

	@Autowired
	public AuthorServiceImp(AuthorDAO authorDAO) {
		super();
		this.authorDAO = authorDAO;
	}

	@Transactional
	public void addAuthor(Author author) {
		authorDAO.save(author);
	}

	public Author getSingleAuthor(int id) {

		return authorDAO.findOne(id);
	}

	public List<Author> getAllAuthors() {

		return authorDAO.findAll();
	}

	// @Transactional
	// public AuthorDTO getAuthorDTO(int id) {
	// Author author = getSingleAuthor(id);
	// List<Book> books = author.getBooks();
	// List<String> booksTitle= new ArrayList<String>();
	// for (Book book : books) {
	// booksTitle.add(book.getTitle());
	// }
	// AuthorDTO authorDTO = new AuthorDTO(author.getName(),
	// author.getSurname(), booksTitle);
	//
	// return authorDTO;
	// }

	@Transactional
	public AuthorDTO getAuthorDTO(int id) {
		Author author = getSingleAuthor(id);
		List<Book> books = author.getBooks();
		List<String> titles = new ArrayList<String>();
		for (Book book : books) {
			titles.add(book.getTitle());
		}

		AuthorDTO authorDTO = new AuthorDTO(author.getName(), author.getSurname(), titles);
		return authorDTO;
	}

	@Transactional
	public void mergeAuthor(Author author) {
		authorDAO.save(author);
	}

}
