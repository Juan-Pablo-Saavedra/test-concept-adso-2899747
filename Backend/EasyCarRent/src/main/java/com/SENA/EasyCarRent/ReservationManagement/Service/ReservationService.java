package com.SENA.EasyCarRent.ReservationManagement.Service;

import com.SENA.EasyCarRent.ReservationManagement.Entity.Reservation;
import com.SENA.EasyCarRent.ReservationManagement.IRepository.IBaseRepositoryReservationManagement;
import com.SENA.EasyCarRent.ReservationManagement.IRepository.IReservationRepository;
import com.SENA.EasyCarRent.ReservationManagement.IService.IReservationService;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationResDto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationService extends ABaseServiceReservationManagement<Reservation, ReservationReqDto, ReservationResDto> implements IReservationService {

    @Autowired
    private IReservationRepository repository;

    @Override
    protected IBaseRepositoryReservationManagement<Reservation, String> getRepository() {
        return repository;
    }

    @Override
    public ReservationResDto mapToResDto(Reservation entity) {
        ReservationResDto dto = new ReservationResDto();
        BeanUtils.copyProperties(entity, dto);
        // Additional fields like customerName, vehiclePlate, etc. can be set here if needed
        return dto;
    }

    @Override
    public Reservation mapToEntity(ReservationReqDto reqDto) {
        Reservation entity = new Reservation();
        BeanUtils.copyProperties(reqDto, entity);
        return entity;
    }
}