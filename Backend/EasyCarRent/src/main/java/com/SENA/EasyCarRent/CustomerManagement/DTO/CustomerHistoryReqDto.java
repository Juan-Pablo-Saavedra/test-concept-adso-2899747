package com.SENA.EasyCarRent.CustomerManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "CustomerHistoryDto", description = "DTO que representa el historial de un cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class CustomerHistoryReqDto {
    @Schema(description = "Notas del historial del cliente", example = "Cliente actualizó información de contacto")
    private String notes;

    @Schema(description = "ID del cliente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String customerId;

    @Schema(description = "Estado del historial (activo/inactivo)", example = "true")
    private Boolean status;
}