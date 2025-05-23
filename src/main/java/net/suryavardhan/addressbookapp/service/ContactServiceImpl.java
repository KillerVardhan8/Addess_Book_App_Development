package net.suryavardhan.addressbookapp.service;

import net.suryavardhan.addressbookapp.dto.ContactDTO;
import lombok.*;
import net.suryavardhan.addressbookapp.model.Contact;
import net.suryavardhan.addressbookapp.repository.ContactRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContactServiceImpl implements ContactService {

    @Autowired
    private ContactRepository repository;

    @Override
    public Contact addContact(ContactDTO dto) {
    	Contact contact = new Contact(dto.getId(), dto.getFullName(), dto.getEmail(), dto.getPhone(), dto.getCity());

        return repository.save(contact);
    }

    @Override
    public List<Contact> getAllContacts() {
        return repository.findAll();
    }

    @Override
    public Contact getContactById(Long id) {
        return repository.findById(id).orElseThrow(() ->
                new RuntimeException("Contact not found with ID: " + id));
    }

    @Override
    public Contact updateContact(Long id, ContactDTO dto) {
        Contact contact = getContactById(id);
        contact.setFullName(dto.getFullName());
        contact.setEmail(dto.getEmail());
        contact.setPhone(dto.getPhone());
        contact.setCity(dto.getCity());
        return repository.save(contact);
    }

    @Override
    public void deleteContact(Long id) {
        if (!repository.existsById(id)) {
            throw new RuntimeException("Cannot delete. Contact not found with ID: " + id);
        }
        repository.deleteById(id);
    }
}

