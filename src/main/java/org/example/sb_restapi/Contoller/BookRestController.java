package org.example.sb_restapi.Contoller;

import org.example.sb_restapi.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class BookRestController {

    @GetMapping(value="/book", produces= "application/json")
    public ResponseEntity<Book> getBook() {
        Book b = new Book(1, "Java", 1250.00);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    @GetMapping(value="/book/books", produces = "application/json")
    public ResponseEntity<List<Book>> getBooks() {
        Book b1 = new Book(2, "Python", 1000.00);
        Book b2 = new Book(3, "Java", 2000.00);
        Book b3 = new Book(4, ".Net", 500.00);
        List<Book> books = Arrays.asList(b1, b2, b3);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

}
