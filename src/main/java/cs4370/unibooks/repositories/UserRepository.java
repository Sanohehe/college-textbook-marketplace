package cs4370.unibooks.repositories;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

import cs4370.unibooks.models.User;

@Repository
public interface UserRepository extends JpaRepository<User, Integer>{
    
}
