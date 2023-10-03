package com.br.reservamedica.reservamedica.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.io.Serializable;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Entity

public class RegistroConsulta implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name= "consulta_id")
    private Consulta consulta;

    @ManyToOne
    @JoinColumn(name = "reservaPaciente_id")
    private ReservaPaciente paciente;

    @ManyToOne
    @JoinColumn(name = "medico_id")
    private Medico medico;

}
