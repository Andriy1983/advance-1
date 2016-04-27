package ua.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.dao.BookDAO;
import ua.entity.Book;

@Repository
public class BookDAOImp implements BookDAO {
	@PersistenceContext
	EntityManager entityManager;

	public void addBook(Book book) {
		entityManager.persist(book);

	}

	public Book getSingleBook(int id) {
		return entityManager.find(Book.class, id);
	}

	public List<Book> getAllBooks() {
		return entityManager.createQuery("from Book", Book.class).getResultList();
	}

	public void mergeBook(Book book) {
		entityManager.merge(book);
	}

}
