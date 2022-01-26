package com.ferreira.jokenpo.service;

import java.util.ArrayList;
import java.util.List;

import com.ferreira.jokenpo.model.Jogada;

public class JogadaService {
    static List<Jogada> listaJogadas = new ArrayList<>();

    // método para listar as jogadas
    public static List<Jogada> getJogadas() {

        return listaJogadas;

    }

    // método para adicionar jogada na lista
    public static String addJogada(Jogada jogada) {

        int contListaJogadas = 0;
        Boolean jogadaAdicionada = false;

        if (jogada.getjogadaNome().toUpperCase().equals("PEDRA") ||
                jogada.getjogadaNome().toUpperCase().equals("PAPEL") ||
                jogada.getjogadaNome().toUpperCase().equals("TESOURA")) {

            if (listaJogadas.size() > 0) {

                while (contListaJogadas < listaJogadas.size()) {

                    if (listaJogadas.get(contListaJogadas).getjogadaNome().toUpperCase()
                            .equals(jogada.getjogadaNome().toUpperCase())) {

                        jogadaAdicionada = true;

                    }

                    contListaJogadas++;

                }

                if (!jogadaAdicionada) {

                    listaJogadas.add(jogada);
                    return "Jogada adicionada com sucesso!";

                } else {

                    return "A jogada já foi adicionada!";

                }

            } else {

                listaJogadas.add(jogada);
                return "Jogada adicionada com sucesso!";

            }

        } else {

            return "A jogada informada é inválida!";
        }

    }

    // método para remover jogada na lista
    public static String deleteJogada(int posicao) {

        if (listaJogadas.size() > 0) {

            if (posicao > 0 && posicao < listaJogadas.size()) {

                listaJogadas.remove(posicao);
                return "jogada removida com sucesso!";

            } else {

                return "A posição a ser removida não existe na lista!";
            }

        } else {

            return "A lista está vazia!";

        }

    }
}
