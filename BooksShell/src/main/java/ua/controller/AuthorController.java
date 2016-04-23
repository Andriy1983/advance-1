package ua.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import ua.dto.AuthorDTO;
import ua.entity.Author;
import ua.service.AuthorService;

@Controller
public class AuthorController {
	@Autowired
	AuthorService authorService;
	

	@RequestMapping(value="/show_all_authors")
	public String show_all_authors(Model model){
		List<Author> authors = authorService.authorServiceGetAllAuthors();
		
		model.addAttribute("authors", authors);
		return "author-showAllAuthors";
		
		
	}
	
	@RequestMapping(value="/toAddAuthor")
	public String addAuthor(Model model){
		model.addAttribute("addAuthorModel", new Author());
		return "author-addAuthor";
	}
	
	@RequestMapping(value="/addNewAuthor" , method=RequestMethod.POST)
	public String addNewAuthor(@ModelAttribute(value="addAuthorModel")Author author){
		
		authorService.authorServiceSaveOrUpdateAuthor(String.valueOf(author.getId()),author.getName(), author.getSurname());
		
		return "redirect:/toAddAuthor";
		
	}
	
	@RequestMapping("/modifyAuthor-{id}")
	public String modifyAuthor(@PathVariable("id")String id,Model model){
		Author author = authorService.authorServiceGetSingleAuthorByID(Integer.parseInt(id));
		model.addAttribute("addAuthorModel", author);
		return "author-addAuthor";
	}
	
	@RequestMapping("/deleteAuthor-{id}")
	public String deleteAuthor(@PathVariable("id")String id){
		authorService.authorServiceDeleteAuthor(Integer.parseInt(id));
		
		return "redirect:/show_all_authors";
	}
	
	@RequestMapping("/booksListOfAuthor-{id}")
	public String booksListOfAuthor(@PathVariable("id")String id,Model model){
		AuthorDTO authorDTO = authorService.authorServiceGetAuthorBookList(Integer.parseInt(id));
		System.out.println(authorDTO);
		String authorName= authorDTO.getName() + " "+ authorDTO.getSurname();
		model.addAttribute("authorDTO", authorName);
		model.addAttribute("titlesDTO", authorDTO.getBookTitles());
		model.addAttribute("descriptions", authorDTO.getBookDescriptions());
		model.addAttribute("years", authorDTO.getBookYears());
		return "author-authorsBookList";
	}
}
