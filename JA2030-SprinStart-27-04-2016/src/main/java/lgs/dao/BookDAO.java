package lgs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import lgs.entity.Book;

public class BookDAO {

	private SessionFactory factory;

	public void insertBook(Book book) {
		Session session = factory.openSession();

		session.beginTransaction();
		session.save(book);

		session.getTransaction().commit();

		session.close();
	}

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public Book getBook(int id) {
		Session session = factory.openSession();
		Book temp = session.get(Book.class, id);
		session.close();
		return temp;
	}

	public List<Book> getBooks() {

		Session session = factory.openSession();
		List<Book> books = session.createQuery("from Book").list();
		session.close();
		return books;
		
	}
	
	

}
