package com.br.reservamedica.reservamedica.repository;

import com.br.reservamedica.reservamedica.entity.Medico;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MedicoRepository extends JpaRepository<Medico, Long> {
}
