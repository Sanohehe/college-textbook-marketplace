package cs4370.unibooks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import cs4370.unibooks.models.Textbook;
import cs4370.unibooks.repositories.BookRepository;

@RestController
public class BookController {
    @Autowired
    private BookRepository bookRepository;

    @GetMapping("/books")
    public List<Textbook> getBooks() {
        return bookRepository.findAll();
    }
}