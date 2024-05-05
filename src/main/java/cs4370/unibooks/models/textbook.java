package cs4370.unibooks.models;

import jakarta.persistence.*;

@Entity
@Table (name = "Textbook")
public class textbook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;
    private String author;
    private double price;
    @Column(name = "'condition'")
    private String condition;

    // Constructor without parameters
    public textbook() {
    }

    // Constructor with parameters
    public textbook(String title, String author, double price, String condition) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.condition = condition;
    }

    // Getters and Setters
    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getCondition() {
        return condition;
    }

    public void setCondition(String condition) {
        this.condition = condition;
    }

    @Override
    public String toString() {
        return "textbook{" +
                "id=" + id +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", condition='" + condition + '\'' +
                '}';
    }
}
