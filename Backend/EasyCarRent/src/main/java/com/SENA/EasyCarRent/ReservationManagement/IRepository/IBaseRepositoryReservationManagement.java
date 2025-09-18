package com.SENA.EasyCarRent.ReservationManagement.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SENA.EasyCarRent.ReservationManagement.Entity.ABaseEntityReservationManagement;

public interface IBaseRepositoryReservationManagement<T extends ABaseEntityReservationManagement, ID> extends JpaRepository<T, ID>{
    // Métodos comunes para repositorios
}