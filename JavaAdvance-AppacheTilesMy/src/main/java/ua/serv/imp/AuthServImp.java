package ua.serv.imp;

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
public class AuthServImp implements AuthorService {

	private AuthorDAO authorDAO;

	@Autowired
	public AuthServImp(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

	@Transactional
	public void insertAuthor(String name, String surname) {
		Author author = new Author(name, surname);
		authorDAO.insertAuthor(author);
	}

	public List<Author> getAuthors() {
		return authorDAO.getAuthors();
	}

	public Author findAuthors(int id) {
		return authorDAO.findAuthor(id);
	}

	@Transactional
	public List<AuthorDTO> authorsWithBook() {
		
		List<AuthorDTO> dtos = new ArrayList<AuthorDTO>();
		List<Author> authors=authorDAO.getAuthors();
		for (Author author : authors) {
			List<String> booksTitle = new ArrayList<String>();
			for (Book book : author.getBooks()) {
				booksTitle.add(book.getTitle());
			}
			
			dtos.add(new AuthorDTO(author.getId(), author.getName(), author.getSurname(),booksTitle));
		}
		return dtos;
	}
	
	

}
