package cs4370.unibooks.repositories;

import cs4370.unibooks.models.Textbook;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface BookRepository extends JpaRepository<Textbook, Integer> {
}