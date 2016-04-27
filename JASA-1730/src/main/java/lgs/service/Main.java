package lgs.service;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import lgs.dao.BookDAO;

public class Main {
	public static void main(String[] args) {
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		BookService bookService = context.getBean(BookService.class);
		bookService.insertBook("sdfsfs");
		context.close();
		
	}
}
