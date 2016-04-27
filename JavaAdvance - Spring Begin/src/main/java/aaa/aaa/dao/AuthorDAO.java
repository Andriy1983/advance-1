package aaa.aaa.dao;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

import aaa.aaa.entity.Author;
import aaa.aaa.entity.Book;

public class AuthorDAO {
	private SessionFactory shmactory;

	public void insertAuthor(Author author) {
		Session session = shmactory.openSession();
		session.beginTransaction();
//		if(!author.getBooks().isEmpty()){
//			for (Book book : author.getBooks()) {
//				book.getAuthors().add(author);
//			}
//		}
		session.persist(author);
		session.getTransaction().commit();
		session.close();
	}

	public Author findById(int id) {
		Session session = shmactory.openSession();
		Object object = session.createQuery("select  a from Author a where a.id_author = ?").setParameter(1, id)
				.uniqueResult();
		session.close();
		return (Author) object;

	}

	public void setFactory(SessionFactory factory) {
		this.shmactory = factory;
	}
	
	

}
