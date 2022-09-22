# Aula 5 - Sistemas de dedução 

Instrutor da Lets Code: Ricardo (Professor Web Full Stack)

Sistema de dedução são úteis para validar conclusões a partir de um conjunto de premissas. Comprovar determinada conclusão, dentro da lógica formal, é chamado de prova linear.

Nomeamos de **prova linear** um sequência de passos que nos leva a uma conclusão.

## Axiomas 

Axiomas são premissas consideradas necessariamente evidentes e verdadeiras sem necessidade de demonstração. Alguns axiomas da lógica proposicional:

* p -> ( q -> p)  
* (p -> (q -> p)) -> ((p -> q) -> (p -> r))  
* (¬r -> ¬q) -> (q -> p)

Descobri que o simbolo de negativo está no botão 6 e que para acessar ele basta usar no windows **ctrl + alt + tecla 6** abaixo dos botões **F6, F7**.

### Aplicação prática do sistema de dedução

Provar que, dado **p**, se **p -> q** e **(p -> q) -> (q -> r)**, então **r**.

Primeira premissa: **p**  
Segunda premissa: **p -> q**  
Terceira premissa: **(p -> q) -> (q -> r)**, ***Modus Ponens*** das linhas 2 e 1. Se **p** for verdadeiro, então **q** é verdadeiro. **p** é verdadeiro. Logo, **q** é verdadeiro.  
4. **q** - ***Modus Ponens*** da linha 3 e 2 para concluir.  
5. **q -> r** - Se **q** for verdadeiro, então **r** é verdadeiro. **q** é verdadeiro. Modus Ponens 5, 4.  
6. **r** - Se **q** for verdadeiro, então **r** é verdadeiro. **q** é verdadeiro. Logo, **r** é verdadeiro.

Provar que, se **p -> q** e **q -> r**, então **p -> r**.  

1. p -> q  
2. q -> r  
3. p -> (q -> r)  
4. (p -> q) -> (p -> r)  
5. p -> r

## Prova estruturada

A prova estruturada segue a mesma lógica da demonstração linear, mas utiliza-se da hipótese que tornam a prova mais estruturada e também mais poderosa. As hipóteses geram subprovas, enquanto a demonstração original é chamada de superprova.

1. p -> q  
2. q -> r  
3. _____ assumir; p
4. _____ q
5. _____ r

Fim da aula 
