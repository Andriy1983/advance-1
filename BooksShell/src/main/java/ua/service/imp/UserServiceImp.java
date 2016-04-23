package ua.service.imp;

import java.util.ArrayList;
import java.util.Collection;

import javax.persistence.NoResultException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import ua.dao.UserDAO;
import ua.service.UserService;

@Service(value = "userService") /*связь секьюрити с базой*/
public class UserServiceImp implements UserService, UserDetailsService {

	@Autowired
	private UserDAO userDAO;

	/*найти и залогинить*/
	@Transactional
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		/*получаю обїект по имени*/
		ua.entity.User user = null;
		try {
			user = userDAO.getUser(username);
		} catch (NoResultException e) {
			return null;
		}
		/*создаю права*/
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		/*создаю объект типа Юзер(Спринговский) который связывается с сеьюрити хмл, т.к. наш Юзер мы связать не можем*/
		return new User(String.valueOf(user.getId()), user.getPassword(), authorities);
	}

	public ua.entity.User getUser(String username) {
		return userDAO.getUser(username);
	}

	public void userServiceSaveUser(ua.entity.User user) {
		userDAO.save(user);
	}

}
