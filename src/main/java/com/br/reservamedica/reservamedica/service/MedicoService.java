package com.br.reservamedica.reservamedica.service;


import com.br.reservamedica.reservamedica.entity.Medico;
import com.br.reservamedica.reservamedica.repository.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MedicoService {

    @Autowired
    MedicoRepository repository;

    public Medico create(Medico medico) {
        return repository.save(medico);
    }
}
