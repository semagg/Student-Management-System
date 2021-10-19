package com.example.intership.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;
import java.util.Set;

@Data
@Entity
@Table(name = "student")
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "student_name")
    private String studentName;

    @Column(name = "student_surname")
    private String studentSurname;

    @Column(name = "student_number")
    private String studentNumber;

    @JsonIgnore
    @OneToMany(mappedBy="student")
    private Set<Course> courses;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "contact_id", referencedColumnName = "contact_id")
    private Contact contact;

	public Student(Long studentId, String studentName, String studentSurname, String studentNumber, Set<Course> courses,
			Contact contact) {
		super();
		this.studentId = studentId;
		this.studentName = studentName;
		this.studentSurname = studentSurname;
		this.studentNumber = studentNumber;
		this.courses = courses;
		this.contact = contact;
	}

	public Student() {
		super();
	}

	public Long getStudentId() {
		return studentId;
	}

	public void setStudentId(Long studentId) {
		this.studentId = studentId;
	}

	public String getStudentName() {
		return studentName;
	}

	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}

	public String getStudentSurname() {
		return studentSurname;
	}

	public void setStudentSurname(String studentSurname) {
		this.studentSurname = studentSurname;
	}

	public String getStudentNumber() {
		return studentNumber;
	}

	public void setStudentNumber(String studentNumber) {
		this.studentNumber = studentNumber;
	}

	public Set<Course> getCourses() {
		return courses;
	}

	public void setCourses(Set<Course> courses) {
		this.courses = courses;
	}

	public Contact getContact() {
		return contact;
	}

	public void setContact(Contact contact) {
		this.contact = contact;
	}
    
    
}
