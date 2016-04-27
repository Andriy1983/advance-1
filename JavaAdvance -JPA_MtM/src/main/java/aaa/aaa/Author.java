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
public class Author {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int id_autor;
	private String name;
	private String surname;
	
	@ManyToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
	@JoinTable(name = "ref_table", joinColumns= @JoinColumn(name = "id_autor"), inverseJoinColumns = @JoinColumn(name= "id_book"))
	private List<Book> books  = new ArrayList<Book>(); 
	
	public List<Book> getBooks() {
		return books;
	}

	public void setBooks(List<Book> books) {
		this.books = books;
	}

	public Author() {
		// TODO Auto-generated constructor stub
	}

	public Author(String name, String surname) {
		this.name = name;
		this.surname = surname;
	}

	public int getId_autor() {
		return id_autor;
	}

	public void setId_autor(int id_autor) {
		this.id_autor = id_autor;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	@Override
	public String toString() {
		return "Author [id_autor=" + id_autor + ", name=" + name + ", surname=" + surname + "]";
	}
	
	
	
	
	
	
	

}
