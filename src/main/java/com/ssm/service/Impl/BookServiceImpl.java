package com.ssm.service.Impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ssm.dao.BookMapper;
import com.ssm.model.Book;
import com.ssm.service.IBookService;

@Service
public class BookServiceImpl implements IBookService{
	
	@Autowired
	private BookMapper dao;

	@Override
	public List<Book> selectAll() {
		return dao.selectAll();
	}



	@Override
	public int getcount(int displayCount) {
		return dao.getcount(displayCount);
	}



	@Override
	public List<BookMapper> getBooks(int pageNow, int displayCount) {
		return dao.getBooks(pageNow,displayCount);
	}



	@Override
	public boolean delete(int bookno) {	
		int count = dao.delete(bookno);
		return count>0?true:false;
	}



	@Override
	public boolean insertSelective(Book book) {
		int count = dao.insertSelective(book);
		return count>0?true:false;
	}


	@Override
	public Book getBook(int bookno) {
		return dao.selectByPrimaryKey(bookno);
	}



	@Override
	public boolean updateUser(Book book) {
		int count = dao.updateByPrimaryKeySelective(book);
		return count>0?true:false;
	}

	
	
}
