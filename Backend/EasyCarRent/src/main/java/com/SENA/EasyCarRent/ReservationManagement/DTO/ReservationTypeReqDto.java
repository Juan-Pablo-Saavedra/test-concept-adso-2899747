package com.SENA.EasyCarRent.ReservationManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "ReservationTypeDto", description = "DTO que representa el tipo de reserva")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class ReservationTypeReqDto {
    @Schema(description = "Código del tipo de reserva", example = "DAILY")
    private String code;

    @Schema(description = "Nombre del tipo de reserva", example = "Diaria")
    private String name;

    @Schema(description = "Descripción del tipo de reserva", example = "Reserva por día completo")
    private String description;

    @Schema(description = "Estado del registro (activo/inactivo)", example = "true")
    private Boolean status;
}