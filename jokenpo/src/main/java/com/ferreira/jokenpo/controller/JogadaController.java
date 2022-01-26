package com.ferreira.jokenpo.controller;

import java.util.List;

import com.ferreira.jokenpo.model.Jogada;
import com.ferreira.jokenpo.service.JogadaService;
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
@RequestMapping("/jogadas")
public class JogadaController {

    @GetMapping // retorna a lista atualizada de jogadas
    public static List<Jogada> getJogadas() {

        new JogadaService();
        return JogadaService.getJogadas();

    }

    @PostMapping // adiciona jogada rebendo json no body e retorna a jogada adicionado
    @ResponseStatus(HttpStatus.CREATED)
    public String adicionar(@RequestBody Jogada jogada) {
        new JogadaService();
        return JogadaService.addJogada(jogada);
    }

    @DeleteMapping(value = "/{id}") // remove jogada rebendo a posição na request e retorna a mensagem de sucesso
    @ResponseStatus(HttpStatus.OK)
    public String remover(@PathVariable int id) { // nome do paramentro(id) deve ser igual ao da request({id})
        new JogadaService();
        return JogadaService.deleteJogada(id);
    }

}
