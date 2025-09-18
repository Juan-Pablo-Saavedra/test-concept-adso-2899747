package com.SENA.EasyCarRent.ReservationManagement.Service;

import com.SENA.EasyCarRent.ReservationManagement.Entity.ReservationType;
import com.SENA.EasyCarRent.ReservationManagement.IRepository.IBaseRepositoryReservationManagement;
import com.SENA.EasyCarRent.ReservationManagement.IRepository.IReservationTypeRepository;
import com.SENA.EasyCarRent.ReservationManagement.IService.IReservationTypeService;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationTypeReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.ReservationTypeResDto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ReservationTypeService extends ABaseServiceReservationManagement<ReservationType, ReservationTypeReqDto, ReservationTypeResDto> implements IReservationTypeService {

    @Autowired
    private IReservationTypeRepository repository;

    @Override
    protected IBaseRepositoryReservationManagement<ReservationType, String> getRepository() {
        return repository;
    }

    @Override
    public ReservationTypeResDto mapToResDto(ReservationType entity) {
        ReservationTypeResDto dto = new ReservationTypeResDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public ReservationType mapToEntity(ReservationTypeReqDto reqDto) {
        ReservationType entity = new ReservationType();
        BeanUtils.copyProperties(reqDto, entity);
        return entity;
    }
}