package com.br.reservamedica.reservamedica.service;

import com.br.reservamedica.reservamedica.dto.PacienteServicoDTO;
import com.br.reservamedica.reservamedica.entity.Paciente;
import com.br.reservamedica.reservamedica.repository.PacienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
public class PacienteService {

    @Autowired
    private PacienteRepository repository;

    public List<Paciente> listaTodos() {
        return repository.findAll();
    }

    public List<Paciente> listaPorNome(String nome){
        return repository.findByNomeContainsIgnoreCase(nome);
    }

    public List<Paciente> listaPorNomeOrServico(PacienteServicoDTO dto){
        return repository.findByNomeOrServico(dto.getNome(), dto.getServico());
    }

    @Transactional
    public void atualizaEmailPaciente(String email, Long id){
        repository.atualizaEmEmailPaciente(email, id);
    }

    public List<Paciente> listaPacienteEspecialista(Long idEspecialista){
        return repository.listaPacienteEspecialista(idEspecialista);
    }
}
