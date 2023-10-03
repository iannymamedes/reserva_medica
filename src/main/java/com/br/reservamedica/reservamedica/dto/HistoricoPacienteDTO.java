package com.br.reservamedica.reservamedica.dto;

import com.br.reservamedica.reservamedica.entity.Consulta;
import lombok.Data;

import java.util.List;

@Data
public class HistoricoPacienteDTO {

    private String nomePaciente;
    private Consulta consulta;
    private List<RegistroPacienteDTO> registroPacienteDTO;
}
