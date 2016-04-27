package lgs.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import lgs.dao.AuthorDAO;
import lgs.entity.Author;

@Service
public class AuthorService {
	@Autowired
	private AuthorDAO authorDAO;
	
	
	@Transactional
	public void insertAuthor(String name){
		Author author = new Author(name);
		authorDAO.insertAuthor(author);
	}
	
	public Author getAuthor(int id){
		return authorDAO.getAuthorByID(id);
	}
	
	
	
}
