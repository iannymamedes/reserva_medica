package com.br.reservamedica.reservamedica.service;

import com.br.reservamedica.reservamedica.entity.Consulta;
import com.br.reservamedica.reservamedica.entity.Paciente;
import com.br.reservamedica.reservamedica.repository.ConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.Entity;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import java.util.List;
import java.util.Optional;

@Service
public class ConsultaService {

    @Autowired
    ConsultaRepository repository;

    @PersistenceContext
    private EntityManager entityManager;

    public Consulta create (Consulta consulta) {
        return repository.save(consulta);
    }

    public List<Consulta> findAll() {
        return repository.findAll();
    }

    public Optional<Consulta> findById(Long id) {
        return repository.findById(id);
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public List<Paciente> buscarListaPaciente(Long id) {
        Query query = entityManager.createNativeQuery("select p.* from reserva_medica.consulta c" +
                " inner join reserva_medica.reseva_medica pr on r.id = pr.id_consulta" +
                " inner join reseva_medica.paciente p on pr.id_paciente = p.id" +
                " where c.id = " + id, "PacientesConsultasMapping");
        List<Paciente> pessoas = query.getResultList();
        return pessoas;
    }

}
