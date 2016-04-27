package ua.dto;

import java.util.List;

public class AuthorDTO {
	private int id;
	private String name;
	private String surname;
	private List<String> bookTitle;

	public AuthorDTO(int id, String name, String surname, List<String> bookTitle) {
		this.id = id;
		this.name = name;
		this.surname = surname;
		this.bookTitle = bookTitle;
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

	public List<String> getBookTitle() {
		return bookTitle;
	}

	public void setBookTitle(List<String> bookTitle) {
		this.bookTitle = bookTitle;
	}

	@Override
	public String toString() {
		return "AuthorDTO [id=" + id + ", name=" + name + ", surname=" + surname + ", bookTitle=" + bookTitle + "]";
	}

	
}
