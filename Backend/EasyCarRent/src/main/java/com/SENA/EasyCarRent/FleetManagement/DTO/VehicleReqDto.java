package com.SENA.EasyCarRent.FleetManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "VehicleDto", description = "DTO que representa un vehículo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleReqDto {
    @Schema(description = "Marca del vehículo", example = "Toyota")
    private String brand;

    @Schema(description = "Modelo del vehículo", example = "Corolla")
    private String model;

    @Schema(description = "Placa del vehículo", example = "ABC123")
    private String plate;

    @Schema(description = "ID de la categoría del vehículo", example = "123e4567-e89b-12d3-a456-426614174000")
    private String vehicleCategoryId;

    @Schema(description = "ID del estado del vehículo", example = "123e4567-e89b-12d3-a456-426614174000")
    private String vehicleStatusId;

    @Schema(description = "Estado del vehículo (activo/inactivo)", example = "true")
    private Boolean status;
}