package com.ferreira.jokenpo;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
//import org.springframework.http.HttpStatus;
import org.springframework.test.context.web.WebAppConfiguration;

//import io.restassured.http.ContentType;

//import static io.restassured.module.mockmvc.RestAssuredMockMvc.*;

@WebAppConfiguration
public class JokenpoApplicationTest {

    @Test
    public void FirstTest() {

        // Testar método que valida o jogo
        String valorEsperadoJogoEmpate = "O jogo terminou empatado"; // para o jogo empatar
        // String valorEsperadoJogador1 = "O jogador: 1 ganhou! \n"; // para o jogador 1
        // ganhar
        assertEquals(valorEsperadoJogoEmpate, JogoServiceTest.TesteJogoService());

    }

}
