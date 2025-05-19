package net.suryavardhan.addressbookapp.model;

import jakarta.persistence.*;
@Entity

public class Contact {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String fullName;
	 private String email;
	 private String phone;
	 private String city;
	 
	 public Contact() {}

	 // All-args constructor
	 public Contact(Long id, String fullName, String email, String phone, String city) {
	     this.fullName = fullName;
	     this.email = email;
	     this.phone = phone;
	     this.city = city;
	 }
	 	
	 	public Long getid() {
	 		return id;
	 	}
	 	
	 	public void setid(Long id) {
	 		this.id=id;
	 	}
	 	
	    public String getFullName() {
	        return fullName;
	    }

	    public void setFullName(String fullName) {
	        this.fullName = fullName;
	    }

	    public String getEmail() {
	        return email;
	    }

	    public void setEmail(String email) {
	        this.email = email;
	    }

	    public String getPhone() {
	        return phone;
	    }

	    public void setPhone(String phone) {
	        this.phone = phone;
	    }

	    public String getCity() {
	        return city;
	    }

	    public void setCity(String city) {
	        this.city = city;

}
}
