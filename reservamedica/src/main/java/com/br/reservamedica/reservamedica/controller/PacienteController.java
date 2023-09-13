package com.br.reservamedica.reservamedica.controller;


import com.br.reservamedica.reservamedica.dto.PacienteServicoDTO;
import com.br.reservamedica.reservamedica.entity.Paciente;
import com.br.reservamedica.reservamedica.service.PacienteService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/pacientes")

public class PacienteController {

    @Autowired
    PacienteService service;

    @GetMapping("/listar-todos")
    @ResponseStatus(HttpStatus.OK)

    public List<Paciente> findAll() {
        return service.listaTodos();
    }

    @GetMapping("/listar-por-nome/{nome}")
    @ResponseStatus(HttpStatus.OK)
    public List<Paciente> buscarNome(@PathVariable String nome) {
        return service.listaPorNome(nome);
    }

    @PostMapping("/listar-por-nome-servico")
    @ResponseStatus(HttpStatus.OK)
    public List<Paciente> buscarNomeOrCurso(@RequestBody PacienteServicoDTO dto) {
        return service.listaPorNomeOrServico(dto);
    }

    @GetMapping("/atualiza-email/{email}/{id}")
    @ResponseStatus(HttpStatus.OK)
    public void atualizaEmail(@PathVariable String email, @PathVariable Long id) {

        service.atualizaEmailPaciente(email, id);
    }

    @GetMapping("/listar-aluno-diciplina/{idDiciplina}")
    @ResponseStatus(HttpStatus.OK)
    public List<Paciente> listarAlunoDiciplina(@PathVariable Long idDiciplina) {
        return service.listaPacienteEspecialista(idDiciplina);
    }


}
