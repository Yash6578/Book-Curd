package com.java.bookcurd.entity;

import lombok.Data;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
@Data
public class BookEntity {
    @Id
    @GeneratedValue
    Long id;
    String bookName;
    String authorName;
    Integer price;
}
