package com.SENA.EasyCarRent.ReservationManagement.Controller;

import com.SENA.EasyCarRent.ReservationManagement.Entity.Reservation;
import com.SENA.EasyCarRent.ReservationManagement.IService.IReservationService;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationResDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservations")
public class ReservationController extends ABaseControllerReservationManagement<Reservation, ReservationReqDto, ReservationResDto, IReservationService> {

    @Autowired
    public ReservationController(IReservationService service) {
        super(service, "Reservation");
    }
}