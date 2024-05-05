package cs4370.unibooks.repositories;

import cs4370.unibooks.models.Transaction;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface TransactionRepository extends JpaRepository<Transaction, Integer>{
    
}
