# Equivalência lógica  

Instrutor da Lets Code: Ricardo (Professor Web Full Stack)

## O que é equivalência e quais tipos de equivalência existem?

Equivalência é igualdade de proposições, mesmo duas proposições lógicas diferentes podem ser equivalentes, para isso usamos a tabela verdade.

* Equivalência comutativa  
Trocar a ordem das proposições não altera a o resultado final.

Exemplo:  
"Patos são animais **e** facas são objetos". 
P e Q

Essa proposição é equivalente a:  
"Facas são objetos **e** patos são animais". 
Q e P

* Equivalência associativa  
Inserir mais uma proposição não altera o resultado final.

Exemplo:  
"Patos são animais **e** facas são objetos pontudos".  
P e Q

Essa proposição é equivalente a:  
"Patos são animais **e** facas são objetos **e** facas são pontudas".
P e Q e R

* Equivalência distributiva  
Trocar conectivos lógicos mais externos por conectivos lógicos mais internos não altera o resultado final.

Exemplo:  
"Patos são animais **ou** facas são objetos pontudos".  
P ou Q

essa proposição é equivalente a:  
"Patos são animais **ou** facas são objetos **e** patos são animais **ou** facas são pontudas".
P ou Q e P ou R

## Leis de Morgan  
Augustus Morgan foi um matemático e lógico indiano que contribuiu muito para o desenvolvimento da lógica, por isso iremos tratar de algumas leis, chamadas de leis de Morgan.

* Primeira lei de Morgan  

- A negação da conjunção(**e**) é a disjunção(**ou**) das negações.  
- Forma computacional: "**NOT** (P and Q)" é equivalente a "**NOT** P **OR** **NOT** Q".  
!(A ^ B) = (!A) v (!B)

Exemplos com preposições:  
"**Não** está nublado **e** chovendo"  
é equivalente a   
"**Não** está nublado **ou** não está chovendo".  

"**Não** (Pedro é marinheiro **e** Quelia é artista)" é o mesmo que "Pedro **Não** é marinheiro **ou** Quelia **não** é artista".

* Segunda lei de Morgan  

- A negação da disjunção(**ou**) é a conjunção(**e**) das negações.   
- Forma computacional: "**NOT** (P **OR** Q)" é equivalente a "**NOT** P **AND** **NOT** Q".  
!(P v Q) = !P ^ !Q

Exemplos com preposições:  
"**Não** está nublado **ou** chovendo" é equivalente a "**Não** está nublado **e** **não** está chovendo".  
"**Não** (Pedro é marinheiro **ou** Queila é artista)" é o mesmo que "Pedro **naõ** é marinheiro **e** Queila **não** é artista".  

Para entender melhor: negar que "Pedro é marinheiro **ou** Queila é artista" é igual a afirmar que "Pedro **não** é marinheiro **e** Queila **não** é artista".  

* Implicação-disjunção 

Exemplo:  
"**Se** sei programar, **então** sei lógica" (p -> q) é equivalente a "**Não** sei programar **ou** **não** sei lógica".
P -> Q = !P ou !Q

## Regras de inferência  
O processo de derivar conclusões de premissas é chamado de argumento. As regras de inferências nos permitem derivar argumentos válidos. 

* Eliminação de conjunção  

Se P ^ Q é verdade, então P é verdade e Q é verdade.  
Exemplo:  
"Gosto de pinguins **e** de golfinhos" (p ^ q). Logo, gosto de pinguins (P). Observe que eliminamos Q e mesmo assim P manteve-se verdadeiro.

* Modus ponens (MP)  

Do latim "a maneira que afirma afirmando", modus ponens (muitas vezes referido como MP), ou eliminação da implicação, é uma valida e simples forma de argumento e regra de inferência. Ele pode ser resumido como "P implica Q, P é afirmado verdade, portanto, Q deve ser verdade".

Sabendo que p->q e sabendo p. podemos afirmar que deve ser verdade (p->q)^p equivale a q. O símbolo de equivalente da aula não encontrei no teclado. 3 linhas parecido com o sinal de igual.

Exemplo:  
"Se alguém sabe programar, então a pessoa sabe lógica" (p->q). Elisa sabe programar(p). Logo, Elisa sabe lógica(q).

* Modus tollens (MT)

Do latim "modo que nega por negação", **modus tollens**, ou negação do consequente, é o nome formal para a prova indireta, também chamado de modo apagógico.

Exemplo: 
"**Se** alguém sabe programar, **então** a pessoa sabe lógica" (p -> q).  
Rodolfo **não** sabe lógica (!Q). Logo, Rodolfo **não** sabe programar (!P).

Fim da aula.
