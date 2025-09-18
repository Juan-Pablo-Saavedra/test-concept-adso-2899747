package com.SENA.EasyCarRent.ReservationManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "ReservationStatusDto", description = "DTO que representa el estado de una reserva")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ReservationStatusResDto {
    @Schema(description = "ID único del estado de reserva", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Código del estado de reserva", example = "CONFIRMED")
    private String code;

    @Schema(description = "Nombre del estado de reserva", example = "Confirmada")
    private String name;

    @Schema(description = "Descripción del estado de reserva", example = "Reserva confirmada y pagada")
    private String description;

    @Schema(description = "Estado del registro (activo/inactivo)", example = "true")
    private Boolean status;
}