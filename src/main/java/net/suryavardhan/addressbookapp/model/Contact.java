package net.suryavardhan.addressbookapp.model;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.NoArgsConstructor;
import lombok.AllArgsConstructor;
@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Contact {
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private Long id;
	 private String fullName;
	 private String email;
	 private String phone;
	 private String city;
	 
	 
}
