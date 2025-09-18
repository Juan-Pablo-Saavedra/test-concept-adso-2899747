package com.SENA.EasyCarRent.FleetManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vehicle_category")
public class VehicleCategory extends ABaseEntityFleetManagement {

    @Schema(description = "Code of the vehicle category", example = "SEDAN")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Schema(description = "Name of the vehicle category", example = "Sedan")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Description of the vehicle category", example = "Four-door passenger car")
    @Column(name = "description", nullable = false, length = 255)
    private String description;
}