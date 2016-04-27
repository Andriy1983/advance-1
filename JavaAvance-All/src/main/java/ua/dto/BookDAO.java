package ua.dto;

import org.springframework.data.jpa.repository.JpaRepository;

import ua.entity.Book;

public interface BookDAO extends JpaRepository<Book,Integer>{

}
