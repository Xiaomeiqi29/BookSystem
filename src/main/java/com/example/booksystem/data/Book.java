package com.example.booksystem.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Document(collection = "books")
public class Book {
    @Id
    private String id;
    private String title;
    private String author;
    private String publishedDate;
    private String isbn;
}
