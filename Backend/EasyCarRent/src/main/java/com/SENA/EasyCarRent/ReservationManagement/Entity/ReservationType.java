package com.SENA.EasyCarRent.ReservationManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "reservation_type")
public class ReservationType extends ABaseEntityReservationManagement {

    @Schema(description = "Código del tipo de reserva", example = "DAILY")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Schema(description = "Nombre del tipo de reserva", example = "Diaria")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Descripción del tipo de reserva", example = "Reserva por día completo")
    @Column(name = "description", nullable = false, length = 255)
    private String description;
}