package lgs.main;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import lgs.entity.Author;
import lgs.entity.Book;

public class Main {
	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("serj");
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		
//		Author author = new Author("Aaaa", "AAAAAAAA");
//		
//		manager.persist(author);
		
		
//		manager.persist(new Book("AOAAOAOAO"));
		
		
		Book tempBook = manager.getReference(Book.class, 1);
		Author tempAuthor = manager.find(Author.class, 1);
		tempBook.setAuthor(tempAuthor);
		manager.merge(tempBook);
		
		manager.getTransaction().commit();
		

		manager.close();

		factory.close();

	}
}
