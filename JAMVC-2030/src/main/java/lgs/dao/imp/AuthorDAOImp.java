package lgs.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import lgs.dao.AuthorDAO;
import lgs.entity.Author;

@Repository
public class AuthorDAOImp implements AuthorDAO{
	@PersistenceContext
	private EntityManager manager;

	public void insertAuthor(Author author) {
		manager.persist(author);
		
	}

	public List<Author> getAllAuthors() {
		return manager.createQuery("from Author",Author.class).getResultList();
	}
	
	
	
	
}
