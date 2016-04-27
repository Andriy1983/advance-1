package aaa.aaa;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;

@Entity
public class Book {
	@Id
	@GeneratedValue(strategy =GenerationType.IDENTITY)
	private int id_book;
	private String title;
	private String genre;
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.MERGE, CascadeType.PERSIST})
	@JoinTable(name = "ref_table",joinColumns = @JoinColumn(name="id_book"), inverseJoinColumns = @JoinColumn(name="id_autor") )
	private List<Author> authors = new ArrayList<Author>();
	
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	
	public Book(String title, String genre) {
		this.title = title;
		this.genre = genre;
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
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}
	public List<Author> getAuthors() {
		return authors;
	}
	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}


	@Override
	public String toString() {
		return "Book [title=" + title + ", genre=" + genre + "]";
	}
	
	
	
	
	
	
	

}
