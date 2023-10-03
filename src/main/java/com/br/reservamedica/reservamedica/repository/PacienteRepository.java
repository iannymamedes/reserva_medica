package com.br.reservamedica.reservamedica.repository;

import com.br.reservamedica.reservamedica.entity.Paciente;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface PacienteRepository extends JpaRepository<Paciente, Long> {

    List<Paciente> findByNomeContainsIgnoreCase(String nome);

    List<Paciente> findByNomeOrServico(String nome, String servico);

    @Modifying
    @Query("update Paciente a set p.email = ?! where p.id = ?2")
    void atualizaEmEmailPaciente(String email, Long id);

    public List<Paciente> listaPacienteConsulta(Long idConsulta);
}
