package lgs.service;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lgs.dao.AuthorDAO;

public class Main {
	public static void main(String[] args) {

		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");	
		AuthorService authorService = context.getBean(AuthorService.class);
		authorService.insertAuthor("HJvhvhvjhvbjh");
		context.close();
	}
}
