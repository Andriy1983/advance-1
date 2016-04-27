package ua.dto;

import java.util.List;

public class AuthorDTO {
	
	private String name;
	private String surname;
	private List<String> booksTitle;

	public AuthorDTO(String name, String surname, List<String> booksTitle) {
		this.name = name;
		this.surname = surname;
		this.booksTitle = booksTitle;
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

	public List<String> getBooksTitle() {
		return booksTitle;
	}

	public void setBooksTitle(List<String> booksTitle) {
		this.booksTitle = booksTitle;
	}

	@Override
	public String toString() {
		return "AuthorDTO [name=" + name + ", surname=" + surname + ", booksTitle=" + booksTitle + "]";
	}

	
}
