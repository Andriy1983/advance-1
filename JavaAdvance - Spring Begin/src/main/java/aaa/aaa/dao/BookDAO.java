package aaa.aaa.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import aaa.aaa.entity.Book;

public class BookDAO {
	SessionFactory factory;

	public void insertBook(Book book) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(book);
		session.getTransaction().commit();
		session.close();
	}

	public Book getBookById(int id) {
		Session session = factory.openSession();
		Object object = session.get(Book.class, id);
		session.close();
		return (Book) object;

	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}
}
