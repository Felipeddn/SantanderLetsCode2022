# Aula 1 - Expressões booleanas, Circuitos lógicos e Tabela verdade.

Professor Nivaldo Junior  
link da aula: https://www.youtube.com/watch?v=aYVz0l3ZMWc&list=PLRKGEaxOX82miHxszeYs3nnjteIsSTzNu

## Porta-lógicas

Veja o desenho das portas lógicas e um desenho facilitador da compreensão da porta lógica na imagem **a01-porta-logica.png**

Tabelas verdades 

Para ver a tabela verdade da porta lógica **AND** basta olhar a imagem **a01-tabela-verdade-and.png**, uma ideia que facilita o entendimento da porta **And** é que ela sera verdadeira apenas se ambos os valores forem verdadeiros.

Para ver a tabela verdade da porta lógica **OR** basta olhar a imagem **a01-tabela-verdade-or.png**, uma ideia que facilita o entendimento da porta **or** é que ela será apenas falso se ambos os valores forem falso.

Para ver a tabela verdade da porta lógica **NOT** basta olhar a imagem **a01-tabela-verdade-not.png**, a tabela verdade da porta not é facil ela inverte, se entra de um lado verdadeiro ela muda para falso e se entra de um lado falso ela inverta para verdadeiro.  

## Expressões booleanas com circuitos

Nas expressões booleanas o and será representado com o sinal de vezes (.) e o or será representado com o sinal de soma (+).

Na hora de montar a tabela verdade podemos partir da expressão booleana (A.B) . (B+C) onde esse expressão representa o mesmo que:

(A **E** B) **E** (B **OU** C)

Para construir a tabela verdade existe um pensamento que facilita, existe os valores A, B e C = ou seja 2 elevado a 3, pois cada um pode ser verdadeiro ou falso e são 3 valores, 2 de opções 3 de valores, o resultado é 8 valores possíveis para facilitar lógica da construção da tabela verdade fazemos o seguinte

primeiro:

A  B  C  
0  0  0      
0  0  1  
0  1  0  
0  1  1  
1  0  0  
1  0  1  
1  1  0  
1  1  1  

observe que começamos sempre com metade dos valores 0 e metade do valores 1, quatro 0 e quatro 1, e depois sempre metade disso, dois 0 e dois 1, e um 1 e um 1 finalizando nossas possibilidades e agora podemos inserir os resultados

agora com essas possibilidades definidas podemos achar os resultados

A  B  C    A.B  B+C (A.B).(B+C)  
0  0  0    0    0   **0**    
0  0  1    0    1   **0**  
0  1  0    0    1   **0**  
0  1  1    0    1   **0**  
1  0  0    0    0   **0**  
1  0  1    0    1   **0**  
1  1  0    1    1   **1**  
1  1  1    1    1   **1**  

a segunda expressão da aula não pode ser digitado no markdown por que eu desconheço a forma de colocar um traço em cima das letras por conta disso veja a imagem **a01-expressao-booleana.png**.

Fim da Aula
