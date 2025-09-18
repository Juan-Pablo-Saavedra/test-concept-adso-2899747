package com.SENA.EasyCarRent.CustomerManagement.DTO;

import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Schema(name = "CustomerDto", description = "DTO que representa un cliente")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class CustomerResDto {
    @Schema(description = "ID único del cliente", example = "123e4567-e89b-12d3-a456-426614174000")
    private String id;

    @Schema(description = "Nombre del cliente", example = "John")
    private String firstName;

    @Schema(description = "Apellido del cliente", example = "Doe")
    private String lastName;

    @Schema(description = "Número de documento del cliente", example = "123456789")
    private String documentNumber;

    @Schema(description = "Número de teléfono del cliente", example = "+1234567890")
    private String phone;

    @Schema(description = "Correo electrónico del cliente", example = "john.doe@example.com")
    private String email;

    @Schema(description = "Dirección del cliente", example = "123 Main St")
    private String address;

    @Schema(description = "Estado del cliente (activo/inactivo)", example = "true")
    private Boolean status;
}