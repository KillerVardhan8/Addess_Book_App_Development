package net.suryavardhan.addressbookapp.controller;

import net.suryavardhan.addressbookapp.dto.ContactDTO;
import net.suryavardhan.addressbookapp.model.Contact;
import net.suryavardhan.addressbookapp.service.ContactService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
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
}