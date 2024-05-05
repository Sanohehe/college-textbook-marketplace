package cs4370.unibooks.models;

import jakarta.persistence.*;

@Entity
@Table(name = "courses")
public class Course {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id", nullable = false)
    private Integer courseId;
    @Column(name = "course_name", nullable = false)
    private String courseName;
    @Column(name = "department", nullable = false)
    private String department;

    // Default constructor
    public Course() {
    }

    // Constructor with parameters
    public Course(String courseName, String department) {
        this.courseName = courseName;
        this.department = department;
    }

    // Getters and Setters
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String toString() {
        return "Course ID: " + courseId + "\nCourse Name: " + courseName + "\nDepartment: " + department;
    }
}
