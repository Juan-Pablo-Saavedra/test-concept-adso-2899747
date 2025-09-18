package com.SENA.EasyCarRent.FleetManagement.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SENA.EasyCarRent.FleetManagement.Entity.ABaseEntityFleetManagement;

public interface IBaseRepositoryFleetManagement<T extends ABaseEntityFleetManagement, ID> extends JpaRepository<T, ID>{
    // Métodos comunes para repositorios
}