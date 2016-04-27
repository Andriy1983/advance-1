package aaa.aaa;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Main {
	public static void main(String[] args) {
		
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("serj");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Author author = new Author("asd","dsa");
		Book book = new Book("qwe", "ewq");
		
		manager.persist(author);
		manager.persist(book);
		
		Author author2 = manager.getReference(Author.class, 1);
		
		Book book2 = manager.getReference(Book.class, 1);
		
		author2.getBooks().add(book2);
		
		
		
		manager.getTransaction().commit();
		
		factory.close();
	}

}
