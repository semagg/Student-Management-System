package com.example.intership.service;

import com.example.intership.model.Contact;
import com.example.intership.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public Contact save(Contact contact){
        return contactRepository.save(contact);
    }

    public List<Contact> contactAll(){
        return contactRepository.findAll();
    }

    public void delete(Long id){
        contactRepository.deleteById(id);
    }


}
