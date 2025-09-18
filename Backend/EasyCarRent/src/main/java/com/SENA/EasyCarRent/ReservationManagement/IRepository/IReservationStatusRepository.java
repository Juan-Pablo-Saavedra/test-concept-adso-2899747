package com.SENA.EasyCarRent.ReservationManagement.IRepository;

import com.SENA.EasyCarRent.ReservationManagement.Entity.ReservationStatus;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationStatusRepository extends IBaseRepositoryReservationManagement<ReservationStatus, String> {
    // Métodos específicos para ReservationStatus si es necesario
}