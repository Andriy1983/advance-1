package ua.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dto.AuthorDAO;
import ua.entity.Author;
import ua.service.AuthorService;

@Service
public class AuthorServiceImp implements AuthorService {
	@Autowired
	AuthorDAO authorDAO;

	public List<Author> MyAuthorServiceGetAllAuthors() {
		return authorDAO.findAll();
	}

	public List<Author> MyAuthorServiceGetAuthorsByName(String authorsName) {
		return authorDAO.MyAuthorServiceGetAuthorsByName(authorsName);
	}

	public List<Author> MyAuthorServiceGetAuthorsBySurname(String surname) {
		return authorDAO.MyAuthorServiceGetAuthorsBySurname(surname);
	}

	public Author MyAuthorServiceGetSingleAuthor(int id) {
		return authorDAO.findOne(id);
	}

	@Transactional
	public void MyAuthorServiceAddAuthor(Author author) {
		authorDAO.save(author);
	}

}
