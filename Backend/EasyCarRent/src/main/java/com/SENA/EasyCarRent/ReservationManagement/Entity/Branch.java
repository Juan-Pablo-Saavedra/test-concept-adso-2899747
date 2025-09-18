package com.SENA.EasyCarRent.ReservationManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "branch")
public class Branch extends ABaseEntityReservationManagement {

    @Schema(description = "Código de la sucursal", example = "MAIN001")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Schema(description = "Nombre de la sucursal", example = "Sucursal Principal")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Ubicación de la sucursal", example = "Calle Principal 123, Ciudad")
    @Column(name = "location", nullable = false, length = 255)
    private String location;
}