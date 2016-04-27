package ua.dto;

import org.springframework.web.multipart.MultipartFile;

public class BookDTO {
	private String title;
	private MultipartFile file;

	public BookDTO() {
		// TODO Auto-generated constructor stub
	}
	public BookDTO(String title, MultipartFile file) {
		super();
		this.title = title;
		this.file = file;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public MultipartFile getFile() {
		return file;
	}

	public void setFile(MultipartFile file) {
		this.file = file;
	}

}
