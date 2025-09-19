package com.SENA.EasyCarRent.ReservationManagement.IRepository;

import com.SENA.EasyCarRent.ReservationManagement.Entity.Reservation;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationRepository extends IBaseRepositoryReservationManagement<Reservation, String> {
    // Métodos específicos para Reservation si es necesario
}