package ua.entity;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_book;
	private String title;
	@ManyToOne(fetch = FetchType.LAZY)
	private Author author;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	public Book(String title) {
		this.title = title;
	}

	public int getId_book() {
		return id_book;
	}

	public void setId_book(int id_book) {
		this.id_book = id_book;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	@Override
	public String toString() {
		return "Book [id_book=" + id_book + ", title=" + title + ", author=" + author + "]";
	}
	
	
	
	
	
}
