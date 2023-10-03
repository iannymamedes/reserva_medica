package com.br.reservamedica.reservamedica.controller;


import com.br.reservamedica.reservamedica.entity.Consulta;
import com.br.reservamedica.reservamedica.entity.Paciente;
import com.br.reservamedica.reservamedica.service.ConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/consulta")
public class ConsultaController {

    @Autowired
    ConsultaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<Consulta> create(@RequestBody Consulta consulta) {
        Consulta consultaCreated = service.create(consulta);

        return ResponseEntity.status(201).body(consultaCreated);
    }

    @GetMapping("/listar-todss")
    @ResponseStatus(HttpStatus.OK)
    public List<Consulta> findAll() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    @ResponseStatus(HttpStatus.OK)
    public Optional<Consulta> findById(@PathVariable Long id) {
        return service.findById(id);
    }

    @DeleteMapping("/{id}")
    @ResponseStatus(HttpStatus.NO_CONTENT)
    public void delete(@PathVariable Long id) {
        service.delete(id);
    }

    @PostMapping(value = "consulta-lista-paciente/{id}")
    public List<Paciente> cusultaListaPacientes(@PathVariable Long id) {

        return service.buscarListaPaciente(id);
    }
}
