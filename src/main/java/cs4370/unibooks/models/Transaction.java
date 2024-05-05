package cs4370.unibooks.models;

import jakarta.persistence.*;

import java.util.Date;

@Entity
@Table(name = "transactions")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "transaction_id")
    private Integer transactionId;
    @Column(name = "buyer_id", nullable = false)
    private Integer buyerId;
    @Column(name = "seller_id", nullable = false)
    private Integer sellerId;
    @Column(name = "book_id", nullable = false)
    private Integer bookId;
    @Column(name = "transaction_date", nullable = false)
    private Date transactionDate;
    
    // Default constructor
    public Transaction() {
    }

    // Constructor with parameters
    public Transaction(Integer buyerId, Integer sellerId, Integer bookId, Date transactionDate) {
        this.buyerId = buyerId;
        this.sellerId = sellerId;
        this.bookId = bookId;
        this.transactionDate = transactionDate;
    }

    // Getters and Setters
    public Integer getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(Integer transactionId) {
        this.transactionId = transactionId;
    }

    public Integer getBuyerId() {
        return buyerId;
    }

    public void setBuyerId(Integer buyerId) {
        this.buyerId = buyerId;
    }

    public Integer getSellerId() {
        return sellerId;
    }

    public void setSellerId(Integer sellerId) {
        this.sellerId = sellerId;
    }

    public Integer getBookId() {
        return bookId;
    }

    public void setBookId(Integer bookId) {
        this.bookId = bookId;
    }

    public Date getTransactionDate() {
        return transactionDate;
    }

    public void setTransactionDate(Date transactionDate) {
        this.transactionDate = transactionDate;
    }

    public String toString() {
        return "Transaction ID: " + transactionId + "\nBuyer ID: " + buyerId + "\nSeller ID: " + sellerId + "\nBook ID: " + bookId + "\nTransaction Date: " + transactionDate;
    }
}
