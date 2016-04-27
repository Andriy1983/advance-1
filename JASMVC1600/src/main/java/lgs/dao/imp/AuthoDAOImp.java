package lgs.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lgs.dao.AuthorDAO;
import lgs.entity.Author;

@Repository
public class AuthoDAOImp implements AuthorDAO {
	@PersistenceContext
	private EntityManager manager;

	
	@Transactional
	public void insertAuthor(Author author) {
		manager.persist(author);
	}

	public Author getAuthorByID(int id) {
		return manager.find(Author.class, id);
	}

	public List<Author> getAllAuthors() {
		return manager.createQuery("from Author",Author.class).getResultList();
	}

}
