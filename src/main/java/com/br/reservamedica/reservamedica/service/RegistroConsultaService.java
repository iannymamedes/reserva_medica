package com.br.reservamedica.reservamedica.service;

import com.br.reservamedica.reservamedica.entity.RegistroConsulta;
import com.br.reservamedica.reservamedica.repository.RegistroConsultaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RegistroConsultaService {

    @Autowired
    private RegistroConsultaRepository repository;
    public RegistroConsulta create(RegistroConsulta registroConsulta) {
        return repository.save(registroConsulta);
    }

    public void getRegistroConsulta(Long reservaPacienteId) {
    }
}
