package com.SENA.EasyCarRent.CustomerManagement.IRepository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.SENA.EasyCarRent.CustomerManagement.Entity.ABaseEntityCustomerManagement;

public interface IBaseRepositoryCustomerManagement<T extends ABaseEntityCustomerManagement, ID> extends JpaRepository<T, ID>{
    // Métodos comunes para repositorios
}