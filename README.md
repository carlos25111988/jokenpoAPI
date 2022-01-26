# jokenpoAPI
API para cadastro de jogadores, jogadas e jogos.
A API não utiliza banco de dados. Toda implementação da API foi feita através da manipulação de listas
Quanto a linguagem utilizada: JAVA Versão: 8.
IDE: VScode. Tecnologias: SpringBoot e Gerenciador de dependências: Gradle. Tests unitários: Junit.

-- JOGADORES

POST
Endpoint para cadastro: localhost:8080/jogadores
Content-Type: application/json
ResquestBody:
{
    "codigo": "1",
    "nome": "jogador 1"
}
Response:
Jogador adicionado com sucesso!

GET
Endpoint para visualizar: localhost:8080/jogadores
Content-Type: application/json
Response:
[
  {
      "codigo": "1",
      "nome": "jogador 1"
  }
]

DELETE
Endpoint para deletar: localhost:8080/jogadores/1
Content-Type: application/json
ResquestURLParam: 1(posição do elemento na lista)
Response:
Jogador removido com sucesso!

-- JOGADAS

POST
Endpoint para cadastro: localhost:8080/jogadas
Content-Type: application/json
ResquestBody:
{
    "jogadaNome": "tesoura"
}
Response:
Jogada adicionada com sucesso!

GET
Endpoint para visualizar: localhost:8080/jogadas
Content-Type: application/json
Response:
[
    {
        "jogadaNome": "pedra"
    },
    {
        "jogadaNome": "papel"
    },
    {
        "jogadaNome": "tesoura"
    }
]

DELETE
Endpoint para deletar: localhost:8080/jogadas/1
Content-Type: application/json
ResquestURLParam: 1(posição do elemento na lista)
Response:
Jogada removida com sucesso!

-- JOGOS

POST
Endpoint para cadastro: localhost:8080/jogos
Content-Type: application/json
ResquestBody:
{
    "codigoJogador": "1",
    "nomeJogada": "papel"
}
Response:
Jogo adicionado com sucesso!
O jogador 1 ganhou!

GET
Endpoint para visualizar: localhost:8080/jogos
Content-Type: application/json
Response:
[
    {
        "codigoJogador": "1",
        "nomeJogada": "papel"
    }
]
