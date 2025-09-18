package com.SENA.EasyCarRent.ReservationManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.time.LocalDate;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "reservation")
public class Reservation extends ABaseEntityReservationManagement {

    @Schema(description = "Fecha de inicio de la reserva", example = "2023-12-01")
    @Column(name = "start_date", nullable = false)
    private LocalDate startDate;

    @Schema(description = "Fecha de fin de la reserva", example = "2023-12-05")
    @Column(name = "end_date", nullable = false)
    private LocalDate endDate;

    @Schema(description = "ID del cliente", example = "123e4567-e89b-12d3-a456-426614174000")
    @Column(name = "customer_id", nullable = false)
    private String customerId;

    @Schema(description = "ID del vehículo", example = "123e4567-e89b-12d3-a456-426614174000")
    @Column(name = "vehicle_id", nullable = false)
    private String vehicleId;

    @Schema(description = "ID del estado de reserva", example = "123e4567-e89b-12d3-a456-426614174000")
    @Column(name = "reservation_status_id", nullable = false)
    private String reservationStatusId;

    @Schema(description = "ID de la sucursal", example = "123e4567-e89b-12d3-a456-426614174000")
    @Column(name = "branch_id", nullable = false)
    private String branchId;

    @Schema(description = "ID del tipo de reserva", example = "123e4567-e89b-12d3-a456-426614174000")
    @Column(name = "reservation_type_id", nullable = false)
    private String reservationTypeId;

    // Foreign key relationships would be added here
    // @ManyToOne relationships to Customer, Vehicle, ReservationStatus, Branch, ReservationType
}