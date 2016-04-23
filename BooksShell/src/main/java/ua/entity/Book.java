package ua.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id;
	private String title;
	@Column(columnDefinition="text")
	private String description;
	private short year;
	@ManyToMany(fetch=FetchType.EAGER)
	private List<Author>authors = new ArrayList<Author>();
	
	public Book() {
		// TODO Auto-generated constructor stub
	}

	/*чисто книга*/
	public Book(String title, String description, short year) {
		super();
		this.title = title;
		this.description = description;
		this.year = year;
	}
	
	
	/*книга с авторами*/
	public Book(String title, String description, short year, List<Author> authors) {
		super();
		this.title = title;
		this.description = description;
		this.year = year;
		this.authors = authors;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public short getYear() {
		return year;
	}

	public void setYear(short year) {
		this.year = year;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "Book [id=" + id + ", title=" + title + ", description=" + description + ", year=" + year + "]";
	}

	
	
	
	
	
	
	
	
	
	
	
	
	
}
