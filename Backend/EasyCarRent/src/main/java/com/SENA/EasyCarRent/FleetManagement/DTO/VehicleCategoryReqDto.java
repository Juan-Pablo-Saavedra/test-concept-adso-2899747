package com.SENA.EasyCarRent.FleetManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "VehicleCategoryDto", description = "DTO que representa una categoría de vehículo")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class VehicleCategoryReqDto {
    @Schema(description = "Código de la categoría de vehículo", example = "SEDAN")
    private String code;

    @Schema(description = "Nombre de la categoría de vehículo", example = "Sedan")
    private String name;

    @Schema(description = "Descripción de la categoría de vehículo", example = "Vehículo de cuatro puertas para pasajeros")
    private String description;

    @Schema(description = "Estado de la categoría (activo/inactivo)", example = "true")
    private Boolean status;
}