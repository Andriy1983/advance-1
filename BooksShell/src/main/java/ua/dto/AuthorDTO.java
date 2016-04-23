package ua.dto;


import java.util.List;

public class AuthorDTO {
	
	private int id;
	private String name;
	private String surname;
	private List<String> bookTitles;
	private List<String> bookDescriptions;
	private List<String> bookYears;
	
	public AuthorDTO() {
		// TODO Auto-generated constructor stub
	}

	public AuthorDTO(int id, String name, String surname, List<String> bookTitles, List<String> bookDescriptions,
			List<String> bookYears) {
		super();
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.bookTitles = bookTitles;
		this.bookDescriptions = bookDescriptions;
		this.bookYears = bookYears;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
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

	public List<String> getBookTitles() {
		return bookTitles;
	}

	public void setBookTitles(List<String> bookTitles) {
		this.bookTitles = bookTitles;
	}

	public List<String> getBookDescriptions() {
		return bookDescriptions;
	}

	public void setBookDescriptions(List<String> bookDescriptions) {
		this.bookDescriptions = bookDescriptions;
	}

	public List<String> getBookYears() {
		return bookYears;
	}

	public void setBookYears(List<String> bookYears) {
		this.bookYears = bookYears;
	}

	@Override
	public String toString() {
		return "AuthorDTO [id=" + id + ", name=" + name + ", surname=" + surname + ", bookTitles=" + bookTitles
				+ ", bookDescriptions=" + bookDescriptions + ", bookYears=" + bookYears + "]";
	}

	
	
	

	
	
	

}
