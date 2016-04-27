package ua.entity;


import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import ua.service.AuthorService;

public class Main {
	public static void main(String[] args) {
		//наполняет контейнер бинами
		ConfigurableApplicationContext context = new ClassPathXmlApplicationContext("appContext.xml");
		AuthorService authorService = context.getBean(AuthorService.class);
		authorService.saveAuthor("lhkg", "iuyit");
		context.close();

	}

}
