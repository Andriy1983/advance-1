package ua.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.dao.AuthorDAO;
import ua.entity.Author;

@Repository
public class AutDaoImp implements AuthorDAO {

	@PersistenceContext
	private EntityManager entityManager;

	public void insertAuthor(Author author) {

		entityManager.persist(author);

	}

	public List<Author> getAuthors() {
		return entityManager.createQuery("from Author",Author.class).getResultList();
	}

	public Author findAuthor(int id) {
		return entityManager.find(Author.class, id);
	}

}
