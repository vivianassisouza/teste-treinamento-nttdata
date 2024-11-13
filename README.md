# Treinamento de Automação Intermediária com Selenium - NTT DATA

## Descrição
Este projeto exemplifica um treinamento intermediário de automação de testes para a NTT DATA, usando Selenium WebDriver, Page Factory, relatórios automatizados e JUnit5. O objetivo é realizar automações mais complexas e gerar relatórios ao final das execuções.

## Ferramentas e Tecnologias
- **Java**: Linguagem de programação.
- **Selenium WebDriver**: Automação do navegador.
- **Page Factory**: Padrão de projeto para gerenciamento de elementos.
- **JUnit5**: Framework de testes.
- **Maven**: Gerenciamento de dependências.
- **Relatórios**: Geração de relatórios de execução de testes.

## Estrutura dos Testes
O projeto contém os seguintes testes principais:

1. **GoogleSearch.feature**: Realiza algumas buscas simples no Google, validando os resultados, obtidos usando GHERKIN.
2. **GoogleSeachExamples.feature**: Realiza algumas buscas simples no Google, validando os resultados obtidos, usando EXEMPLOS Cucumber.

## Estrutura do Projeto
- **Page Objects**: Organiza elementos da interface usando Page Factory, facilitando a manutenção e reutilização de código.
- **Tests**: Contém as classes de testes que validam as ações realizadas no Google.

## Relatórios
Relatórios de execução são gerados automaticamente após os testes, fornecendo informações sobre o status de cada execução, falhas e exceções.

## Instalação
1. Clone o repositório:
   ```bash
   git clone https://github.com/vivianassisouza/teste-treinamento-nttdata/
   cd teste-treinamento-nttdata

2. Instale as dependências com Maven:
  ```bash
  mvn install

3. Para executar os testes, use o Maven:
  ```bash
  mvn test
