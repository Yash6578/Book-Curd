package com.java.bookcurd.service;

import com.java.bookcurd.entity.BookEntity;

import java.util.List;


public interface BookService {
    Long save(BookEntity book);
    BookEntity getById(Long id);
    List<BookEntity> getAll();
}
