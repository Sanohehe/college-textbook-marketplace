package cs4370.unibooks.repositories;

import cs4370.unibooks.models.Course;

import org.springframework.stereotype.Repository;
import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface CourseRepository extends JpaRepository<Course, Integer>{
    
}
