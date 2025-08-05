package com.leilao.backend.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import com.leilao.backend.dto.PessoaRequisicaoDTO;
import com.leilao.backend.service.AutenticacaoService;

@RestController
@RequestMapping("/autenticacao")
public class AutenticacaoController {

    @Autowired
    private AutenticacaoService autenticacaoService;

    @PostMapping("/login")
    public String login(@RequestBody PessoaRequisicaoDTO pessoa) {
        return autenticacaoService.autenticar(pessoa);
    }

    @PostMapping("/teste")
    public String gerarSenha() {
        BCryptPasswordEncoder enconde = new BCryptPasswordEncoder();
        return enconde.encode("123");
    }
}
