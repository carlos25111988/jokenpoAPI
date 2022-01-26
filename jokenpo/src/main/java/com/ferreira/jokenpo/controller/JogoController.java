package com.ferreira.jokenpo.controller;

import java.util.List;

import com.ferreira.jokenpo.model.Jogo;

//import java.util.List;

//import com.ferreira.jokenpo.model.Jogador;
//import com.ferreira.jokenpo.model.Jogo;
import com.ferreira.jokenpo.service.JogoService;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
//import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/jogos")
public class JogoController {

    JogadorController jogadorController = new JogadorController();
    JogadaController jogadaController = new JogadaController();

    @GetMapping // retorna a lista atualizada de jogos
    public static List<Jogo> getJogos() {

        new JogoService();
        return JogoService.getJogos();

    }

    @PostMapping // (value = "/{codigo}") // retorna a lista atualizada de jogos
    @ResponseStatus(HttpStatus.CREATED)
    public String verifyJogador(@RequestBody Jogo jogo) {
        new JogoService();
        return JogoService.addJogo(jogo, JogadorController.getJogadores(), JogadaController.getJogadas());
    }

}
