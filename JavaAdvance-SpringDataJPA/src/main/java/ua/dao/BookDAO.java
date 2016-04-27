package ua.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.Book;

public interface BookDAO extends JpaRepository<Book, Integer>{
	
	@Query(value="select b.img from Book b where b.id = :id")
	byte[] getImg(@Param("id") int id);
	
	
}
