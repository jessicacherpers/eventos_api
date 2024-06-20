package com.hellow.eventos.classes.evento;


import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.tipo.Tipo;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity(name="tipo")
@Table(name="tipo")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Evento {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String nome;

    private Date data;

    private String descricao;

    private Integer lotacao;

    private Endereco endereco;

    private Tipo tipo;




}
