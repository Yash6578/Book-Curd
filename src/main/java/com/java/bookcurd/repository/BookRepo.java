package com.java.bookcurd.repository;

import com.java.bookcurd.entity.BookEntity;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepo extends JpaRepository<BookEntity, Long> {
}
