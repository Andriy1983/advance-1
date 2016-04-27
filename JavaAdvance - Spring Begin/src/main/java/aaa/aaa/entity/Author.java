package aaa.aaa.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

@Entity
public class Author {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_author;
	private String name;
	@ManyToMany(mappedBy = "authors", cascade = CascadeType.ALL)
	private List<Book> books = new ArrayList<Book>();
	
	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String name) {
		this.name = name;
	}

	public int getId_author() {
		return id_author;
	}

	public void setId_author(int id_author) {
		this.id_author = id_author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	@Override
	public String toString() {
		return "Author [id_author=" + id_author + ", name=" + name + "]";
	}
	
	
	
	
}
