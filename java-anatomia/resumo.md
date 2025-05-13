# Anatomia das Classes

## Introdução

A escrita de códigos de um programa é feito através da composição de palavras pré-definidas pela linguagem com as expressões que utilizamos para determinar o nome dos nosso arquivos, classes, atributos e métodos.

## Padrão de nomenclatura

- **Arquivo .java:** Todo arquivo .java deve começar com letra MAIÚSCULA. Se a palavra for composta, a segunda palavra deve também ser maiúscula.
- **Nome da classe no arquivo:** A classe deve possuir o mesmo nome do arquivo .java.
- **Nome de variável:** Toda variável deve ser escrita com letra minúscula. Porém, se a palavra for composta, a primeira letra da segunda palavra deverá ser maiúscula. O nome dessa prática para nomear variáveis se chama "camelCase".

## Declarando variáveis e métodos

Existe uma estrutura comum para ambas as finalidades.

- Declarar uma variável em Java segue sempre a mesma estrutura:
```java
/*
 * Estrutura
 * Tipo NomeBemDefinido = Atribuição (opcional em alguns casos)
 * 
 * Exemplo:
*/
int idade = 23;
double altura = 1.62;
Dog spike;
```
- Declarar métodos em Java segue uma estrutura bem simples:
```java
/*
 * Estrutura
 * TipoRetorno NomeObjetivoNoInfinitivo(Parametros)
 * 
 * Exemplo:
*/
int somar(int numeroUm, int numeroDois)
```

## Identação

**Identar** é um termo utilizado para escrever o código do programa de forma hierárquica, facilitando assim a visualização e o entendimento do programa.

## Organizando arquivos

À medida que nosso sistema vai evoluindo, surgem novos arquivos (código fonte) em nossa estrutura de arquivos do projeto. Isso exige que seja realizado uma organização destes arquivos de pacotes (packages).

## Java Beans

Uma das maiores dificuldades na programação é escrever algoritmos legíveis a níveis que sejam compreendidos por todo o seu time ou por você mesmo no futuro. Para isso, a linguagem Java sugere, através de convenções, formas de escrita universal para nossas classes, atributos, métodos e pacotes.

### Variáveis

- Uma variável deve ser clara, sem abreviações ou definição sem sentido;
- Uma variável é sempre no singular, **exceto quando se referir a um array ou coleção**;
- Defina um único idioma para suas variáveis.

### Métodos

Os métodos deverão ser nomeados como verbos, através de uma mistura de letras minúsculas e maiúsculas. Em princípio, todas as letras que compõem o nome devem ser mantidas em minúsculo, com exceção da primeira letra de cada palavra composta a partir da segunda palavra.