package ua.dto;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import ua.entity.Author;

public interface AuthorDAO extends JpaRepository<Author, Integer> {
	@Query(value = "select a from Author a where a.surname like : surname")
	List<Author> MyAuthorServiceGetAuthorsBySurname(@Param("surname") String surname);

	@Query(value = "select a from Author a where a.name like : name")
	List<Author> MyAuthorServiceGetAuthorsByName(@Param("name") String name);

}
