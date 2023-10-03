package com.br.reservamedica.reservamedica.service;

import com.br.reservamedica.reservamedica.entity.Paciente;
import com.br.reservamedica.reservamedica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> listaTodos() {
        return repository.findAll();
    }

    public List<Paciente> listaPorNome(String nome) {
        return repository.findByNomeContainsIgnoreCase(nome);
    }

    public List<Paciente> listaPacienteConsulta(Long idConsulta) {
        return repository.listaPacienteConsulta(idConsulta);
    }

    public Paciente create(Paciente paciente) {
        return repository.save(paciente);
    }

    public Paciente update(Paciente paciente) {
        return repository.save(paciente);
    }

    public List<Paciente> findAll() {
        return repository.findAll();
    }

    public void delete(Long id) {
        repository.deleteById(id);
    }

    public Optional<Paciente> findById(Long id) {
        return repository.findById(id);
    }

}
