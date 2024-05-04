package cs4370.unibooks.repositories;

import cs4370.unibooks.models.textbook;
import jakarta.annotation.PostConstruct;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public class textbookRepository {
    private List<textbook> textbooks = new ArrayList<>();

    public List<textbook> findAll() {
        return textbooks;
    }

    public textbook findById(Long id) {
        return textbooks.stream().filter(t -> t.getId().equals(id)).findFirst().orElse(null);
    }

    public void addTextbook(textbook textbook) {
        textbooks.add(textbook);
    }

    @PostConstruct
    public void postConstruct() {
        textbooks.add(new textbook(1L, "Introduction to Algorithms", "Thomas H. Cormen", 100.0, "New"));
        textbooks.add(new textbook(2L, "Operating System Concepts", "Abraham Silberschatz", 80.0, "Used"));
        textbooks.add(new textbook(3L, "Database System Concepts", "Abraham Silberschatz", 90.0, "New"));
        textbooks.add(new textbook(4L, "Computer Networks", "Andrew S. Tanenbaum", 70.0, "Used"));
        textbooks.add(new textbook(5L, "Artificial Intelligence: A Modern Approach", "Stuart Russell", 110.0, "New"));
    }
}
