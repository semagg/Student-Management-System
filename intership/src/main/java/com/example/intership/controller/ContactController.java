package com.example.intership.controller;

import com.example.intership.model.Contact;
import com.example.intership.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("contact")
public class ContactController {

    @Autowired
    private ContactService contactService;

    @PostMapping(name = "/save")
    public Contact save( @RequestBody  Contact contact){
        return contactService.save(contact);
    }

    @DeleteMapping("/delete/{id}")
    public void delete(@PathVariable Long id){
        contactService.delete(id);
    }

    @GetMapping("/contactAll")
    public List<Contact> contactAll(){
        return contactService.contactAll();
    }

}
