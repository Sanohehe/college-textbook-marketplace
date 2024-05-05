package cs4370.unibooks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import cs4370.unibooks.models.Transaction;
import cs4370.unibooks.repositories.TransactionRepository;

@RestController
@RequestMapping("/transactions")
public class TransactionController {
    @Autowired
    private TransactionRepository transactionRepository;

    @GetMapping
    public List<Transaction> getTransactions() {
        return transactionRepository.findAll();
    }
}
