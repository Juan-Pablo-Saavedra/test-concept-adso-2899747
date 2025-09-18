package com.SENA.EasyCarRent.ReservationManagement.IService;

import com.SENA.EasyCarRent.ReservationManagement.Entity.Reservation;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationResDto;

public interface IReservationService extends IBaseServiceReservationManagement<Reservation, ReservationReqDto, ReservationResDto> {
    // Métodos específicos para Reservation si es necesario
}