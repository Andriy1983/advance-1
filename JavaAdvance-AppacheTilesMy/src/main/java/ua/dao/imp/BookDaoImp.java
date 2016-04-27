package ua.dao.imp;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.dao.BookDAO;
import ua.entity.Book;

@Repository
public class BookDaoImp implements BookDAO{
	
	@PersistenceContext
	private EntityManager entityManager ;

	public void insertBook(Book book) {
		entityManager.persist(book);
		
	}

	public List<Book> getBooks() {
		return entityManager.createQuery("from Book",Book.class).getResultList();
	}

	public Book findBook(int id) {
		return entityManager.find(Book.class, id);
	}
	
	

}
