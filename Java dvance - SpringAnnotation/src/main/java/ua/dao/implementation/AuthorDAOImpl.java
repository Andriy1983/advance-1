package ua.dao.implementation;

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

}
