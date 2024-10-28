#language: pt
#encoding: utf-8

@teste # Tags servem para identificar a qual conjunto de execução esse teste pertence
# Para rodar os testes com essa tag, pode-se usar o comando -> mvn test -Dcucumber.filter.tags="@teste"

Funcionalidade: Busca no Google
  Como usuário do site de busca
  Eu desejo buscar por palavras
  Para obter informações sobre elas

  Contexto:
    Dado que acesso a página inicial do Google


  Cenário: Buscar um cachorro no Google
    Quando busco por "cachorro"
    E pressiono Enter para buscar
    Então encontro resultados sobre "cachorro"

  @edge
  Cenário: Buscar um gato no Google
    Quando busco por "gato"
    E pressiono Enter para buscar
    Então encontro resultados sobre "gato"

  @firefox
  Cenário: Buscar um leão no Google
    Quando busco por "abacaxi"
    E pressiono Enter para buscar
    Então encontro resultados sobre "abacaxi"