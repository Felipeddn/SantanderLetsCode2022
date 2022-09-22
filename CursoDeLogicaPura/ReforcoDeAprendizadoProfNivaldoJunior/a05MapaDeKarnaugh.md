# aula 5 - Mapa de Karnaugh

Professor Nivaldo Junior  
link da aula: https://www.youtube.com/watch?v=xB99jX9QMOE&list=PLRKGEaxOX82miHxszeYs3nnjteIsSTzNu&index=5

O mapa de Karnaugh facilita nossa simplificação de expressões booleanas para a menor possível.

com o mapa de Karnaugh transformamos nossa tabela verdade de diferente forma veja a transformação da tabela verdade em um mapa de karnaugh

Tabela Verdade

A  B  S  
0  0  **S1**  
0  1  **S2**  
1  0  **S3**  
1  1  **S4**

Mapa de Kanaugh

A\B  0   1
0    S1  S2
1    S3  S4

Outro exemplo com mais variáveis

Tabela Verdade

A  B  C  S  
0  0  0  **S1**  
0  0  1  **S2**  
0  1  0  **S3**   
0  1  1  **S4**   
1  0  0  **S5**  
1  0  1  **S6**  
1  1  0  **S7**  
1  1  1  **S8**

Mapa de Kanaugh

A\BC  00  01  11  10
0     S1  S2  S4  S3
1     S5  S6  S8  S7

Agora vamos colocar em prática esse conceito para resolver um mapa de Karnaugh

## Exercicio 1

A  B  C  S  
0  0  0  **0**  
0  0  1  **1**  
0  1  0  **1**   
0  1  1  **1**   
1  0  0  **1**  
1  0  1  **1**  
1  1  0  **1**  
1  1  1  **1**

A\BC  00  01  11  10  
0     0   1   1   1  
1     1   1   1   1  

### Analise de mapa de Karnaugh 

Agora vamos aplicar o conceito de simplificação do mapa de Karnaugh juntando grupos para simplificar.

Para agrupar precisamos aplicar o seguinte filtro
2 - pares (grupos em pares)  
4 - quartetos (grupos com 4 valores)  
8 - octetos (grupos com 8 valores)

Agora a gente faz a analise do mapa para descobrir os quartetos e desenvolver a simplificação, vamos começar pelos quartetos possíveis

temos: 

Primeiro quarteto

A\BC  00  **01**  **11**  10  
0     0   **1**   **1**   1  
1     1   **1**   **1**   1  

Segundo quarteto

A\BC  00  01  **11**  **10**  
0     0   1   **1**   **1**  
1     1   1   **1**   **1**  

Terceiro quarteto

A\BC  00  01  11  10  
0     0   1   1   1  
1     **1   1   1   1**  

agora analisando os quartetos temos o seguinte

Primeiro quarteto

A\BC  00  **01**  **11**  10  
0     0   **1**   **1**   1  
1     1   **1**   **1**   1  

A = 0/1  B = 0/1  C = 1 logo, o valor que sempre permanece 1 é o **C**.

Vamos continuar a analise:

Segundo quarteto

A\BC  00  01  **11**  **10**  
0     0   1   **1**   **1**  
1     1   1   **1**   **1**  

A = 0/1  B = 1  C = 0/1 logo, o valor que sempre permanece 1 é o **B**.

Por fim vamos analisar o último quarteto

Terceiro quarteto

A\BC  00  01  11  10  
0     0   1   1   1  
1     **1   1   1   1**  

A = 1  B = 0/1  C = 0/1, o valor que sempre permanece 1 é o **A**.

Agora a gente soma todo mundo **A + B + C** e temos a menor expressão possível da tabela verdade.

## Execício 2 

A  B  C  S  
0  0  0  **0**  
0  0  1  **0**  
0  1  0  **1**   
0  1  1  **1**   
1  0  0  **0**  
1  0  1  **1**  
1  1  0  **1**  
1  1  1  **1**

A\BC  00  01  11  10  
0     0   0   1   1  
1     0   1   1   1  

### Analise de mapa de Karnaugh 

Agora desenvolvemos a analise dos grupos possíveis.

A\BC  00  01  11  10  
0     0   0   **1   1**  
1     0   1   **1   1**

Nesse grupo:  
A = 0/1  B = 1  C = 0/1 logo **B**  

A\BC  00  01  11  10  
0     0   0   1   1  
1     0   **1   1**   1  

Nesse grupo:

A = 1  B = 0/1  C = 1 logo **A.C**

Simplificando temos:

B + A.C

## Execício 3

A  B  C  S  
0  0  0  **0**  
0  0  1  **0**  
0  1  0  **0**   
0  1  1  **0**   
1  0  0  **1**  
1  0  1  **1**  
1  1  0  **1**  
1  1  1  **1**

A\BC  00  01  11  10  
0     0   0   0   0  
1     1   1   1   1

### Analise de mapa de Karnaugh 

A\BC  00  01  11  10  
0     0   0   0   0  
1     **1   1   1   1**

A = 1  B = 0/1  C = 0/1  logo **A**

## Exercício 4

A  B  C  S  
0  0  0  **0**  
0  0  1  **1**  
0  1  0  **0**   
0  1  1  **0**   
1  0  0  **1**  
1  0  1  **1**  
1  1  0  **1**  
1  1  1  **1**

A\BC  00  01  11  10  
0     0   1   0   0  
1     1   1   1   1

### Analise de mapa de Karnaugh 

A\BC  00  01  11  10  
0     0   1   0   0  
1     **1   1   1   1**

A = 1  B = 0/1  C = 0/1 logo **A**

A\BC  00  01  11  10  
0     0   **1**   0   0  
1     1   **1**   1   1

A = 0/1  B = 0  C = 1 logo **notB.C**

expressão A + notB.C

## Exercicio 5

A  B  C  S  
0  0  0  **0**  
0  0  1  **0**  
0  1  0  **0**   
0  1  1  **0**   
1  0  0  **0**  
1  0  1  **0**  
1  1  0  **0**  
1  1  1  **1**

A\BC  00  01  11  10  
0     0   0   0   0  
1     0   0   1   0

### Analise do mapa de karnaugh

A\BC  00  01  11  10  
0     0   0   0   0  
1     0   0   **1**   0

A = 1  B = 1  C = 1 logo  **A.B.C**

## Exercicio 6 com 4 entradas

A  B  C  D  S
0  0  0  0  **0**
0  0  0  1  **0**
0  0  1  0  **0**
0  0  1  1  **1**
0  1  0  0  **1**
0  1  0  1  **1**
0  1  1  0  **0**
0  1  1  1  **0**
1  0  0  0  **1**
1  0  0  1  **1**
1  0  1  0  **1**
1  0  1  1  **1**
1  1  0  0  **0**
1  1  0  1  **0**
1  1  1  0  **0**
1  1  1  1  **1**

Mapa de Karnaugh

AB\CD  00 01 11 00  
00     0  0  1  0  
01     1  1  0  0  
11     0  0  1  0  
10     1  1  1  1

### Analisando o Mapa de Karnaugh

AB\CD  00 01 11 00  
00     0  0  1  0  
01     1  1  0  0  
11     0  0  **1**  0  
10     1  1  **1**  1

A = 1  B = 0/1  C = 1  D = 1, logo **A.C.D**

AB\CD  00 01 11 00  
00     0  0  1  0  
01     1  1  0  0  
11     0  0  1  0  
10     **1  1  1  1**

A = 1  B = 0  C = 0/1  D = 0/1, logo **A.notB**

AB\CD  00 01 11 00  
00     0  0  1  0  
01     **1  1**  0  0  
11     0  0  1  0  
10     1  1  1  1

A = 0  B = 1  C = 0  D = 0/1, logo **notA.B.notC**

AB\CD  00 01 11 00  
00     0  0  **1**  0  
01     1  1  0  0  
11     0  0  1  0  
10     1  1  **1**  1

A = 0/1  B = 0  C = 1  D = 1, logo **notB.C.D**

Formando a expressão booleana:  

A.C.D + A.notB + notA.B.notC + notB.C.D

## Exercicio 7 com 5 entradas 

A  B  C  D  E  S  
0  0  0  0  0  0  
0  0  0  0  1  0   
0  0  0  1  0  1  
0  0  0  1  1  0  
0  0  1  0  0  0  
0  0  1  0  1  0  
0  0  1  1  0  1  
0  0  1  1  1  0  
0  1  0  0  0  0  
0  1  0  0  1  0   
0  1  0  1  0  1  
0  1  0  1  1  1  
0  1  1  0  0  1  
0  1  1  0  1  1  
0  1  1  1  0  1  
0  1  1  1  1  1  
1  0  0  0  0  0  
1  0  0  0  1  0  
1  0  0  1  0  1  
1  0  0  1  1  1  
1  0  1  0  0  1  
1  0  1  0  1  0  
1  0  1  1  0  1  
1  0  1  1  1  1  
1  1  0  0  0  0  
1  1  0  0  1  0  
1  1  0  1  0  1  
1  1  0  1  1  1  
1  1  1  0  0  1  
1  1  1  0  1  1  
1  1  1  1  0  1  
1  1  1  1  1  1  

AB\CDE 000  001  011  010  110 111 101 100    
00     0    0    0    1    1   0   0   0  
01     0    0    1    1    1   1   1   1  
11     0    0    1    1    1   1   1   1  
10     0    0    1    1    1   1   0   1

### Análise do mapa de Karnaugh

AB\CDE 000  001  011  010  110 111 101 100    
00     0    0    0    1    1   0   0   0  
01     0    0    **1    1    1   1**   1   1  
11     0    0    **1    1    1   1**   1   1  
10     0    0    1    1    1   1   0   1

A = 0/1  B = 1  C = 0/1  D = 1  E = 0/1, logo **B.D**

AB\CDE 000  001  011  010  110 111 101 100    
00     0    0    0    **1    1**   0   0   0  
01     0    0    1    **1    1**   1   1   1  
11     0    0    1    **1    1**   1   1   1  
10     0    0    1    **1    1**   1   0   1

A = 0/1  B = 0/1  C = 0/1  D = 1  E = 0, logo **D.notE**

AB\CDE 000  001  011  010  110 111 101 100    
00     0    0    0    1    1   0   0   0  
01     0    0    1    1    **1   1   1   1**  
11     0    0    1    1    **1   1   1   1**  
10     0    0    1    1    1   1   0   1

A = 0/1  B = 1  C = 1  D = 0/1  E = 0/1, logo **B.C**

AB\CDE 000  001  011  010  110 111 101 100    
00     0    0    0    1    1   0   0   0  
01     0    0    1    1    1   1   1   1  
11     0    0    **1    1    1   1**   1   1  
10     0    0    **1    1    1   1**   0   1

A = 1  B = 0/1  C = 0/1  D = 1  E = 0/1, logo **A.D**

AB\CDE 000  001  011  010  110 111 101 100    
00     0    0    0    1    1   0   0   0  
01     0    0    1    1    1   1   1   1  
11     0    0    1    1    **1**   1   1   **1**  
10     0    0    1    1    **1**   1   0   **1**

A = 1  B = 0/1  C = 1  D = 0/1  E = 0, logo **A.C.notE**

A expressão Booleana simplificada fica:  

B.D + D.notE + B.C + A.D + A.C.notE

Fim da Aula
