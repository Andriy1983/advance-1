package lgs.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import lgs.entity.Author;

@Repository
public class AuthorDAO {
	@PersistenceContext
	private EntityManager manager;

	public void insertAuthor(Author author){
		manager.persist(author);
	}
	
	public Author getAuthorByID(int id){
		return manager.find(Author.class, id);
	}
	
}
