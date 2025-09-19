package com.SENA.EasyCarRent.ReservationManagement.Service;

import com.SENA.EasyCarRent.ReservationManagement.Entity.Branch;
import com.SENA.EasyCarRent.ReservationManagement.IRepository.IBaseRepositoryReservationManagement;
import com.SENA.EasyCarRent.ReservationManagement.IRepository.IBranchRepository;
import com.SENA.EasyCarRent.ReservationManagement.IService.IBranchService;
import com.SENA.EasyCarRent.ReservationManagement.DTO.BranchReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.BranchResDto;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BranchService extends ABaseServiceReservationManagement<Branch, BranchReqDto, BranchResDto> implements IBranchService {

    @Autowired
    private IBranchRepository repository;

    @Override
    protected IBaseRepositoryReservationManagement<Branch, String> getRepository() {
        return repository;
    }

    @Override
    public BranchResDto mapToResDto(Branch entity) {
        BranchResDto dto = new BranchResDto();
        BeanUtils.copyProperties(entity, dto);
        return dto;
    }

    @Override
    public Branch mapToEntity(BranchReqDto reqDto) {
        Branch entity = new Branch();
        BeanUtils.copyProperties(reqDto, entity);
        return entity;
    }
}