package com.SENA.EasyCarRent.CustomerManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "customer_history")
public class CustomerHistory extends ABaseEntityCustomerManagement {

    @Schema(description = "Notes about the customer history", example = "Customer updated contact information")
    @Column(name = "notes", nullable = false, length = 500)
    private String notes;

    @Schema(description = "Customer ID", example = "uuid-string")
    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "customer_id", referencedColumnName = "id", insertable = false, updatable = false)
    private Customer customer;
}