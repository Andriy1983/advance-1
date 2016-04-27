package lgs.dao;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import lgs.entity.Author;

public class AuthorDAO {

	private SessionFactory factory;

	public void insertAuthor(Author author) {
		Session session = factory.openSession();
		session.beginTransaction();
		session.save(author);
		session.getTransaction().commit();
		session.close();
	}

	public Author getAuthor(int id) {
		Session session = factory.openSession();
		Author author = session.get(Author.class, id);
		session.close();
		return author;
	}

	public SessionFactory getFactory() {
		return factory;
	}

	public void setFactory(SessionFactory factory) {
		this.factory = factory;
	}

	public List<Author> getAuthors() {
		Session session = factory.openSession();
		List<Author> authors = session.createQuery("from Author").list();
		session.close();
		return authors;
	}
}
