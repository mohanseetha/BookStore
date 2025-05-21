package com.lms.BookStore.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Document("Books")
public class Book {
    @Id
    private String bookId;
    private String bookName;
    private String bookAuthor;
    private String bookPublisher;
    private Integer bookYear;
    private Float bookPrice;
}
