package ua.dto;

public class BookAllDTO {
	
	private String title;
	private String nameAuthor;
	private String surnameAuthor;
	private int id;
	
	public BookAllDTO() {
		// TODO Auto-generated constructor stub
	}

	

	public BookAllDTO(String title, String nameAuthor, String surnameAuthor, int id) {
		this.title = title;
		this.nameAuthor = nameAuthor;
		this.surnameAuthor = surnameAuthor;
		this.id = id;
	}



	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getNameAuthor() {
		return nameAuthor;
	}

	public void setNameAuthor(String nameAuthor) {
		this.nameAuthor = nameAuthor;
	}

	public String getSurnameAuthor() {
		return surnameAuthor;
	}

	public void setSurnameAuthor(String surnameAuthor) {
		this.surnameAuthor = surnameAuthor;
	}



	public int getId() {
		return id;
	}



	public void setId(int id) {
		this.id = id;
	}
	
	

}
