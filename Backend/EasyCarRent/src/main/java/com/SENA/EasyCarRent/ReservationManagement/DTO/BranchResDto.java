package com.SENA.EasyCarRent.ReservationManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "BranchDto", description = "DTO que representa una sucursal")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class BranchResDto {
    @Schema(description = "ID único de la sucursal", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Código de la sucursal", example = "MAIN001")
    private String code;

    @Schema(description = "Nombre de la sucursal", example = "Sucursal Principal")
    private String name;

    @Schema(description = "Ubicación de la sucursal", example = "Calle Principal 123, Ciudad")
    private String location;

    @Schema(description = "Estado de la sucursal (activo/inactivo)", example = "true")
    private Boolean status;
}