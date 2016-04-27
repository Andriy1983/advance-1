package lgs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lgs.dao.AuthorDAO;
import lgs.entity.Author;

@Service
public class AuthorService {

	
	private AuthorDAO authorDAO;

	@Autowired
	public AuthorService(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}
	@Transactional
	public void inserAuthor(String name){
		Author author = new Author(name);
		authorDAO.insertAuthor(author);
		
	}
	
	
}
