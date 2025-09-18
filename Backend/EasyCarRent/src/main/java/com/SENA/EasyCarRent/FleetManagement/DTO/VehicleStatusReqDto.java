package com.SENA.EasyCarRent.FleetManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "VehicleStatusDto", description = "DTO que representa el estado de un vehículo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleStatusReqDto {
    @Schema(description = "Código del estado del vehículo", example = "AVAILABLE")
    private String code;

    @Schema(description = "Nombre del estado del vehículo", example = "Disponible")
    private String name;

    @Schema(description = "Descripción del estado del vehículo", example = "Vehículo disponible para alquiler")
    private String description;

    @Schema(description = "Estado del registro (activo/inactivo)", example = "true")
    private Boolean status;
}