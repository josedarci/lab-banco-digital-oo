# 💻 Criando um Banco Digital com Java e Orientação a Objetos

Este projeto foi desenvolvido como exercício prático de orientação a objetos com Java, simulando o funcionamento básico de um banco digital.

## 🗓️ Mentoria 02/08/2021 - Tire Suas Dúvidas Sobre Orientação a Objetos

### 🧠 Desafio
Considerando nosso conhecimento no domínio bancário, abstraímos uma solução orientada a objetos em Java. O cenário propõe:

> “Um banco oferece aos seus clientes dois tipos de contas (corrente e poupança), as quais possuem as funcionalidades de depósito, saque e transferência (entre contas da própria instituição).”

---

## ✨ Conceitos de POO Aplicados

### 🔹 Abstração
Foco nos aspectos essenciais de um domínio, ignorando detalhes desnecessários. A classe `Conta` representa a abstração de uma conta bancária.

### 🔹 Encapsulamento
Atributos protegidos e métodos públicos controlam o acesso e a manipulação do estado interno dos objetos, favorecendo manutenção e evolução.

### 🔹 Herança
As classes `ContaCorrente` e `ContaPoupanca` herdam a estrutura e comportamento da classe `Conta`.

### 🔹 Polimorfismo
Utilizamos objetos das classes filhas (`ContaCorrente` e `ContaPoupanca`) como referências do tipo `Conta`.

---

## 📁 Estrutura de Classes

- `Cliente` – Representa o cliente do banco.
- `Conta` – Classe abstrata base para contas bancárias.
- `ContaCorrente` – Representa uma conta corrente.
- `ContaPoupanca` – Representa uma conta poupança.
- `Main` – Classe principal com o exemplo de uso.

---

## ▶️ Como Executar

1. Clone o repositório
2. Abra no IntelliJ IDEA
3. Execute a classe `Main`

---

## 📌 Exemplo de Saída
Extrato Conta Corrente
Titular: José da Silva
Saldo: 700.0
Extrato Conta Poupança
Titular: José da Silva
Saldo: 300.0
