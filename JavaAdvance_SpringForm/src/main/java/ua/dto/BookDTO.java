package ua.dto;

public class BookDTO {
	private String title;
	private String authorName;
	private String authorSurname;

	public BookDTO(String title, String authorName, String authorSurname) {
		this.title = title;
		this.authorName = authorName;
		this.authorSurname = authorSurname;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getAuthorName() {
		return authorName;
	}

	public void setAuthorName(String authorName) {
		this.authorName = authorName;
	}

	public String getAuthorSurname() {
		return authorSurname;
	}

	public void setAuthorSurname(String authorSurname) {
		this.authorSurname = authorSurname;
	}

	@Override
	public String toString() {
		return "BookDTO [title=" + title + ", authorName=" + authorName + ", authorSurname=" + authorSurname + "]";
	}

}
