package com.SENA.EasyCarRent.CustomerManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customer")
public class Customer extends ABaseEntityCustomerManagement {

    @Schema(description = "First name of the customer", example = "John")
    @Column(name = "first_name", nullable = false, length = 100)
    private String firstName;

    @Schema(description = "Last name of the customer", example = "Doe")
    @Column(name = "last_name", nullable = false, length = 100)
    private String lastName;

    @Schema(description = "Document number of the customer", example = "123456789")
    @Column(name = "document_number", nullable = false, length = 20, unique = true)
    private String documentNumber;

    @Schema(description = "Phone number of the customer", example = "+1234567890")
    @Column(name = "phone", nullable = false, length = 15)
    private String phone;

    @Schema(description = "Email of the customer", example = "john.doe@example.com")
    @Column(name = "email", nullable = false, length = 100, unique = true)
    private String email;

    @Schema(description = "Address of the customer", example = "123 Main St")
    @Column(name = "address", nullable = false, length = 255)
    private String address;
}