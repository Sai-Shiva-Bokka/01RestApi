package org.example.sb_restapi.Entity;

import jakarta.persistence.*;
import lombok.Data;


@Data
@Entity
public class Book {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String name;

    private Double price;
}
