package org.example.sb_restapi.Contoller;

import org.example.sb_restapi.Book;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/book")
public class BookRestController {

    @GetMapping(value="/book", produces= "application/json")
    public ResponseEntity<Book> getBook() {
        Book b = new Book(1, "Java", 1250.00);
        return new ResponseEntity<>(b, HttpStatus.OK);
    }

    @GetMapping(value="/allbooks", produces = "application/json")
    public ResponseEntity<List<Book>> getBooks() {
        Book b1 = new Book(2, "Python", 1000.00);
        Book b2 = new Book(3, "Java", 2000.00);
        Book b3 = new Book(4, ".Net", 500.00);
        List<Book> books = Arrays.asList(b1, b2, b3);
        return new ResponseEntity<>(books, HttpStatus.OK);
    }

    @PostMapping(value = "/book", consumes = "application/json", produces = "application/json")
    public ResponseEntity<String> addBook(@RequestBody Book book) {
        System.out.println(book);
        String msg = "Book Saved Successfully";
        return new  ResponseEntity<>(msg, HttpStatus.CREATED);
    }

    @PutMapping(
            value = "/book/{bookId}",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<Book> updateBookPut(@PathVariable("bookId") Integer bookId,
                                              @RequestBody Book book){
        System.out.println("Book Id : "+ bookId);
        System.out.println(book);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @PatchMapping(
            value = "/book/{bookId}",
            consumes = "application/json",
            produces = "application/json")
    public ResponseEntity<Book> updateBookPatch(@PathVariable("bookId") Integer bookId,
                                                @RequestBody Book book){
        System.out.println("Book Id : "+ bookId);
        System.out.println(book);
        return new ResponseEntity<>(book, HttpStatus.OK);
    }

    @DeleteMapping("/book/{bookId}")
    public ResponseEntity<String> deleteBook(@PathVariable("bookId") Integer bookId){
        String msg = "Book Deleted Successfully";
        System.out.println(bookId);
        return new ResponseEntity<>(msg, HttpStatus.OK);
    }

}
