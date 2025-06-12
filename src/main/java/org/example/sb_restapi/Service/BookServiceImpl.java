package org.example.sb_restapi.Service;

import org.example.sb_restapi.Entity.Book;
import org.example.sb_restapi.Repo.BookRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepo bookRepo;

    @Override
    public String upsertBook(Book book) {
        bookRepo.save(book);
        return "Success";
    }

    @Override
    public Book getBookById(Integer id) {
        Optional<Book> byId = bookRepo.findById(id);

        if (byId.isPresent()) {
            return byId.get();
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return bookRepo.findAll();
    }

    @Override
    public String deleteBookById(Integer id) {
        if (bookRepo.existsById(id)) {
            bookRepo.deleteById(id);
            return "Success";
        }else {return "No Matching Record";}
    }
}
