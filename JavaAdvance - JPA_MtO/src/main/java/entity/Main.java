package entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Order;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;

public class Main {
	public static void main(String[] args) {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("serjUnit");
		EntityManager manager = factory.createEntityManager();

		manager.getTransaction().begin();

//		Author author2 = new Author("Joe","Satriani");
//		List <Book> list = new ArrayList<>();
//		list.add(new Book("One"));
//		list.add(new Book("Two"));
//		author2.setBooks(list);
//		manager.persist(author2);
		
//		Author author = manager.find(Author.class, 1);
//		Book book = manager.find(Book.class, 1);
//		book.setAuthor(author);
//		manager.merge(book);
//		manager.getTransaction().commit();
		
		
//		System.out.println(manager.createQuery("from Author").getResultList());
//		Query query = manager.createQuery("from Author a join a.books");
//		List<Object[]> objects = query.getResultList();
//		for (Object[] firistRound : objects) {
//			for (Object object : firistRound) {
//				System.out.println(object);
//			}
//		}
		
//		EntityManager em = ...;
//		CriteriaBuilder cb = em.getCriteriaBuilder();
//		CriteriaQuery<Entity class> cq = cb.createQuery(Entity.class);
//		Root<Entity> from = cq.from(Entity.class);
//		cq.select(Entity);
//		TypedQuery<Entity> q = em.createQuery(cq);
//		List<Entity> allitems = q.getResultList();
		
		
		CriteriaBuilder cb = manager.getCriteriaBuilder();
		CriteriaQuery buildinOfQuery = cb.createQuery();
		
		
		manager.close();

		factory.close();

	}

}
