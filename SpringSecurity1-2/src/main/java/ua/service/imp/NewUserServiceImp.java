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

import ua.dao.NewUserDAO;
import ua.entity.NewUser;
import ua.service.NewUserService;
@Service(value="userService")
public class NewUserServiceImp implements NewUserService,UserDetailsService {

	@Autowired
	NewUserDAO newUserDAO;
	@Transactional
	public UserDetails loadUserByUsername(String log) throws UsernameNotFoundException {
		NewUser newUser = null;
		try {
			newUser = newUserDAO.getUser(log);
		} catch (NoResultException e) {
			return null;
		
		}
		Collection<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
		
		return new User(String.valueOf(newUser.getId()), newUser.getPassword(), authorities);
	}

}










