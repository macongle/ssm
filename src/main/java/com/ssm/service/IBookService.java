package com.ssm.service;

import java.util.List;

import com.ssm.dao.BookMapper;
import com.ssm.model.Book;

public interface IBookService {
	
	List<Book> selectAll();

	int getcount(int displayCount);

	List<BookMapper> getBooks(int pageNow, int displayCount);

	boolean delete(int bookno);

	boolean insertSelective(Book book);


	Book getBook(int bookno);

	boolean updateUser(Book book);

	

	
}
