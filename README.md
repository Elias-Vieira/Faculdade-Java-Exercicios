# 📘 Exercícios de Algoritmos Recursivos e Funcionais (Java)

[![Java](https://img.shields.io/badge/Java-8%2B-informational)]()
[![Status](https://img.shields.io/badge/status-ativo-success)]()
[![UniRV](https://img.shields.io/badge/curso-Engenharia%20de%20Software-blue)]()
[![Período](https://img.shields.io/badge/Período-3%C2%BA%20período-yellowgreen)]()

---

## 📝 Sobre o Repositório

Este repositório reúne **todos os exercícios desenvolvidos em sala de aula** durante o **3º período do curso de Engenharia de Software na UniRV**, com foco em **recursividade** e **funções em Java**.  
O objetivo é oferecer uma **referência organizada para estudo, revisão e portfólio pessoal**, com todos os códigos implementados por mim durante as aulas.

---

# 📂 Estrutura das Aulas

Todos os exercícios estão organizados em pacotes dentro do diretório `src/`, separados por aulas, facilitando a navegação e o estudo do projeto

---

## Aula 01 – Funções e Procedimentos
💡 **Descrição:**  
Exercícios básicos para treinar o uso de **procedimentos e funções**, explorando laços, condições e cálculos simples.

🎯 **Desafios trabalhados:**
- Impressão de números e tabuadas
- Verificação de números pares e ímpares
- Intervalos numéricos (pares e ímpares)
- Funções matemáticas: quadrado, fatorial e dobro
- Retorno de mensagens e validações lógicas (ex.: múltiplo de 3)


## Aula 02 – Funções e Procedimentos 2
💡 **Descrição:**  
Lista prática em **Java**, com métodos voltados à manipulação de strings e cálculos matemáticos.

🎯 **Desafios trabalhados:**
- Verificação de **palíndromos**
- Sequência de **Fibonacci** (n-ésimo termo)
- Identificação de números **primos em intervalos**
- Cálculo de **potência** (base e expoente)
- Implementação da **tetração** (potência iterada)


## Aula 03 – Vetores e Matrizes
💡 **Descrição:**  
Exercícios aplicados a **vetores e matrizes**, reforçando o uso de funções e procedimentos para manipulação de dados.

🎯 **Desafios trabalhados:**
- Preenchimento automático de vetores e matrizes com valores aleatórios
- Impressão de vetores e matrizes
- Uso de métodos auxiliares para reaproveitamento de código
- Verificação de **quadrado mágico** em matrizes


## Aula 04 – Recursividade
💡 **Descrição:**  
Lista introdutória sobre **recursividade**, aplicada em problemas matemáticos clássicos.

🎯 **Desafios trabalhados:**
- Soma de números pares até um limite
- Soma recursiva de elementos de um array
- Cálculo de **potência** com recursão
- Sequência de **Fibonacci recursiva**


## Aula 05 – Recursividade 2
💡 **Descrição:**  
Lista de exercícios avançados de **recursividade**, explorando sequências matemáticas e conversões numéricas.

🎯 **Desafios trabalhados:**
- Análise de uma função recursiva e criação da versão não recursiva
- Soma da inversão de números de 1 até N
- Cálculo do **N-ésimo número da sequência de Tribonacci**
- Cálculo do **N-ésimo número da sequência de Pell**
- Conversão recursiva de um número inteiro positivo para **binário**
- Questão de múltipla escolha envolvendo função recursiva e valor de variável


## Aula 06 – Orientação a Objetos
💡 **Descrição:**  
Lista de exercícios práticos de **programação orientada a objetos em Java**, trabalhando com criação de classes, atributos, métodos, construtores, arrays de objetos e interação com o usuário.

🎯 **Desafios trabalhados:**
- Implementação da classe **Data**, utilizando construtor obrigatório e métodos para alterar e consultar valores.
- Implementação da classe **Animal**, com construtor vazio e preenchimento de dados pelo usuário.
- Implementação da classe **Retângulo**, com cálculo da área a partir da altura e largura.
- Implementação da classe **Aluno**, armazenando notas em um array e cálculo da média.
- Criação de um **array de objetos do tipo Aluno** com três posições, preenchido pelo usuário.
- Prática de **encapsulamento** (uso de getters e setters) e exibição de dados no console.


## Aula 07 – Orientação a Objetos 2
💡 **Descrição:**  
Lista de exercícios de **revisão e prática em Java**, reforçando os conceitos de programação orientada a objetos. Trabalhando com criação de classes, atributos privados, construtores, métodos (getters e setters), operações básicas, uso de **ArrayList** e cálculos aplicados a objetos.

🎯 **Desafios trabalhados:**
- Implementação da classe **Pessoa** com atributos privados (nome, idade e altura), métodos getters e setters, e exibição de informações a partir da classe **PrincipalPessoa**.
- Implementação da classe **ContaCorrente**, com construtor para inicialização, métodos para depositar, sacar e verificar saldo, e simulação das operações na classe **PrincipalContaCorrente**.
- Implementação da classe **Calculadora**, recebendo valores pelo construtor e oferecendo métodos para **soma, subtração, multiplicação e divisão**, com execução dos cálculos na classe **PrincipalCalculadora**.
- Criação da classe **Livro**, com atributos privados (título, autor, ano e número de páginas), métodos getters e setters, além do método **exibirDadosLivro()**, manipulados em um **ArrayList** na classe **PrincipalLivro**.
- Implementação da classe **Aluno**, com notas armazenadas em um vetor, cálculo da média e verificação de aprovação. Na classe **PrincipalAluno**, uso de um **ArrayList** para representar a turma, exibindo:
   - Quantidade de alunos;
   - Média geral da turma;
   - Quantidade de aprovados e reprovados;
   - Aluno com maior nota;
   - Aluno com menor nota.


## Aula 08 – Orientação a Objetos 4: Herança
💡 **Descrição:**  
Exercício prático sobre **herança em Java**, utilizando o conceito de especialização de classes para representar diferentes tipos de ingressos. Demonstra como subclasses podem estender funcionalidades da classe base, promovendo reutilização e organização do código.

🎯 **Desafios trabalhados:**
- Criação da classe base `Ingresso`, com atributo de valor e método de exibição.
- Implementação da subclasse `IngressoVip`, herdando de `Ingresso` e adicionando valor adicional.
- Uso do `super` para acessar o valor do ingresso comum.
- Implementação de método sobrescrito `exibirValorIngressoVip()` para exibir o valor total.
- Teste das classes no método `main` com instanciação e exibição dos objetos.
- Prática de reutilização de código e especialização de comportamento.


## Aula 09 – Polimorfismo
💡 **Descrição:**  
Exercício prático de **polimorfismo em Java**, explorando como diferentes tipos de contas bancárias podem ser manipulados por meio de uma referência genérica. Demonstra o uso de sobreposição de métodos e listas polimórficas.

🎯 **Desafios trabalhados:**
- Criação da hierarquia `ContaBancaria` → `ContaCorrente` / `ContaPoupanca`.
- Implementação de métodos sobrescritos `mostrarInfo()` em cada subclasse.
- Utilização de `ArrayList<ContaBancaria>` para armazenar objetos de diferentes tipos.
- Demonstração de polimorfismo de sobreposição com chamadas dinâmicas de métodos.
- Simulação de um sistema bancário exibindo informações de contas de forma polimórfica.


## Aula 10 – Exercício Prático: Baralho de Cartas
💡 **Descrição:**  
Desafio prático para aplicar conceitos de **orientação a objetos** em um contexto lúdico, construindo um sistema de baralho com geração aleatória de cartas únicas. Envolve encapsulamento, coleções e lógica de controle.

🎯 **Desafios trabalhados:**
- Criação da classe `Carta`, com atributos `numero` e `naipe`.
- Implementação da classe `Baralho`, responsável por montar e exibir cartas.
- Uso de `ArrayList` e `HashSet` para garantir unicidade das cartas.
- Geração aleatória de cartas com controle de duplicidade.
- Implementação de método `imprimirCartas()` para exibir todas as cartas geradas.
- Aplicação de encapsulamento e boas práticas de estruturação de código.


## Aula 11 – Tratamento de Exceções
💡 **Descrição:**  
Desafio prático para aplicar conceitos de **tratamento de exceções** em Java, explorando desde erros básicos de entrada até a criação de exceções personalizadas e múltiplas. O objetivo é tornar os programas mais robustos e seguros contra falhas previsíveis.

🎯 **Desafios trabalhados:**
- Manipulação de exceções básicas com `try-catch` para entradas inválidas.
- Criação de exceções personalizadas como `NumeroNaoPrimoException`, `SaldoInsuficienteException`, `ArquivoNaoEncontradoException` e `TrianguloInvalidoException`.
- Implementação de lógica condicional para validação de dados e lançamento de exceções.
- Uso de `throws` e `throw` para controle de fluxo em situações específicas.
- Tratamento de múltiplas exceções em métodos da classe `Calculadora`.
- Validação de senha com critérios específicos e lançamento de `SenhaFracaException`.
- Aplicação de boas práticas na estruturação de código defensivo.


## Aula 12 – Manipulação de Arquivos

💡 **Descrição:**  
Desafio prático para aplicar conceitos de **manipulação de arquivos em Java**, criando e lendo arquivos `.txt` a partir de entradas do usuário. O foco é entender como trabalhar com dados persistentes na raiz do projeto, garantindo cuidado com extensões, leitura e escrita.

🎯 **Desafios trabalhados:**
- Utilização da classe `Scanner` para receber do usuário o nome do arquivo desejado.
- Garantia automática da extensão `.txt` por meio do método `garantirExtensaoTxt`.
- Criação de arquivos de texto na raiz do projeto usando `FileWriter`, escrevendo um conteúdo inicial.
- Leitura do conteúdo do arquivo linha a linha com `File` e `Scanner`, exibindo o resultado no console.
- Tratamento de exceções de entrada/saída ao criar e ler arquivos, evitando falhas na execução.
- Fechamento correto de recursos (`Scanner`, `FileWriter`, leitores) após o uso, prevenindo vazamento de recursos.
- Aplicação de uma estrutura simples e reutilizável para manipulação de arquivos em projetos Java.


## Aula 13 – Cálculo de Médias a partir de Arquivo

💡 **Descrição:**  
Desafio prático para aplicar **manipulação de arquivos e processamento de dados** em Java, lendo informações de alunos a partir de um arquivo texto, calculando suas médias e gerando um novo arquivo com os resultados já consolidados por série.

🎯 **Desafios trabalhados:**
- Leitura do arquivo `escola_DB.txt` contendo: nome, matrícula, série, nota 1, nota 2 e nota 3 de cada aluno.
- Implementação da classe `CalculaNota` para:
    - Ler todos os registros do arquivo de entrada.
    - Calcular a média das três notas de cada aluno.
    - Salvar em `media_2025.txt` apenas o nome, a série e a média.
- Criação da classe `ExibirSerie` para:
    - Ler o arquivo `media_2025.txt`.
    - Permitir que o usuário informe uma série (entre 1 e 5) via `Scanner`.
    - Exibir na tela o nome e a média de todos os alunos pertencentes à série informada.
- Prática de parsing de linhas de texto (separação de campos, como por `;` ou `,`).
- Uso de estruturas de repetição para percorrer os alunos e processar seus dados.
- Consolidação de leitura, escrita e filtragem de dados em arquivos de texto em Java.



---

## ▶️ Como Executar

1. **Pré-requisitos**
    - **JDK 8+** instalado
    - Editor/IDE recomendado: **IntelliJ IDEA** ou **Eclipse**

2. **Clonar o Repositório**
   ```bash
   git clone https://github.com/Elias-Vieira/Faculdade-Java-Exercicios.git