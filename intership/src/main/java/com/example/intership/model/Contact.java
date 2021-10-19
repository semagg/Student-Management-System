package com.example.intership.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;

import javax.persistence.*;

@Data
@Entity
@Table(name = "contact")
public class Contact {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "contact_id")
    private Long contactId;


    @Column(name = "contact_email")
    private String contactEmail;

    @Column(name = "contact_pjone")
    private String contactPhone;

    @JsonIgnore
    @OneToOne(mappedBy = "contact")
    private Student student;

	public Contact(Long contactId, String contactEmail, String contactPhone, Student student) {
		super();
		this.contactId = contactId;
		this.contactEmail = contactEmail;
		this.contactPhone = contactPhone;
		this.student = student;
	}

	public Contact() {
		super();
	}

	public Long getContactId() {
		return contactId;
	}

	public void setContactId(Long contactId) {
		this.contactId = contactId;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}

	public String getContactPhone() {
		return contactPhone;
	}

	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}

	public Student getStudent() {
		return student;
	}

	public void setStudent(Student student) {
		this.student = student;
	}
    
    


}
