package com.SENA.EasyCarRent.FleetManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "vehicle")
public class Vehicle extends ABaseEntityFleetManagement {

    @Schema(description = "Brand of the vehicle", example = "Toyota")
    @Column(name = "brand", nullable = false, length = 100)
    private String brand;

    @Schema(description = "Model of the vehicle", example = "Corolla")
    @Column(name = "model", nullable = false, length = 100)
    private String model;

    @Schema(description = "License plate of the vehicle", example = "ABC123")
    @Column(name = "plate", nullable = false, length = 10, unique = true)
    private String plate;

    @Schema(description = "Vehicle category ID", example = "uuid-string")
    @Column(name = "vehicle_category_id", nullable = false)
    private String vehicleCategoryId;

    @Schema(description = "Vehicle status ID", example = "uuid-string")
    @Column(name = "vehicle_status_id", nullable = false)
    private String vehicleStatusId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_category_id", referencedColumnName = "id", insertable = false, updatable = false)
    private VehicleCategory vehicleCategory;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "vehicle_status_id", referencedColumnName = "id", insertable = false, updatable = false)
    private VehicleStatus vehicleStatus;
}