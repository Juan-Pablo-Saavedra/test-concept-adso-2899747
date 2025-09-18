package com.SENA.EasyCarRent.ReservationManagement.Controller;

import com.SENA.EasyCarRent.ReservationManagement.Entity.Branch;
import com.SENA.EasyCarRent.ReservationManagement.IService.IBranchService;
import com.SENA.EasyCarRent.ReservationManagement.DTO.BranchReqDto;
import com.SENA.EasyCarRent.ReservationManagement.DTO.BranchResDto;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/branches")
public class BranchController extends ABaseControllerReservationManagement<Branch, BranchReqDto, BranchResDto, IBranchService> {

    @Autowired
    public BranchController(IBranchService service) {
        super(service, "Branch");
    }
}