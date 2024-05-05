package cs4370.unibooks.models;

import jakarta.persistence.*;

@Entity
@Table(name = "textbooks")
public class Textbook {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "book_id")
    private Integer bookId;

    @Column(name = "title", nullable = false)
    private String title;

    @Column(name = "author", nullable = false)
    private String author;

    @Column(name = "price", nullable = false)
    private Double price;

    @Column(name = "book_condition", nullable = false)
    private String condition;

    // Default constructor
    public Textbook() {
    }

    // Constructor with parameters
    public Textbook(String title, String author, Double price, String condition) {
        this.title = title;
        this.author = author;
        this.price = price;
        this.condition = condition;
    }

    // Getters and Setters
    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
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

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
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
        return "Textbook{" +
                "bookId=" + bookId +
                ", title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", price=" + price +
                ", condition='" + condition + '\'' +
                '}';
    }
}
