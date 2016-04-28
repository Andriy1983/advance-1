package ua.validator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.validation.Errors;
import org.springframework.validation.Validator;

import ua.entity.Book;
import ua.service.BookService;
@Component
public class BookValidator implements Validator {
	@Autowired
	BookService bookService;
	//1
//	BookService bookService;
//
//	public BookValidator(BookService bookService) {
//		super();
//		this.bookService = bookService;
//	}

	public boolean supports(Class<?> clazz) {

		return Book.class.equals(clazz);
	}

	public void validate(Object target, Errors errors) {
		Book book = (Book) target;
		System.out.println(book);
		System.out.println(bookService.bookServiceGetAllBooks());
		if (bookService.bookServiceGetAllBooks().contains(book)) {
			errors.rejectValue("title", "+++++", "book is exists");
		}
	}
	
//	public void validate(Object target, Errors errors) {
//		Book book = (Book) target;
//		List<Book> books = bookService.bookServiceGetAllBooks();
//		List<String> strings = new ArrayList<String>();
//		for (Book book2 : books) {
//			strings.add(book.getTitle());
//		}
//		
//		if (strings.contains(book.getTitle())) {
//			errors.rejectValue("title", "+++++", "book is exists");
//		}
//	}

}
