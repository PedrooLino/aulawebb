package com.leilao.backend.model;

import org.hibernate.validator.constraints.br.CPF;
import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import lombok.Data;
import jakarta.persistence.ManyToOne;

import com.leilao.backend.model.Pessoa;

@Entity
@Data
@Table(name = "categoria")
public class categoria {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @NotBlank(message = "{validation.name.notblank}")
    private String nome;
    @JsonIgnore
    private String observacao;
    @ManyToOne
    private Pessoa pessoa;

}