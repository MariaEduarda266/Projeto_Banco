# 🏦 Sistema Bancário em Java (Console)

Um mini sistema bancário interativo rodando direto no terminal. Este projeto foi construído do zero com o objetivo de colocar em prática os fundamentos da programação em Java e a Orientação a Objetos.

## 🚀 Funcionalidades

O sistema simula um caixa eletrônico (ATM) com as seguintes operações:
* **Cadastro e Login:** Criação de conta vinculada a um Nome, CPF e Senha.
* **Consulta de Saldo:** Visualização do dinheiro disponível na conta.
* **Depósitos:** Adição de valores à conta (com trava de segurança para impedir valores negativos ou zerados).
* **Saques:** Retirada de valores (com trava de segurança para impedir que o usuário saque mais do que possui).
* **Extrato:** Um histórico detalhado de todas as movimentações de entrada e saída de dinheiro da conta.
* **Menu Interativo:** O sistema se mantém rodando em um laço de repetição até que o usuário escolha a opção de Sair.

## 🧠 Conceitos Aplicados

Durante o desenvolvimento deste projeto, apliquei e consolidei os seguintes conceitos:
* **Programação Orientada a Objetos (POO):** Criação de classes separadas para estruturar os dados do cliente (`Conta`) e a interface com o usuário (`Menu`).
* **Encapsulamento:** Proteção dos dados sensíveis da conta, acessando-os apenas através de métodos seguros.
* **Estruturas de Repetição e Decisão:** Uso de `while`, `for`, `if/else` e `switch-case` para controlar o fluxo das telas e menus.
* **Coleções (Collections):** Utilização de `ArrayList` para armazenar de forma dinâmica o histórico do extrato do usuário.

## 🛠️ Tecnologias Utilizadas

* **Linguagem:** Java
* **IDE Recomendada:** IntelliJ IDEA / Eclipse / VS Code
* **Bibliotecas:** `java.util.Scanner` (para leitura de dados) e `java.util.ArrayList` (para o extrato).

## 🎮 Como rodar o projeto

1. Faça o clone deste repositório na sua máquina.
2. Abra o projeto na sua IDE favorita.
3. Execute o arquivo `Main.java`.
4. Siga as instruções no console para cadastrar uma conta, fazer o login e começar a testar as transações!

---
*Desenvolvido com muita dedicação e café ☕ por Maria Eduarda da Silva Montalvão.*
