package ua.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.dao.AuthorDAO;
import ua.entity.Author;

@Repository //вместо того чтобі писать бин по данному дао классу
public class AuthorDAOImpl implements AuthorDAO {
	
	@PersistenceContext // то что под ним, надо заполнить entityManager`ом из
						// entityManagerFactory
	//специально для entityManager
	private EntityManager entityManager /* = context.getBean(EntityManager.class);*/ ;

	public void insertAuthor(Author author) {

		entityManager.persist(author);

	}

	public List<Author> getAuthor() {
		
		return entityManager.createQuery("from Author",Author.class).getResultList();
	}

	public Author findByID(int id) {
		
		return entityManager.find(Author.class, id);
	}

}
