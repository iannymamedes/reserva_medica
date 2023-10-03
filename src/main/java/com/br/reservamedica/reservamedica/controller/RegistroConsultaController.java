package com.br.reservamedica.reservamedica.controller;


import com.br.reservamedica.reservamedica.dto.RegistroPacienteDTO;
import com.br.reservamedica.reservamedica.entity.RegistroConsulta;
import com.br.reservamedica.reservamedica.service.RegistroConsultaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/registro-consulta")
public class RegistroConsultaController {

    @Autowired
    RegistroConsultaService service;

    @PostMapping
    @ResponseStatus(HttpStatus.CREATED)
    public ResponseEntity<RegistroConsulta> create(@RequestBody RegistroConsulta registroConsulta) {
        RegistroConsulta entidade = service.create(registroConsulta);

        return ResponseEntity.status(201).body(entidade);
    }

    @PatchMapping("/update-consultas/{consultaId}/{reservaPacienteId}")
    @ResponseStatus(HttpStatus.OK)
    public void patchGrades(@RequestBody RegistroPacienteDTO registroPacienteDTO, @PathVariable Long consultaId,
                            @PathVariable Long ReservaPacienteId) {
        service.getRegistroConsulta(ReservaPacienteId);
    }
}
