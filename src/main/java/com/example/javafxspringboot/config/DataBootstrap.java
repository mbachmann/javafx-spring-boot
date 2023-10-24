package com.example.javafxspringboot.config;

import com.example.javafxspringboot.entity.Book;
import com.example.javafxspringboot.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;

import java.math.BigDecimal;
import java.time.LocalDate;
import jakarta.annotation.PostConstruct;

@Configuration
public class DataBootstrap {

    @Autowired
    BookRepository bookRepository;

    @PostConstruct
    private void createData () {
        Book book = new Book("title", BigDecimal.valueOf(1.00), LocalDate.of(2023, 10, 10));
        bookRepository.save(book);
    }
}
