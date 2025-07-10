# 💻 ContaTerminal

Projeto em Java desenvolvido para simular a abertura de uma conta bancária via terminal (console), com entrada de dados pelo usuário.

## 📋 Descrição

Este programa recebe as seguintes informações do usuário:

- Nome do cliente
- Número da agência
- Número da conta
- Saldo inicial

Após a coleta dos dados, exibe uma mensagem de confirmação com os dados inseridos.

## 📌 Exemplo de uso

Ao executar o programa, o terminal solicitará as seguintes informações:

```
informe o seu nome:
João Silva
informe sua agencia:
1234
informe o numero da conta:
56789
infome o saldo:
1500.75
```

E retornará:

```
Olá João Silva, obrigada por criar uma conta em nosso banco, sua agência é 1234, conta 56789 e seu saldo 1500.75 já está disponível para saque
```

## 🛠️ Tecnologias utilizadas

- Java 17+ (ou compatível)
- Scanner (entrada de dados via terminal)

## ▶️ Como executar

1. Clone o repositório:

```bash
git clone https://github.com/seuusuario/ContaTerminal.git
```

2. Compile o arquivo Java:

```bash
javac ContaTerminal.java
```

3. Execute o programa:

```bash
java ContaTerminal
```

## 🧠 Conceitos aplicados

- Entrada e saída de dados em Java
- Tipos primitivos
- Uso da classe `Scanner`
- Manipulação de variáveis
- Formatação de texto com `printf`

## 📁 Estrutura do projeto

```
ContaTerminal
├── ContaTerminal.java
└── README.md
```
