package com.example.intership.repository;

import com.example.intership.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact ,Long> {

}
