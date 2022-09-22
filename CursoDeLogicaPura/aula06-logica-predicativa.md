# Aula 6 - Lógica predicativa

Instrutor da Lets Code: Ricardo (Professor Web Full Stack)

Todo estudante de computação precisa entender de lógica.

João é estudante de computação.

A conclusão de que João teria que entender lógica parece óbvia, mas essa conclusão em lógica formal seria apenas "achismo", pois não apresenta uma ferramenta validada pelo campo da lógica formal. Conclusões baseada em lógica formal sabe da existencia da interpretação de texto mas busca o auxilio de mais ferramentas e não se encerra em na interpretação em si.

Dessa forma a **lógica predicativa** vai nos fornecer outras ferramentas para trabalharmos com racicionios como apresentado acima.

Na lógica predicativa, além dos conectivos lógicos (**¬**, **^**, **v** e **->**), as fórmulas bem-formadas da lógica de predicados são compostas por **objetos**, **predicados**, **variáveis** e **quantificadores**.

## Objetos 

Na lógica de predicados, a noção de objeto é usada num sentido bastante amplo. Objetos podem ser concretos (ex.: um livro, o sol), abstratos (ex.: o conjunto vazio, a paz), ou fictícias (ex.: unicórnio).

Objetos podem ainda ser atômicos ou compostos (ex.: um teclado é composto de teclas). Em suma, um objeto pode ser qualquer coisa a respeito da qual precisamos dizer algo. Por convenção, nomes de objetos são escritos com inicial minúscula e assumimos que nomes diferentes denotam objetos diferentes.

## Predicados 

Um predicado é uma expressão de uma ou mais variáveis definida em um determinado domínio, denotado uma relação entre objetos de um determinado contexto de discurso.

É possível construir uma proposição a partir de um predicado com variáveis atribuindo a elas determinados valores ou as quantificando. Dependendo do valor que tais variáveis assumirem, a nossa proposição pode ser verdadeira ou falsa.

### Exemplo de predicado

1. **P(x)** denota "X<sup>2</sup> é maior que x"  
2. **E(x, y)** denota "x = y"  
3. **X(a, b, c)** denota "a + b + c = 0"  
4. **M(x, y)** denota "x é casado com y"

Observe que nossas preposições baseadas nesses predicados podem ser verdadeiras ou falsas, observe que 1<sup>2</sup> = 1 e não 1 > 1, isso é falso. E isso vale para os demais itens, no 2 dependendo do valores isso pode ser verdadeiro ou falso.

### Domínios

O domínio de uma variável predicativa é a coleção de todos os valores possíveis que uma variável pode assumir.

Para o predicado P(x) do exemplo anterior, podemos usar o domínio como os números inteiros, os números reais ou qualquer outro conjunto matemático. 

Exemplo: traduz-se para "A variável x pertence ao domínio dos números naturais".

## Quantificadores  

As variáveis de predicados podem ser quantificadas simplesmente atribuindo determinados valores específicos a elas, mas o mais comum é escrever predicados mais generalistas através de quantificadores.

### Quantificadores universais 

Por conta dos símbolos usados no texto de referência a imagem **a06quantificadores-universais.png, a06quantificadores-universais-2.png** possui o conteúdo desse item.

### Quantificador existencial

Por conta dos símbolos usados no texto de referência a imagem **a06quantificadores-existencias.png, a06quantificadores-existencias-2.png, a06quantificadores-existencias-3.png** possui o conteúdo desse item.

### Quantificadores aninhados  

Por conta dos símbolos usados no texto de referência a imagem **a06quantificadores-aninhados.png, a06quantificadores-aninhados-2.png** possui o conteúdo desse item.

## Conclusão

Dessa forma podemos estruturar melhor nossa argumentação através da **lógica predicativa**, para validar certas conclusões, pois só com **lógica proposicional** e **lógica categórica** ficamos incapazes de **provar** determinadas conclusões.

Fim da aula 
