package com.aspire.guestservice.models;


import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Null;
import javax.validation.constraints.Pattern;

import jakarta.persistence.*;

@Entity
@Table(name = "guests")
public class Guest {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true, nullable = false)
    @Null(message = "You cannot provide an ID, it's assigned automatically.")
    private Long id;
    
    @Column(nullable = false)
    @NotBlank(message="Name must not be null.")
    private String name;
    
    @Column(nullable = false)
    @NotBlank(message="Email must not be null.")
    @Email
    private String email;
    
    @Column(nullable = false)
    @NotBlank(message="Phone number must not be null.")
	@Pattern(regexp = "^\\d{10}$", message = "Phone number must contain 10 digits.")
    private String phoneNumber;
    
    @Column(nullable = false)
    @NotBlank(message="Check in date cannot be null.")
    private String checkInDate;
    
    @Column(nullable = false)
    @NotBlank(message="Check out date cannot be null.")
    private String checkOutDate;
   
    @Column(nullable = false)
    @NotBlank(message="Type guest cannot be null.")
    private String typeGuest;

    public void setName(String name) { this.name = name; }

    public String getName() { return name; }

    public void setPhoneNumber(String phoneNumber) { this.phoneNumber = phoneNumber; }

    public String getPhoneNumber() { return phoneNumber; }

    public void setEmail(String email) { this.email = email; }

    public String getEmail() { return email; }

    public void setTypeGuest(String typeGuest) { this.typeGuest = typeGuest; }

    public String getTypeGuest() { return typeGuest; }

    public void setCheckInDate(String checkInDate) { this.checkInDate = checkInDate; }

    public String getCheckInDate() { return checkInDate; }

    public void setCheckOutDate(String checkOutDate) { this.checkOutDate = checkOutDate; }

    public String getCheckOutDate() { return checkOutDate; }

    public Long getIdGuest() { return id; }

    public void setIdGuest(Long idGuest) { this.id = idGuest; }
}
