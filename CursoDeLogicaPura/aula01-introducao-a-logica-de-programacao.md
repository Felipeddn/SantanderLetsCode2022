# Introducão à lógica pura 

Instrutor da Lets Code: Ricardo (Professor Web Full Stack)

A lógica pura ajuda a desenvolver uma forma de pensar lógica que ajuda na construção de programas de computadores.

## O que é a lógica?

"A lógica é a maneira como analisamos informações, com as suas relações e a partir dela **tiramos** conclusões"

"A lógica é o estudo que ira determinar se essas conclusões são verdadeiras ou falsas, se esse raciocinio é correto ou incorreto"

A lógica possui diversas sub-áreas, iremos tratar a lógica proposicional, que são abordadas em matemática e filosofia, dentro da lógica proposicional temos o conceito de variáveis proposicionais que servem para traduzir uma ideia nos mecanimos da logica formal.

A logica proposicional é fortemente amparada pela utilização de proposicões, podemos ter proposicões simples, uma única proposição, ou composta, com duas ou mais proposições separadas por um operador lógico.

Exemplo de proposições simples  
"Fui a praia".
"Passei protetor solar".

Exemplo de proposições compostas 
"Fui a praia **e** passei protetor solar".  
"Fui a praia **ou** passei protetor solar".

Além do conceito de proposições na lógica proposicional temos mais dois conceitos importantes, um desses conceitos é a **tautologia**.

Tautologia é uma proposição que é sempre verdadeira.  
exemplo: "João é pedreiro **ou** joão não é pedreiro", isso é uma tautologia porque **não tem como essa proposição ser falsa**, **essa proposição é sempre verdadeira**.

Contradição é uma proposição que é sempre falsa.  
exemplo: "Os vírus são seres vivos **e** os vírus não são seres vivos.", é impossível essa proposição composta ter um valor verdadeiro, **a contradição é sempre falsa**.

Para a gente poder sair um pouco da simples analise de texto, que tem um valor imenso, usamos um dispositivo matemático chamado **Tabela Verdade**, seu uso permite que possamos saber se uma proposição é verdadeira ou falsa.

## Conectivos lógicos
**Não (Negação)**, **NOT** em inglês, inglês porque grande contribuição do desenvolvimento computacional se deu nos Estados Unidos e Inglaterra.

Esse conectivo inverte o valor de uma proposição, se ela for **verdadeira** o **not** faz ela ser **falsa**, se ela for **falsa** o **not** faz ela ser **verdadeira**.

**E (conjunção)**, **AND** em inglês, seu símbolo é acento circunflexo(^), para esse conectivo lógico **basta que uma das proposições seja falsa** para que sua saída seja **falsa**, ela só é **verdadeira** se ambas as proposições forem **verdadeiras**.

**OU (disjusção)**, **OR** em inglês, basta que uma das proposições seja **verdadeira** para que sua saída seja **verdadeira**, ela só é **falsa** se ambas as proposições forem **falsas**.

**Se... Então...**, **IF... THEN...** em inglês, a **saída será verdadeira** se **ambas as proposições forem verdadeiras** ou **ambas forem falsas**, isso gera um conceito chamado **implicação**.

Podemos ter **implicações recíprocas** que são obtidas trocando a premissa com a conclusão.  
Exemplo:  
"**Se** sei programar, **então** sei lógica".  
A reciproca é:  
"**Se** sei lógica, **então** sei programar".  

Podemos ter **implicações contrapositiva** trocasse a premissa com a contrapositiva dessa premissa.  
Exemplo:  

"**Se** sei programar, **então** sei lógica".  
P -> Q

A contrapositiva é:  
"**Se** não sei lógica, **então** não sei programar".  
¬Q -> ¬P

O que foi feito aqui foi a troca da premissa com a conclusão e em seguida elas foram negadas.

Podemos ter **implicações inversa** que é obtida negando a premissa e a conclusão.
Exemplo: 
"**Se** sei programar, **então** sei lógica".  
P -> Q

A inversa é:  
"**Se** não sei programar, **então** não sei lógica".
¬P -> ¬Q

para visualizar melhor a tabela verdade, veja a imagem **a01tabela-verdade-conjuncao-and.png**.

para visualizar os simbolos matemáticos de operadores lógicos, veja a imagem **a01simbolos-operadores-logicos.png**.
