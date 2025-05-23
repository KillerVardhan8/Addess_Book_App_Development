package net.suryavardhan.addressbookapp.controller;

import net.suryavardhan.addressbookapp.dto.ContactDTO;
import net.suryavardhan.addressbookapp.model.Contact;
import net.suryavardhan.addressbookapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import lombok.extern.slf4j.Slf4j;

import java.util.List;

@RestController
@Slf4j
@RequestMapping("/contacts")
@CrossOrigin(origins = "*")
public class ContactController {

    @Autowired
    private ContactService service;

    @PostMapping
    public Contact create(@RequestBody ContactDTO dto) {
        return service.addContact(dto);
    }

    @GetMapping
    public List<Contact> getAll() {
        return service.getAllContacts();
    }

    @GetMapping("/{id}")
    public Contact getById(@PathVariable Long id) {
        return service.getContactById(id);
    }

    @PutMapping("/{id}")
    public Contact update(@PathVariable Long id, @RequestBody ContactDTO dto) {
        return service.updateContact(id, dto);
    }

    @DeleteMapping("/{id}")
    public String delete(@PathVariable Long id) {
        service.deleteContact(id);
        return "Deleted contact with id: " + id;
    }
    
    @GetMapping("/test")
    public String testLogging() {
        log.debug("This is a DEBUG log for testing");
        log.warn("This is a WARN log");
        log.error("This is an ERROR log");
        return "Logging tested!";
    }
}