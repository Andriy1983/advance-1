package ua.service.imp;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.AuthorDAO;
import ua.dto.AuthorDTO;
import ua.entity.Author;
import ua.entity.Book;
import ua.service.AuthorService;

@Service
public class AuthorServiceImp implements AuthorService {
	@Autowired
	private AuthorDAO authorDAO;

	public List<Author> authorServiceGetAllAuthors() {

		return authorDAO.findAll();
	}

	public Author authorServiceGetSingleAuthorByID(int id) {

		return authorDAO.findOne(id);
	}

	@Transactional
	public void authorServiceSaveOrUpdateAuthor(String id, String name, String surname) {
		Author author = new Author(name, surname);
		if (id != null && !id.isEmpty()) {
			author.setId(Integer.parseInt(id));
		}

		authorDAO.save(author);
	}

	@Transactional
	public void authorServiceDeleteAuthor(int id) {
		authorDAO.delete(id);
	}

	public AuthorDTO authorServiceGetAuthorBookList(int id) {
		Author author = authorServiceGetSingleAuthorByID(id);
		List<String> titles = new ArrayList<String>();
		List<String> descriptions = new ArrayList<String>();
		List<String> years = new ArrayList<String>();

		List<Book> books = author.getBooks();
		for (Book book : books) {
			titles.add(book.getTitle());
			descriptions.add(book.getDescription());
			years.add(String.valueOf(book.getYear()));
		}

		return new AuthorDTO(author.getId(), author.getName(), author.getSurname(), titles, descriptions, years);
	}

}
