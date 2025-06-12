package org.example.sb_restapi.Repo;

import org.example.sb_restapi.Entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.io.Serializable;

@Repository
public interface BookRepo extends JpaRepository<Book, Serializable> {

}
