package com.ferreira.jokenpo.controller;

import java.util.List;

import com.ferreira.jokenpo.model.Jogador;
import com.ferreira.jokenpo.service.JogadorService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogadores")
public class JogadorController {

    @GetMapping // retorna a lista atualizada de jogadores
    public static List<Jogador> getJogadores() {

        new JogadorService();
        return JogadorService.getJogadores();

    }

    @PostMapping // adiciona jogador rebendo json no body e retorna o jogador adicionado
    @ResponseStatus(HttpStatus.CREATED)
    public String adicionar(@RequestBody Jogador jogador) {
        new JogadorService();
        return JogadorService.addJogador(jogador);
    }

    @DeleteMapping(value = "/{id}") // remove jogador rebendo a posição na request e retorna a mensagem de sucesso
    @ResponseStatus(HttpStatus.OK)
    public String remover(@PathVariable int id) {
        new JogadorService();
        return JogadorService.deleteJogador(id);
    }

}
