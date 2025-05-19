package net.suryavardhan.addressbookapp.repository;

import net.suryavardhan.addressbookapp.model.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepository extends JpaRepository<Contact, Long> {
}
