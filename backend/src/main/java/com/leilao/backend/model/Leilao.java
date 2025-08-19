//titulo: String
//descricao: String
//descricaoDetalhada: String
//dataHoraInicio: DateTime
//dataHoraFim: DateTime
//status: StatusLeilao
//observacao: String
//valorIncremento: Float
//lanceMinimo: Float

package com.leilao.backend.model;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Data
@Table(name = "leilao")
public class Leilao {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
}

