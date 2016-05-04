package lgs.service.imp;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lgs.dao.AuthorDAO;
import lgs.entity.Author;
import lgs.service.AuthorService;

@Service
public class AuthorServiceImp implements AuthorService{
	@Autowired
	private AuthorDAO authorDAO;

	@Transactional
	public void insertAuthor(String name) {
		authorDAO.insertAuthor(new Author(name));
	}

	public Author getAuthorByID(int id) {
		return authorDAO.getAuthorByID(id);
	}

	public List<Author> getAllAuthors() {
		return authorDAO.getAllAuthors();
	}
	
}
