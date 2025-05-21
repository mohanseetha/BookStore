package com.lms.BookStore.service;

import com.lms.BookStore.model.Book;
import com.lms.BookStore.repository.BookRepo;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.Optional;

@Service
public class BookService {
    private BookRepo bookRepo;

    BookService(BookRepo bookRepo) {
        this.bookRepo = bookRepo;
    }

    public String welcomeMessage() {
        return "Welcome to BookStore API";
    }

    public List<Book> getBooks() {
        return bookRepo.findAll();
    }

    public Optional<Book> getBookById(String id) {
        return bookRepo.findById(id);
    }

    public Book addBook(Book book) {
        return bookRepo.insert(book);
    }

    public void deleteBookById(String id) {
        Optional<Book> bookOpt = getBookById(id);
        if (bookOpt.isPresent())
            bookRepo.deleteById(id);
    }

    public Book updateBookById(String id, Book book) {
        Optional<Book> oldBookOpt = getBookById(id);
        if (!oldBookOpt.isPresent()) {
            throw new RuntimeException("BOOK NOT FOUND");
        }
        Book oldBook = oldBookOpt.get();
        if (book.getBookName() != null) {
            oldBook.setBookName(book.getBookName());
        }
        if (book.getBookAuthor() != null) {
            oldBook.setBookAuthor(book.getBookAuthor());
        }
        if (book.getBookPublisher() != null) {
            oldBook.setBookPublisher(book.getBookPublisher());
        }
        if (book.getBookPrice() != null) {
            oldBook.setBookPrice(book.getBookPrice());
        }
        if (book.getBookYear() != null) {
            oldBook.setBookYear(book.getBookYear());
        }
        return bookRepo.save(oldBook);
    }
}
