package ua.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.AuthorDAO;
import ua.entity.Author;

@Repository
public class AuthorDAOImp implements AuthorDAO {
	@PersistenceContext
	EntityManager entityManager;

	@Transactional
	public void addAuthor(Author author) {

		entityManager.persist(author);
	}

	public Author getSingleAuthor(int id) {
		return entityManager.find(Author.class, id);
	}

	public List<Author> getAllAuthors() {
		return entityManager.createQuery("from Author",Author.class).getResultList();
	}


}
