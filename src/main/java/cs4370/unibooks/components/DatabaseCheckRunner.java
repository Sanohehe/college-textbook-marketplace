package cs4370.unibooks.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import cs4370.unibooks.repositories.textbookRepository;
import cs4370.unibooks.models.textbook;

@Component
public class DatabaseCheckRunner implements CommandLineRunner {

    final textbookRepository textbookRepository;

    @Autowired
    public DatabaseCheckRunner(textbookRepository textbookRepository) {
        this.textbookRepository = textbookRepository;
    }

    @Override
    public void run(String... args) throws Exception {
        textbook text1 = new textbook("Calculus", "James Stewart", 100.00, "New");
        textbook text2 = new textbook("Physics", "James Walker", 150.00, "Used");
        textbookRepository.save(text1);
        textbookRepository.save(text2);

        textbookRepository.findAll().forEach(System.out::println);
    }
}