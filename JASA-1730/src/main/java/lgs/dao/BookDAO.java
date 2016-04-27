package lgs.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import lgs.entity.Book;

@Repository
public class BookDAO {
	
	@PersistenceContext
	private EntityManager manager;
	
	
	@Transactional
	public void inserBook(Book book){
		manager.persist(book);
	}
	
	public Book getBookByID(int id){
		return manager.find(Book.class, id);
	}

}
