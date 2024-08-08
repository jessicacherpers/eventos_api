package com.hellow.eventos.controller;

import com.hellow.eventos.classes.endereco.Endereco;
import com.hellow.eventos.classes.endereco.EnderecoRepository;
import com.hellow.eventos.classes.tipo.Tipo;
import com.hellow.eventos.classes.tipo.TipoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import java.util.List;

public class EndrecoController {
    @Autowired
    private EnderecoRepository enderecoRepository;

    @GetMapping("todos")
    public List<Endereco> getAllEndereco(){

        return this.enderecoRepository.findAll();

    }

    @PostMapping("add")
    public Endereco addEndereco(@RequestBody Endereco endereco){
        this.enderecoRepository.save(endereco);
        return endereco;

    }

}



