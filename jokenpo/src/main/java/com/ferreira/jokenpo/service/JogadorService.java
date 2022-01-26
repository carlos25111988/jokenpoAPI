package com.ferreira.jokenpo.service;

import java.util.ArrayList;
import java.util.List;

import com.ferreira.jokenpo.model.Jogador;

public class JogadorService {

    static List<Jogador> listaJogadores = new ArrayList<>();

    // método para listar os jogadores
    public static List<Jogador> getJogadores() {

        return listaJogadores;

    }

    // método para adicionar jogador na lista
    public static String addJogador(Jogador jogador) {

        listaJogadores.add(jogador);
        return "Jogador adicionado com sucesso!";

    }

    // método para remover jogador na lista
    public static String deleteJogador(int posicao) {

        if (listaJogadores.size() > 0) {

            if (posicao > 0 && posicao < listaJogadores.size()) {

                listaJogadores.remove(posicao);
                return "jogador removido com sucesso!";

            } else {

                return "A posição a ser removida não existe na lista!";
            }

        } else {

            return "A lista está vazia!";

        }

    }
}
