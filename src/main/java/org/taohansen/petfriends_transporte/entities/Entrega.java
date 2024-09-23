package org.taohansen.petfriends_transporte.entities;

import jakarta.persistence.*;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
public class Entrega {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long pedidoId;
    private String destino;
    private LocalDate dataPrevisaoEntrega;
    private LocalDate dataRealizacaoEntrega;

    @Enumerated(EnumType.STRING)
    private StatusEntrega status;
}
