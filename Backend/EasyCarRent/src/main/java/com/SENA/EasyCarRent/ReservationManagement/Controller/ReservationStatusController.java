package com.SENA.EasyCarRent.ReservationManagement.Controller;

import com.SENA.EasyCarRent.ReservationManagement.Entity.ReservationStatus;
import com.SENA.EasyCarRent.ReservationManagement.IService.IReservationStatusService;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationStatusReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationStatusResDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservation-statuses")
public class ReservationStatusController extends ABaseControllerReservationManagement<ReservationStatus, ReservationStatusReqDto, ReservationStatusResDto, IReservationStatusService> {

    @Autowired
    public ReservationStatusController(IReservationStatusService service) {
        super(service, "ReservationStatus");
    }
}