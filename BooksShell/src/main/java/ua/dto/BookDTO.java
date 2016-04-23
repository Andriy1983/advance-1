package ua.dto;

import java.util.List;

public class BookDTO {
	private int id;
	private String title;
	private String description;
	private short year;
	private List<String> authors;
	
	public BookDTO() {
		// TODO Auto-generated constructor stub
	}

	public BookDTO(int id, String title, String description, short year, List<String> authors) {
		super();
		this.id = id;
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

	public List<String> getAuthors() {
		return authors;
	}

	public void setAuthors(List<String> authors) {
		this.authors = authors;
	}

	@Override
	public String toString() {
		return "BookDTO [id=" + id + ", title=" + title + ", description=" + description + ", year=" + year
				+ ", authors=" + authors + "]";
	}

	
	

	

}
