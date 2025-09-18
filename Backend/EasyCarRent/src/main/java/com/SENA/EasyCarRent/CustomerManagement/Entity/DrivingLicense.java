package com.SENA.EasyCarRent.CustomerManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "driving_license")
public class DrivingLicense extends ABaseEntityCustomerManagement {

    @Schema(description = "License number", example = "DL123456789")
    @Column(name = "license_number", nullable = false, length = 20, unique = true)
    private String licenseNumber;

    @Schema(description = "License category", example = "B")
    @Column(name = "category", nullable = false, length = 10)
    private String category;

    @Schema(description = "Expiry date of the license", example = "2025-12-31")
    @Column(name = "expiry_date", nullable = false)
    private LocalDate expiryDate;

    @Schema(description = "Customer ID", example = "uuid-string")
    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Customer customer;
}