package main;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import aaa.aaa.dao.AuthorDAO;
import aaa.aaa.dao.BookDAO;
import aaa.aaa.entity.Author;
import aaa.aaa.entity.Book;

public class Main {

	public static void main(String[] args) {

		ConfigurableApplicationContext applicationContext = new ClassPathXmlApplicationContext("classpath:/context.xml");
		AuthorDAO aDAO = (AuthorDAO) applicationContext.getBean("authorBean");
//		aDAO.insertAuthor(new Author("Kolya"));
		BookDAO bookDAO = applicationContext.getBean(BookDAO.class);
//		bookDAO.insertBook(new Book("мое извращение"));
//		Author author = new Author("g");
//		author.getBooks().add(new Book("l"));
//		aDAO.insertAuthor(author);
		List<Book> books = new ArrayList<Book>();
		books.add(bookDAO.getBookById(3));
		books.add(bookDAO.getBookById(4));
		Author author = new Author("new");
		author.setBooks(books);
		aDAO.insertAuthor(author);
		applicationContext.close();
	
	}
}
