package lgs.dao;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lgs.entity.Author;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/context.xml");
			AuthorDAO authorDAO = applicationContext.getBean(AuthorDAO.class);
			authorDAO.insertAuthor(new Author("aaa", "aaa", "a"));
		applicationContext.close();
	}
}
