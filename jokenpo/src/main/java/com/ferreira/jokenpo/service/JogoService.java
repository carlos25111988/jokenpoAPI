package com.ferreira.jokenpo.service;

import java.util.ArrayList;
import java.util.List;

import com.ferreira.jokenpo.model.Jogada;
import com.ferreira.jokenpo.model.Jogador;
import com.ferreira.jokenpo.model.Jogo;

public class JogoService {

    static List<Jogo> listaJogos = new ArrayList<>();

    // método para listar os jogos
    public static List<Jogo> getJogos() {

        return listaJogos;

    }

    // método para adicionar jogo na lista
    public static String addJogo(Jogo jogo, List<Jogador> listaJogadores, List<Jogada> listaJogadas) {

        int ContJogadores = 0;
        int ContJogadas = 0;
        String Retorno = "";
        Boolean JogAdicionado = false;

        if (listaJogos.size() > 0) {

            // percorre a lista para verificar se o jogador já existe no jogo
            while (ContJogadores < listaJogos.size()) {

                if (listaJogos.get(ContJogadores).getCodigoJogador().equals(jogo.getCodigoJogador())) {
                    JogAdicionado = true;
                }

                ContJogadores++;
            }

        }

        // inicia o contador da lista
        ContJogadores = 0;

        // se o jogador não existe no jogo adiciona
        if (!JogAdicionado) {

            // Verifica se existe jogador cadastrado
            if (listaJogadores.size() > 0) {

                // percorre a lista para adicionar o jogo
                while (ContJogadores < listaJogadores.size()) {

                    if (listaJogos.size() > 0) {

                        // verifica se o jogador informado já foi cadastrado
                        if (listaJogadores.get(ContJogadores).getCodigo().equals(jogo.getCodigoJogador())) {
                            // se o jogador estiver cadastrado iguala o contador ao tamanho da lista
                            // para finalar o primeiro loop
                            ContJogadores = listaJogadores.size();

                            // se tiver jogadas cadastradas
                            if (listaJogadas.size() > 0) {

                                // percorre a lista para adicionar a jogada
                                while (ContJogadas < listaJogadas.size()) {
                                    // verifica se a jogada informado já foi cadastrada
                                    if (listaJogadas.get(ContJogadas).getjogadaNome().equals(jogo.getNomeJogada())) {

                                        // se a jogada estiver cadastrada iguala o contador ao tamanho da lista
                                        // para finalar o segundo loop, adiciona a primeira jogada e jogador
                                        // e obtem a mensagem de retorno
                                        listaJogos.add(jogo);
                                        ContJogadas = listaJogadas.size();

                                        if (listaJogos.size() == 3) {

                                            Retorno = "Jogo adicionado com sucesso! \n" +
                                                    JogoService.endJogo();

                                        } else {

                                            Retorno = "Jogo adicionado com sucesso!";

                                        }
                                    }

                                    ContJogadas++;
                                }

                            } else {

                                Retorno = "A jogada informada não foi cadastrada!";

                            }

                        } else {
                            Retorno = "O jogador informado ou a jogada não foram cadastrados!";

                        }

                    } else {

                        // A lista está vazia
                        // iguala o contador ao tamanho da lista
                        // para finalar o primeiro loop
                        ContJogadores = listaJogadores.size();

                        if (listaJogadas.size() > 0) {

                            // percorre a lista para adicionar a jogada
                            while (ContJogadas < listaJogadas.size()) {

                                // iguala o contador ao tamanho da lista
                                // para finalizar o primeiro loop
                                ContJogadores = listaJogadores.size();

                                // verifica se a jogada informada já foi cadastrada
                                if (listaJogadas.get(ContJogadas).getjogadaNome().equals(jogo.getNomeJogada())) {

                                    // se a jogada estiver cadastrada iguala o contador ao tamanho da lista
                                    // para finalar o segundo loop, adiciona a primeira jogada e jogador
                                    // e obtem a mensagem de retorno
                                    listaJogos.add(jogo);
                                    ContJogadas = listaJogadas.size();

                                    if (listaJogos.size() == 3) {

                                        Retorno = "Jogo adicionado com sucesso! \n" +
                                                JogoService.endJogo();

                                    } else {

                                        Retorno = "Jogo adicionado com sucesso!";

                                    }
                                } else {

                                    Retorno = "A jogada informada não foi cadastrada!";
                                }

                                ContJogadas++;
                            }

                        } else {

                            Retorno = "A jogada informada não foi cadastrada!";

                        }

                    }

                    ContJogadores++;

                }
            } else {

                Retorno = "Não existe nenhum jogador cadastrado!";

            }
        } else {

            Retorno = "O jogador informado já foi adicionado ao jogo!";

        }

        return Retorno;

    }

    // metodo para verificar o ganhador
    public static String endJogo() {

        int TamanhoListaJogo = listaJogos.size();
        String Retorno = "";
        // int ContListaJogo = 0;

        if (TamanhoListaJogo == 3) {

            // verifica se o jogo empatou por todos serem iguais
            if (listaJogos.get(0).getNomeJogada().equals(listaJogos.get(1).getNomeJogada()) &&
                    listaJogos.get(0).getNomeJogada().equals(listaJogos.get(2).getNomeJogada())) {

                Retorno = "O jogo terminou empatado!";

            } else {

                // verifica se o jogo empatou por todos serem diferentes
                if (!listaJogos.get(0).getNomeJogada().equals(listaJogos.get(1).getNomeJogada()) &&
                        !listaJogos.get(0).getNomeJogada().equals(listaJogos.get(2).getNomeJogada()) &&
                        !listaJogos.get(1).getNomeJogada().equals(listaJogos.get(2).getNomeJogada())) {

                    Retorno = "O jogo terminou empatado";

                } else {

                    // primeira variação
                    // verifica se algum jogador informou: pedra
                    if (listaJogos.get(0).getNomeJogada().toUpperCase().equals("PEDRA") ||
                            listaJogos.get(1).getNomeJogada().toUpperCase().equals("PEDRA") ||
                            listaJogos.get(2).getNomeJogada().toUpperCase().equals("PEDRA")) {

                        // verifica se algum jogador informou: papel
                        if (listaJogos.get(0).getNomeJogada().toUpperCase().equals("PAPEL") ||
                                listaJogos.get(1).getNomeJogada().toUpperCase().equals("PAPEL") ||
                                listaJogos.get(2).getNomeJogada().toUpperCase().equals("PAPEL")) {

                            if (listaJogos.get(0).getNomeJogada().toUpperCase().equals("PAPEL")) {

                                Retorno = Retorno + "O jogador: " + listaJogos.get(0).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                            if (listaJogos.get(1).getNomeJogada().toUpperCase().equals("PAPEL")) {

                                Retorno = Retorno + "O jogador: " + listaJogos.get(1).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                            if (listaJogos.get(2).getNomeJogada().toUpperCase().equals("PAPEL")) {

                                Retorno = Retorno + "O jogador: " + listaJogos.get(2).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                        } else {

                            // verifica o jogador que informou pedra pois o mesmo venceu
                            if (listaJogos.get(0).getNomeJogada().toUpperCase().equals("PEDRA")) {

                                Retorno = Retorno + "O jogador: " + listaJogos.get(0).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                            if (listaJogos.get(1).getNomeJogada().toUpperCase().equals("PEDRA")) {

                                Retorno = Retorno + "O jogador: " + listaJogos.get(1).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                            if (listaJogos.get(2).getNomeJogada().toUpperCase().equals("PEDRA")) {

                                Retorno = Retorno + "O jogador: " + listaJogos.get(2).getCodigoJogador()
                                        + " ganhou! \n";

                            }
                        }

                    } else {

                        if (listaJogos.get(0).getNomeJogada().toUpperCase().equals("TESOURA")) {

                            Retorno = Retorno + "O jogador: " + listaJogos.get(0).getCodigoJogador() + " ganhou! \n";

                        }

                        if (listaJogos.get(1).getNomeJogada().toUpperCase().equals("TESOURA")) {

                            Retorno = Retorno + "O jogador: " + listaJogos.get(1).getCodigoJogador() + " ganhou! \n";

                        }

                        if (listaJogos.get(2).getNomeJogada().toUpperCase().equals("TESOURA")) {

                            Retorno = Retorno + "O jogador: " + listaJogos.get(2).getCodigoJogador() + " ganhou! \n";

                        }
                    }

                }

            }

            // inicia lista de jogos para a próxima rodada
            listaJogos.clear();
        }

        return Retorno;
    }

}
