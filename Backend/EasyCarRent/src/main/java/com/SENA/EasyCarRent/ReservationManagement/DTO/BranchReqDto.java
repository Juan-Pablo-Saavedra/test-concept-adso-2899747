package com.SENA.EasyCarRent.ReservationManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "BranchDto", description = "DTO que representa una sucursal")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class BranchReqDto {
    @Schema(description = "Código de la sucursal", example = "MAIN001")
    private String code;

    @Schema(description = "Nombre de la sucursal", example = "Sucursal Principal")
    private String name;

    @Schema(description = "Ubicación de la sucursal", example = "Calle Principal 123, Ciudad")
    private String location;

    @Schema(description = "Estado de la sucursal (activo/inactivo)", example = "true")
    private Boolean status;
}