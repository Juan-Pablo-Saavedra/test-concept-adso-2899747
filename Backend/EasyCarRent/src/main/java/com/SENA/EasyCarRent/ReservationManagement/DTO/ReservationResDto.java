package com.SENA.EasyCarRent.ReservationManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Schema(name = "ReservationDto", description = "DTO que representa una reserva")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationResDto {
    @Schema(description = "ID único de la reserva", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Fecha de inicio de la reserva", example = "2023-12-01")
    private LocalDate startDate;

    @Schema(description = "Fecha de fin de la reserva", example = "2023-12-05")
    private LocalDate endDate;

    @Schema(description = "ID del cliente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String customerId;

    @Schema(description = "Nombre del cliente", example = "John Doe")
    private String customerName;

    @Schema(description = "ID del vehículo", example = "123e4567-e89b-12d3-a456-426614174000")
    private String vehicleId;

    @Schema(description = "Placa del vehículo", example = "ABC123")
    private String vehiclePlate;

    @Schema(description = "ID del estado de reserva", example = "123e4567-e89b-12d3-a456-426614174000")
    private String reservationStatusId;

    @Schema(description = "Nombre del estado de reserva", example = "Confirmada")
    private String reservationStatusName;

    @Schema(description = "ID de la sucursal", example = "123e4567-e89b-12d3-a456-426614174000")
    private String branchId;

    @Schema(description = "Nombre de la sucursal", example = "Sucursal Principal")
    private String branchName;

    @Schema(description = "ID del tipo de reserva", example = "123e4567-e89b-12d3-a456-426614174000")
    private String reservationTypeId;

    @Schema(description = "Nombre del tipo de reserva", example = "Diaria")
    private String reservationTypeName;

    @Schema(description = "Estado de la reserva (activo/inactivo)", example = "true")
    private Boolean status;
}