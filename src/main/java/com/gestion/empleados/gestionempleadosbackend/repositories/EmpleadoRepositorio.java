package com.gestion.empleados.gestionempleadosbackend.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.gestion.empleados.gestionempleadosbackend.model.Empleado;

@Repository
public interface EmpleadoRepositorio extends JpaRepository<Empleado, Long> {
    
}
