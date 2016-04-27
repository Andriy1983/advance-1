package lgs.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import lgs.dao.BookDAO;
import lgs.entity.Book;

@Repository
public class BookDAOImp implements BookDAO{
	
	@PersistenceContext
	private EntityManager manager;

	public void inserBook(Book book) {
		manager.persist(book);
	}

	public List<Book> getAllBooks() {
		return manager.createQuery("from Book",Book.class).getResultList();
	}

}
