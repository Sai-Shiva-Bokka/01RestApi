package org.example.sb_restapi.Contoller;

import org.example.sb_restapi.Entity.Book;
import org.example.sb_restapi.Service.BookServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {

    @Autowired
    private BookServiceImpl bookService;

    @PostMapping("/addbook")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        String s = bookService.upsertBook(book);
        return new ResponseEntity<>(book, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Book> getBookById(@PathVariable Integer id) {
        Book bookById = bookService.getBookById(id);
        return new ResponseEntity<>(bookById, HttpStatus.OK);
    }

    @GetMapping("/allbooks")
    public ResponseEntity<List<Book>> getAllBooks() {
        List<Book> books = bookService.getAllBooks();
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PutMapping("/updatebook")
    public ResponseEntity<String> updateBook(@RequestBody Book book) {
        String s = bookService.upsertBook(book);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

    @DeleteMapping("/deletebook")
    public ResponseEntity<String> deleteBook(Integer id) {
        String s = bookService.deleteBookById(id);
        return new ResponseEntity<>(s, HttpStatus.OK);
    }

}
