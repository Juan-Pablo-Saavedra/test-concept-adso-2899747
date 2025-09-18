package com.SENA.EasyCarRent.ReservationManagement.Service;

import com.SENA.EasyCarRent.ReservationManagement.Entity.ReservationStatus;
import com.SENA.EasyCarRent.ReservationManagement.IRepository.IBaseRepositoryReservationManagement;
import com.SENA.EasyCarRent.ReservationManagement.IRepository.IReservationStatusRepository;
import com.SENA.EasyCarRent.ReservationManagement.IService.IReservationStatusService;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationStatusReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationStatusResDto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationStatusService extends ABaseServiceReservationManagement<ReservationStatus, ReservationStatusReqDto, ReservationStatusResDto> implements IReservationStatusService {

    @Autowired
    private IReservationStatusRepository repository;

    @Override
    protected IBaseRepositoryReservationManagement<ReservationStatus, String> getRepository() {
        return repository;
    }

    @Override
    public ReservationStatusResDto mapToResDto(ReservationStatus entity) {
        ReservationStatusResDto dto = new ReservationStatusResDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public ReservationStatus mapToEntity(ReservationStatusReqDto reqDto) {
        ReservationStatus entity = new ReservationStatus();
        BeanUtils.copyProperties(reqDto, entity);
        return entity;
    }
}