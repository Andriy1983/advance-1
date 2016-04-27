package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.AuthorDAO;
import ua.entity.Author;
import ua.service.AuthorService;

@Service //вместо того чтобі писать бин по данному сервис классу
public class AuthorServiceImpl implements AuthorService{

	
	private AuthorDAO authorDAO;
	
	// само нициализирует знаение поля/полей
	@Autowired //реализует метод getBean() вместо того чтобі создавать applicationContext. берет бин, благодаря @Repository из AuthorDAOImpl
	public AuthorServiceImpl(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}


	@Transactional //следит за транзакциями
	public void saveAuthor(String name, String surname) {
		Author author = new Author(name, surname);
		authorDAO.insertAuthor(author);
		
	}




	public List<Author> showAuthors() {

		return authorDAO.getAuthor();
	}


	public Author getAuthorByID(int id) {
		return authorDAO.findByID(id);
		
	}


	

}
