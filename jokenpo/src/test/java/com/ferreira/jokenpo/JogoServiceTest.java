package com.ferreira.jokenpo;

import java.util.ArrayList;
import java.util.List;

import com.ferreira.jokenpo.model.Jogada;
import com.ferreira.jokenpo.model.Jogador;
import com.ferreira.jokenpo.model.Jogo;

public class JogoServiceTest {

    static List<Jogo> ListaJogos = new ArrayList<>();

    public static String TesteJogoService() {

        // List<Jogo> ListaJogos = new ArrayList<>();
        List<Jogador> ListaJogadores = new ArrayList<>();
        List<Jogada> ListaJogadas = new ArrayList<>();

        // cria lista de jogadores
        Jogador jogador = new Jogador();
        jogador.setCodigo("1");
        jogador.setNome("Carlos");

        ListaJogadores.add(jogador);

        jogador = new Jogador();
        jogador.setCodigo("2");
        jogador.setNome("Eduardo");

        ListaJogadores.add(jogador);

        jogador = new Jogador();
        jogador.setCodigo("3");
        jogador.setNome("Nascimento");

        ListaJogadores.add(jogador);

        // cria lista de jogadas
        Jogada jogada = new Jogada();
        jogada.setjogadaNome("pedra");
        ListaJogadas.add(jogada);

        jogada = new Jogada();
        jogada.setjogadaNome("papel");
        ListaJogadas.add(jogada);

        jogada = new Jogada();
        jogada.setjogadaNome("tesoura");
        ListaJogadas.add(jogada);

        // cria lista de jogos
        Jogo jogo = new Jogo();
        jogo.setCodigoJogador(ListaJogadores.get(0).getCodigo());
        jogo.setNomeJogada(ListaJogadas.get(0).getjogadaNome());
        ListaJogos.add(jogo);

        jogo = new Jogo();
        jogo.setCodigoJogador(ListaJogadores.get(1).getCodigo());
        // jogo.setNomeJogada(ListaJogadas.get(2).getjogadaNome()); // para o jogador 1
        // ganhar
        jogo.setNomeJogada(ListaJogadas.get(1).getjogadaNome()); // para o jogo empatar
        ListaJogos.add(jogo);

        jogo = new Jogo();
        jogo.setCodigoJogador(ListaJogadores.get(2).getCodigo());
        jogo.setNomeJogada(ListaJogadas.get(2).getjogadaNome());
        ListaJogos.add(jogo);

        for (Jogo jogos : ListaJogos) {
            System.out.println("jogador: " + jogos.getCodigoJogador() + " jogada: " +
                    jogos.getNomeJogada() + "\n");
        }

        // JogoService.addJogo(jogo, ListaJogadores, ListaJogadas);

        return JogoServiceTest.endJogoTest(ListaJogos);

    }

    // metodo para verificar o ganhador
    public static String endJogoTest(List<Jogo> ListaJogos) {

        int TamanhoListaJogo = ListaJogos.size();
        String Retorno = "";
        // int ContListaJogo = 0;

        if (TamanhoListaJogo == 3) {

            // verifica se o jogo empatou por todos serem iguais
            if (ListaJogos.get(0).getNomeJogada().equals(ListaJogos.get(1).getNomeJogada()) &&
                    ListaJogos.get(0).getNomeJogada().equals(ListaJogos.get(2).getNomeJogada())) {

                Retorno = "O jogo terminou empatado!";

            } else {

                // verifica se o jogo empatou por todos serem diferentes
                if (!ListaJogos.get(0).getNomeJogada().equals(ListaJogos.get(1).getNomeJogada()) &&
                        !ListaJogos.get(0).getNomeJogada().equals(ListaJogos.get(2).getNomeJogada()) &&
                        !ListaJogos.get(1).getNomeJogada().equals(ListaJogos.get(2).getNomeJogada())) {

                    Retorno = "O jogo terminou empatado";

                } else {

                    // primeira variação
                    // verifica se algum jogador informou: pedra
                    if (ListaJogos.get(0).getNomeJogada().toUpperCase().equals("PEDRA") ||
                            ListaJogos.get(1).getNomeJogada().toUpperCase().equals("PEDRA") ||
                            ListaJogos.get(2).getNomeJogada().toUpperCase().equals("PEDRA")) {

                        // verifica se algum jogador informou: papel
                        if (ListaJogos.get(0).getNomeJogada().toUpperCase().equals("PAPEL") ||
                                ListaJogos.get(1).getNomeJogada().toUpperCase().equals("PAPEL") ||
                                ListaJogos.get(2).getNomeJogada().toUpperCase().equals("PAPEL")) {

                            if (ListaJogos.get(0).getNomeJogada().toUpperCase().equals("PAPEL")) {

                                Retorno = Retorno + "O jogador: " + ListaJogos.get(0).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                            if (ListaJogos.get(1).getNomeJogada().toUpperCase().equals("PAPEL")) {

                                Retorno = Retorno + "O jogador: " + ListaJogos.get(1).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                            if (ListaJogos.get(2).getNomeJogada().toUpperCase().equals("PAPEL")) {

                                Retorno = Retorno + "O jogador: " + ListaJogos.get(2).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                        } else {

                            // verifica o jogador que informou pedra pois o mesmo venceu
                            if (ListaJogos.get(0).getNomeJogada().toUpperCase().equals("PEDRA")) {

                                Retorno = Retorno + "O jogador: " + ListaJogos.get(0).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                            if (ListaJogos.get(1).getNomeJogada().toUpperCase().equals("PEDRA")) {

                                Retorno = Retorno + "O jogador: " + ListaJogos.get(1).getCodigoJogador()
                                        + " ganhou! \n";

                            }

                            if (ListaJogos.get(2).getNomeJogada().toUpperCase().equals("PEDRA")) {

                                Retorno = Retorno + "O jogador: " + ListaJogos.get(2).getCodigoJogador()
                                        + " ganhou! \n";

                            }
                        }

                    } else {

                        if (ListaJogos.get(0).getNomeJogada().toUpperCase().equals("TESOURA")) {

                            Retorno = Retorno + "O jogador: " + ListaJogos.get(0).getCodigoJogador() + " ganhou! \n";

                        }

                        if (ListaJogos.get(1).getNomeJogada().toUpperCase().equals("TESOURA")) {

                            Retorno = Retorno + "O jogador: " + ListaJogos.get(1).getCodigoJogador() + " ganhou! \n";

                        }

                        if (ListaJogos.get(2).getNomeJogada().toUpperCase().equals("TESOURA")) {

                            Retorno = Retorno + "O jogador: " + ListaJogos.get(2).getCodigoJogador() + " ganhou! \n";

                        }
                    }

                }

            }

            // inicia lista de jogos para a próxima rodada
            ListaJogos.clear();
        }

        return Retorno;
    }

    // public static void main(String[] args) {
    // System.out.println(JogoServiceTest.TesteJogoService());
    // }
}
