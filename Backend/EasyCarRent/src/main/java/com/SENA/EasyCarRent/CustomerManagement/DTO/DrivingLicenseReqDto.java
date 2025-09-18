package com.SENA.EasyCarRent.CustomerManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Schema(name = "DrivingLicenseDto", description = "DTO que representa una licencia de conducir")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class DrivingLicenseReqDto {
    @Schema(description = "Número de la licencia", example = "DL123456789")
    private String licenseNumber;

    @Schema(description = "Categoría de la licencia", example = "B")
    private String category;

    @Schema(description = "Fecha de expiración de la licencia", example = "2025-12-31")
    private LocalDate expiryDate;

    @Schema(description = "ID del cliente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String customerId;

    @Schema(description = "Estado de la licencia (activo/inactivo)", example = "true")
    private Boolean status;
}