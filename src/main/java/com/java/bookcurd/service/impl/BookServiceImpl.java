package com.java.bookcurd.service.impl;

import com.java.bookcurd.entity.BookEntity;
import com.java.bookcurd.repository.BookRepo;
import com.java.bookcurd.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class BookServiceImpl implements BookService {
    final BookRepo bookRepo;

    @Override
    public Long save(BookEntity book) {
        return bookRepo.save(book).getId();
    }

    @Override
    public BookEntity getById(Long id) {
        return bookRepo.findById(id).orElse(null);
    }

    @Override
    public List<BookEntity> getAll() {
        return bookRepo.findAll();
    }
}
