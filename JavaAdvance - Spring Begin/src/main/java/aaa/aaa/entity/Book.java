package aaa.aaa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private int id_book;
	private String title;
	@ManyToMany
	@JoinTable(name="hui", joinColumns = @JoinColumn(name = "b_id"), inverseJoinColumns = @JoinColumn(name = "a_id"))
	private List<Author> authors = new ArrayList<Author>();
	
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

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [id_book=" + id_book + ", title=" + title + "]";
	}
	

	
	
	
	
}
