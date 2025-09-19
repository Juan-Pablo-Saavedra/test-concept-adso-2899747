package com.SENA.EasyCarRent.ReservationManagement.IRepository;

import com.SENA.EasyCarRent.ReservationManagement.Entity.Branch;
import org.springframework.stereotype.Repository;

@Repository
public interface IBranchRepository extends IBaseRepositoryReservationManagement<Branch, String> {
    // Métodos específicos para Branch si es necesario
}