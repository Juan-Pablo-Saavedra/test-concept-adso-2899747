package com.SENA.EasyCarRent.FleetManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vehicle_status")
public class VehicleStatus extends ABaseEntityFleetManagement {

    @Schema(description = "Code of the vehicle status", example = "AVAILABLE")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Schema(description = "Name of the vehicle status", example = "Available")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Description of the vehicle status", example = "Vehicle is available for rental")
    @Column(name = "description", nullable = false, length = 255)
    private String description;
}