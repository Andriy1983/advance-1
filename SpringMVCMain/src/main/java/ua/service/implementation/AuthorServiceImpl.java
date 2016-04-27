package ua.service.implementation;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.AuthorDAO;
import ua.entity.Author;
import ua.service.AuthorService;

@Service //������ ���� ���� ������ ��� �� ������� ������ ������
public class AuthorServiceImpl implements AuthorService{

	
	private AuthorDAO authorDAO;
	
	// ���� ������������� ������� ����/�����
	@Autowired //��������� ����� getBean() ������ ���� ���� ��������� applicationContext. ����� ���, ��������� @Repository �� AuthorDAOImpl
	public AuthorServiceImpl(AuthorDAO authorDAO) {
		this.authorDAO = authorDAO;
	}


	@Transactional //������ �� ������������
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
