package org.example.sb_restapi.Service;

import org.example.sb_restapi.Entity.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public interface BookService {

    public String upsertBook(Book book);

    public Book getBookById(Integer id);

    public List<Book> getAllBooks();

    public String deleteBookById(Integer id);

}
