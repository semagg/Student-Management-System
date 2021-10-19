package com.example.intership.model;

import lombok.Data;

import javax.persistence.*;


@Data
@Entity
@Table(name = "course")
public class Course {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "course_id")
    private Long courseId;

    @Column(name = "course_name")
    private String courseName;

    @Column(name = "course_level")
    private String courseLevel;


    @ManyToOne
    @JoinColumn(name="student_id", nullable=false)
    private Student student;


	public Course(Long courseId, String courseName, String courseLevel, Student student) {
		super();
		this.courseId = courseId;
		this.courseName = courseName;
		this.courseLevel = courseLevel;
		this.student = student;
	}


	public Course() {
		super();
	}


	public Long getCourseId() {
		return courseId;
	}


	public void setCourseId(Long courseId) {
		this.courseId = courseId;
	}


	public String getCourseName() {
		return courseName;
	}


	public void setCourseName(String courseName) {
		this.courseName = courseName;
	}


	public String getCourseLevel() {
		return courseLevel;
	}


	public void setCourseLevel(String courseLevel) {
		this.courseLevel = courseLevel;
	}


	public Student getStudent() {
		return student;
	}


	public void setStudent(Student student) {
		this.student = student;
	}
    
    
    
}
