package ua.dao.implementation;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.dao.AuthorDAO;
import ua.entity.Author;

@Repository //������ ���� ���� ������ ��� �� ������� ��� ������
public class AuthorDAOImpl implements AuthorDAO {
	
	@PersistenceContext // �� ��� ��� ���, ���� ��������� entityManager`�� ��
						// entityManagerFactory
	//���������� ��� entityManager
	private EntityManager entityManager /* = context.getBean(EntityManager.class);*/ ;

	public void insertAuthor(Author author) {

		entityManager.persist(author);

	}

	public List<Author> getAuthor() {
		
		return entityManager.createQuery("from Author",Author.class).getResultList();
	}

	public Author findByID(int id) {
		
		return entityManager.find(Author.class, id);
	}

}
