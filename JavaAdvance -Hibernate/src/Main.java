import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Main {
	public static void main(String[] args) {

		SessionFactory factory = new Configuration().addAnnotatedClass(Person.class).addAnnotatedClass(Car.class)
				.configure().buildSessionFactory();

		/* а если промапировать в хмл, то можно не добавлять єти классі тут */
		/*	<mapping class="Person" />*/
		/* пример */
		// SessionFactory factory2 = new Configuration().configure().buildSessionFactory();
		
		Session session = factory.openSession();
		
			Person person = new Person("Serl",28,Calendar.getInstance(),new Date());
//			Car legacy = new Car("legacy");
//			Car forester = new Car("forester");
			
			
			session.getTransaction().begin();
//			session.save(person);
//			session.save(legacy);
//			session.save(forester);
			
			
//			Person p = session.load(Person.class, 1);
//			p.setName("Vasya");
			
			/*Person p = session.load(Person.class, 1);
			List<Car> listCars = new ArrayList<>();

			listCars.add(session.get(Car.class, 1));
			listCars.add(session.get(Car.class, 2));
			
			p.setListCars(listCars);*/
			
//			Car c1 = session.load(Car.class, 1);
//			Car c2 = session.load(Car.class, 2);
//			c1.setPerson(p);
//			c2.setPerson(p);
			
			
//			Car cc =new Car("asdas");
//			cc.setPerson(person);
//			session.save(cc);
			
//			session.flush();
			
			
			
//			Car car = new Car("biji");
//			session.save(car);
			
//			Car temp = session.get(Car.class, 1);
//			temp.setModel("ssss");
//			
//			session.update(temp);
			
//			Car temp = session.load(Car.class, 1);
//			temp.setModel("sssss");
			
			Car car = new Car("iiii", new Person("Perl",28,Calendar.getInstance(),new Date()));
			session.save(car);
			
			
			
			
			session.getTransaction().commit();
			
			
			
			
			
			


		session.close();

		factory.close();

	}

}
