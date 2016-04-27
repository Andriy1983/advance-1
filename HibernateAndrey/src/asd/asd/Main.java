package asd.asd;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {

	public static void main(String[] args) {

		SessionFactory factory = new Configuration().configure().buildSessionFactory();

		Session session = factory.openSession();

		// session.getTransaction().begin();
		session.beginTransaction();
		
		Human human = new Human("andrey");
		Human human2 = new Human("andre2");
		session.save(human);
		session.save(human2);
		
		
		session.getTransaction().commit();//фиксация изменений ...все изменения должні фиксироваться в конце

		session.close();

		factory.close();

	}

}
