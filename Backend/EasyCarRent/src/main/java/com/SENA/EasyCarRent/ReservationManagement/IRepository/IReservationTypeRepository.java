package com.SENA.EasyCarRent.ReservationManagement.IRepository;

import com.SENA.EasyCarRent.ReservationManagement.Entity.ReservationType;
import org.springframework.stereotype.Repository;

@Repository
public interface IReservationTypeRepository extends IBaseRepositoryReservationManagement<ReservationType, String> {
    // Métodos específicos para ReservationType si es necesario
}