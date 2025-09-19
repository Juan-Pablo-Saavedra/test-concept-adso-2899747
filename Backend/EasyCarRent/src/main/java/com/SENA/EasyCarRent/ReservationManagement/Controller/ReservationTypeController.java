package com.SENA.EasyCarRent.ReservationManagement.Controller;

import com.SENA.EasyCarRent.ReservationManagement.Entity.ReservationType;
import com.SENA.EasyCarRent.ReservationManagement.IService.IReservationTypeService;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationTypeReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationTypeResDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/reservation-types")
public class ReservationTypeController extends ABaseControllerReservationManagement<ReservationType, ReservationTypeReqDto, ReservationTypeResDto, IReservationTypeService> {

    @Autowired
    public ReservationTypeController(IReservationTypeService service) {
        super(service, "ReservationType");
    }
}