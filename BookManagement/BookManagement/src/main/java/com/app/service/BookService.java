package com.app.service;

import java.util.List;

import com.app.dto.BookDto;
import com.app.entity.Book;

public interface BookService {

	String newBook(BookDto bookDto);

	List<Book> fetchAllBooks();

	Book fetchByName(String bookName);

	String removebook(int bookId);

	Book fetchById(int bookId);

	boolean updateBook(int bookId, Book book);

	String getBook(int bookId, int user_id);

	List<Book> getByUserId(int user_id);

}
