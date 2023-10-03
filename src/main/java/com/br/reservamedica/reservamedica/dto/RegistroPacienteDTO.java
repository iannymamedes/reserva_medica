package com.br.reservamedica.reservamedica.dto;

import com.br.reservamedica.reservamedica.entity.Email;
import com.br.reservamedica.reservamedica.entity.Medico;
import lombok.Data;

@Data
public class RegistroPacienteDTO {

    private String nome;
    private Medico medico;
    private Email email;
    private boolean retorno;

}
