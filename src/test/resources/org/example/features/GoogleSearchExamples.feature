#language: pt
#encoding: utf-8

@teste # Tag para identificar a qual conjunto de execução esse teste pertence
# Para rodar os testes com essa tag, pode-se usar o comando -> mvn test -Dcucumber.filter.tags="@teste"

Funcionalidade: Busca no Google
  Como usuário do site de busca
  Eu desejo buscar por palavras
  Para obter informações sobre elas

  Esquema do Cenário: Busca por <palavra-chave> no Google
    Dado que acesso a página inicial do Google
    Quando busco por "<palavra-chave>"
    E pressiono Enter para buscar
    Então encontro resultados sobre "<palavra-chave>"

    Exemplos:
      | palavra-chave |
      |   cachorro    |
      |   gato        |
      |   universo    |
      |   janela      |
      |   rosa        |
      |   abacaxi     |