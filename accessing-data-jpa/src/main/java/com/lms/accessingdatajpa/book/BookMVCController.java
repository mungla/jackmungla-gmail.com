package com.lms.accessingdatajpa.book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/books/")
public class BookMVCController {
	private final BookRepository bookRepository; 
	@Autowired
	  public BookMVCController(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }
    @GetMapping("list")
	public String showUpdateForm(Model model) {
		model.addAttribute("books", bookRepository.findAll());
		return "viewbooks";
	}
}
