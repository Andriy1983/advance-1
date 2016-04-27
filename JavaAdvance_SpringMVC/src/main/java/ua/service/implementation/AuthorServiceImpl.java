package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.AuthorDAO;
import ua.entity.Author;
import ua.service.AuthorService;

@Service 
public class AuthorServiceImpl implements AuthorService{

	
	private AuthorDAO authorDAO;

	
	@Autowired 
	public AuthorServiceImpl(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}

	@Transactional
	public void insertAuthor(String name, String surname) {
		authorDAO.insertAuthor(name,surname);
		
		
	}

	
	public List<Author> getAuthors() {
		return authorDAO.getAuthor();
	}


	public Author findByID(int id) {
		return authorDAO.findByID(id);
	}


	




	


	

}
