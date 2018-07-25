package com.ssm.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.ssm.model.Book;
import com.ssm.service.IBookService;

@Controller
@RequestMapping(value="/book")
public class BookController {
	
	@Autowired
	private IBookService service;

	@RequestMapping("/list")
	public String selectAllBook(ModelMap map){
		List<Book> books = service.selectAll(); 
		map.addAttribute("books", books);
		return "list";
	}
	
	@RequestMapping(value="/{bookno}" ,params="method=delete")
	public String deleteBook(@PathVariable int bookno){
		boolean flag = service.delete(bookno); 
		return "redirect:/book/list";
	}
	
	@RequestMapping("/toadd")
	public String toAdd(){
		return "add";
	} 
	
	@RequestMapping(method=RequestMethod.POST)
	public String addUser( Book book, ModelMap model){
		boolean flag = service.insertSelective(book);
		return "redirect:/book/list";
	}
	
	
	@RequestMapping(value="/{bookno}")
	public String getUser(@PathVariable int bookno ,ModelMap model){
		Book book=service.getBook(bookno);
		model.addAttribute("book", book);
		return "update";
		
	}
	
	
	@RequestMapping(method=RequestMethod.POST ,params="_method=put")
	public String updateUser( Book book, ModelMap model){
		boolean flag = service.updateUser(book);
		return "redirect:/book/list";
	}

}
