package com.SENA.EasyCarRent.ReservationManagement.Entity;

import io.swagger.v3.oas.annotations.media.Schema;
import jakarta.persistence.*;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@Entity
@Table(name = "reservation_status")
public class ReservationStatus extends ABaseEntityReservationManagement {

    @Schema(description = "Código del estado de reserva", example = "CONFIRMED")
    @Column(name = "code", nullable = false, length = 10, unique = true)
    private String code;

    @Schema(description = "Nombre del estado de reserva", example = "Confirmada")
    @Column(name = "name", nullable = false, length = 100)
    private String name;

    @Schema(description = "Descripción del estado de reserva", example = "Reserva confirmada y pagada")
    @Column(name = "description", nullable = false, length = 255)
    private String description;
}