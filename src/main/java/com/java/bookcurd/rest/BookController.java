package com.java.bookcurd.rest;

import com.java.bookcurd.entity.BookEntity;
import com.java.bookcurd.service.BookService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
@AllArgsConstructor
public class BookController {

    final BookService bookService;

    @PostMapping("/save")
    ResponseEntity<String> save(@RequestBody BookEntity book) {
        Long id = bookService.save(book);

        if(id != null)  return ResponseEntity.status(HttpStatus.CREATED).body("Book Saved with id " + id);

        return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("Book not saved");
    }

    @GetMapping("/{id}")
    ResponseEntity<BookEntity> getById(@PathVariable Long id) {
        BookEntity book = bookService.getById(id);
        if(book != null)    return ResponseEntity.ok().body(book);
        return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
    }

    @GetMapping("/all")
    ResponseEntity<List<BookEntity>> getAll() {
        return ResponseEntity.ok(bookService.getAll());
    }

}
