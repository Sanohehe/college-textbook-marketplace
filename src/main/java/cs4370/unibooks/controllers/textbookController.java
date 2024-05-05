package cs4370.unibooks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.HttpStatus;

import cs4370.unibooks.models.textbook;
import cs4370.unibooks.repositories.textbookRepository;

@RestController
@RequestMapping("/textbooks")
public class textbookController {
    private final textbookRepository textbookRepository;

    public textbookController(textbookRepository textbookRepository) {
        this.textbookRepository = textbookRepository;
    }

}
