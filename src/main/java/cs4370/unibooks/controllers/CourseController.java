package cs4370.unibooks.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import org.springframework.beans.factory.annotation.Autowired;

import cs4370.unibooks.repositories.CourseRepository;
import cs4370.unibooks.models.Course;

@RestController
@RequestMapping("/courses")
public class CourseController {
    @Autowired
    private CourseRepository courseRepository;

    @GetMapping
    public List<Course> getCourses() {
        return courseRepository.findAll();
    }
}
