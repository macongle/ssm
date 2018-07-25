package com.ssm.dao;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.ssm.model.Book;

@Repository
public interface BookMapper {
    int deleteByPrimaryKey(Integer bookNo);

    int insert(Book record);

    int insertSelective(Book record);

    Book selectByPrimaryKey(Integer bookNo);

    int updateByPrimaryKeySelective(Book record);

    int updateByPrimaryKey(Book record);

	List<Book> selectAll();

	int getcount(int displayCount);

	List<BookMapper> getBooks(int pageNow, int displayCount);

	int delete(int bookno);

	
}