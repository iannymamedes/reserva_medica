package com.br.reservamedica.reservamedica.dto;


import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder(toBuilder = true)
@NoArgsConstructor
@AllArgsConstructor

public class PacienteConsultaDTO {

    private String nome;
    private String servico;
}
