package com.poisonedyouth.spring5webapp.controllers;

import com.poisonedyouth.spring5webapp.repositories.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by poisonedyouth on 5/18/17.
 */
@Controller
public class BookController {

    @Autowired
    private BookRepository bookRepository;

    @RequestMapping("/books")
    public String getBooks(Model model){

        model.addAttribute("books", bookRepository.findAll());

        return "books";
    }
}
