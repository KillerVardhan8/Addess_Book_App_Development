package net.suryavardhan.addressbookapp.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/addressbook")


public class ContactController {
	 @GetMapping
	    public String welcome() {
	        return "Welcome to Address Book App!";

	 }
}
   