# Projeto Teste-Pratico-Iniflex

Este projeto é um exemplo simples em **Java** a indentação do código foi feita no VS Code → com a extensão "Language Support for Java(TM) by Red Hat" + "Prettier";
O projeto consiste em manipular uma lista de varias formas diferentes. A lista é bem simples contendo: 
- `nome` (String)  
- `dataNascimento` (LocalDate)
- `salario`(BigDecimal)
- `funcao`(String)

  <img src="https://raw.githubusercontent.com/edmarpires9/Teste-Pratico-Iniflex/refs/heads/main/public/assets/custom-test-102943-question-eee278f5-a195-4265-956e-dcfcef31bafb.png" alt="Excel table" />

E uma classe `Main` que instancia objetos de outras Classes.


---

## Pré-requisitos

- [Java JDK](https://www.oracle.com/java/technologies/downloads/) instalado  

---

## Como compilar e executar

No terminal, dentro da pasta do projeto:

```bash
# Compilar as classes
javac Pessoa.java Main.java

# Executar o programa
java Main

# Exemplo de saída
Nome: Edmar
Data de Nascimento: 1998-05-12
```

## O que foi solicitado?

1. Classe Pessoa com os atributos: nome (String) e data nascimento (LocalDate).

2. Classe Funcionário que estenda a classe Pessoa, com os atributos: salário (BigDecimal) e função (String).

3. Deve conter uma classe Principal para executar as seguintes ações:
   1. Inserir todos os funcionários, na mesma ordem e informações da tabela acima.
   2. Remover o funcionário “João” da lista.
   3. Imprimir todos os funcionários com todas suas informações, sendo que:
      - informação de data deve ser exibido no formato dd/mm/aaaa;
      - informação de valor numérico deve ser exibida no formatado com separador de milhar como ponto e decimal como vírgula.
   4. Os funcionários receberam 10% de aumento de salário, atualizar a lista de funcionários com novo valor.
   5. Agrupar os funcionários por função em um MAP, sendo a chave a “função” e o valor a “lista de funcionários”.
   6. Imprimir os funcionários, agrupados por função.
   7. Imprimir os funcionários que fazem aniversário no mês 10 e 12.
   8. Imprimir o funcionário com a maior idade, exibindo os atributos: nome e idade.
   9. Imprimir a lista de funcionários por ordem alfabética.
   10. Imprimir o total dos salários dos funcionários.
   11. Imprimir quantos salários mínimos ganha cada funcionário, considerando que o salário mínimo é R$1212,00.

