package com.br.reservamedica.reservamedica.repository;

import com.br.reservamedica.reservamedica.entity.RegistroConsulta;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface RegistroConsultaRepository extends JpaRepository<RegistroConsulta, Long> {

    RegistroConsulta findByConsultaIDAndReservaPacienteId(Long consultaId, Long ReservaPacienteId);

    List<RegistroConsulta> findByConsultaId(Long ConsultaId);
}
