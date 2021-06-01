package com.dao;

import java.util.List;

import com.model.BookEntity;

public interface BookEntityDao {
	public Integer addBook(BookEntity book);

	public Integer deleteBook(BookEntity book);

	public Integer updateBook(BookEntity book);

	public List<BookEntity> getBook();

	public BookEntity getBookById(Integer id);

	public Integer getIdByBook(String name);
}
