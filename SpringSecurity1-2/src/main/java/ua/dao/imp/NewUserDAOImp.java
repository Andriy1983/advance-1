package ua.dao.imp;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Repository;

import ua.dao.NewUserDAO;
import ua.entity.NewUser;

@Repository
public class NewUserDAOImp implements NewUserDAO {

	@PersistenceContext
	EntityManager entityManager;

	public void insertUser(NewUser newUser) {
		entityManager.persist(newUser);
	}

	public NewUser getUser(String name) {
		NewUser newUser = entityManager.createQuery("select u from NewUser u where u.username = :login",NewUser.class)
				.setParameter("login", name).getSingleResult();
		return newUser;
	}

}
