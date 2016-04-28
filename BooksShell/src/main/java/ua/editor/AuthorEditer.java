package ua.editor;

import java.beans.PropertyEditorSupport;

import ua.service.AuthorService;
import ua.service.BookService;

public class AuthorEditer extends PropertyEditorSupport {


	private AuthorService authorService;
	
	

	public AuthorEditer(AuthorService authorService) {
		super();
		this.authorService = authorService;
	}



	@Override		//принимает за текст - value c option
	public void setAsText(String text) throws IllegalArgumentException {
		setValue(authorService.authorServiceGetSingleAuthorByID(Integer.valueOf(text)));
	
	}
	
}
