# Aula 3 - Variáveis

Instrutor: Jessé Haniel (especialista Java)

Iremos tratar de variáveis java nessa aula e o instrutor já começa a aula recomendando um site oficial do Java para consulta de informações e realização de tutorial.

O site oficial do tutorial é: https://docs.oracle.com/javase/tutorial/

Baseado nesse site https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html o instrutor começa a informar os 8 tipos de dados primitivos

* byte  
Esse tipo consegue armazenar valores entre -128 e 127(inclusive)

* short  
Esse tipo consegue armazenar valores entre -32.768 e 32.767(inclusive)

* int

* long

* float

* double

* boolean

* char

A principal diferença entre esses tipos primitivos são dois, o tipo de dado que armazena e o espaço disponível para armazenar dados.

Uma **variável** é um espaço armazenado no computador capaz de guardar informações de modo que quando programamos recuperamos essa informação para uso durante o programa, seu conteúdo é apresentado ao utilizar seu nome e seu conteúdo poder ser reescrito, o novo valor atribuido a variável substitui o antigo, fazendo que seja perdido o conteúdo antigo para armazenar o novo, ocorre uma substituição de valores.

No primeiro exemplo de variável o professor declarou uma variável do tipo String (em Java string não é um tipo primitivo).

a declaração de variável em Java é dessa forma:

Tipo_do_dado nome_d_dado, exemplo:


````java  
String nome;
````
Podemos declarar variáveis atribuindo valores a ela, veja:

````java
String nome2 = "Santander";
````

## Tipos primitivos e tipos de dados

Cada tipo de dado armazena um tipo de conteúdo

Para conteúdos **númerico inteiros** usamos os tipos:  
byte, shot, int, long

O mais comum de se usar é o tipo **int** por conta da sua abrangência.

Para conteúdo **númerico real** usamos os tipos:  
float, double

Para valores lógicos usamos o tipo **boolean**

Para caracter usamos o tipo **char**, ele armazena um único caracter, para mais de um caractere usamos o tipo **String**

## Operadores aritméticos em Java

Soma (+), Subtração (-), Multiplicação (*), Divisão (/)

Para fazer divisão de números reais em Java precisamos que as variável envolvidas nessa divisão seja do tipo real, para armazenar esse tipo de valor, mesmo que os operadores sejam do tipo inteiro, todas as variaveis precisam ser do tipo real

## Cast

Um problema que tivemos ao fazer a divisão de inteiros foi que o resultado deveria ser um valor real, porém esse valor real não pode ser obtido através da divisão de valores inteiros e armazenado em uma variável de tipo inteiro, ou seja, todas as variáveis precisam ser do tipo real, o que trouxe um problema para nossa programação já que estavamos utilizando números inteiros, uma solução para esse problema específico é a aplicação do **cast**. O cast muda o valor esperado para as variáveis e dessa forma mudamos os tipos só no momento da execução da linha específica, facilitando o trabalho de programação.

Fim da aula
