package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    public BookService() {
        this.bookRepository = new BookRepository();
    }

    public void displayWelcomeMessage() {
        System.out.println("Welcome to the Library Management System!");
        bookRepository.listBooks();
    }
}