package com.sukla.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.sukla.entity.Book;
import com.sukla.entity.BookRepository;

@Controller
public class BookController
{
	@Autowired
	private BookRepository repo;

	/*
	 * @GetMapping("/book") public ModelAndView getBookById(@RequestParam("id")
	 * Integer id) { System.out.println("ID :: "+id); ModelAndView mav = new
	 * ModelAndView(); Optional<Book> findById = repo.findById(id);
	 * 
	 * if(findById.isPresent()) { Book bookObj = findById.get();
	 * System.out.println(bookObj); //sending data mav.addObject("book", bookObj); }
	 * //set View Name mav.setViewName("index");
	 * 
	 * return mav;
	 * 
	 * }
	 */
	@GetMapping("/book")
	public String getBookById(@RequestParam("id") Integer id,Model model)
	{

		Optional<Book> findById = repo.findById(id);

		if (findById.isPresent())
		{
			Book bookObj = findById.get();
			model.addAttribute("book",bookObj);
		}

		return "index";

	}
}
