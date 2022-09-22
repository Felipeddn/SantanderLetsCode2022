# Aula 2 - Propriedades de algebra booleana

Professor Nivaldo Junior  
link da aula: https://www.youtube.com/watch?v=Wqgug5UWfU4&list=PLRKGEaxOX82miHxszeYs3nnjteIsSTzNu&index=2

## Postulados da algebra booleana

Esses postulados ajudam a gente a melhorar nossa compreensão das lógicas booleanas, veja os postulados que são chamados de **identidades booleanas**:

1) A+0 = A (A **ou** 0 é igual a A)

2) A+1 = 1 (A **ou** 1 é igual a 1)

3) A+**not**A = 1 (A **ou** não A é igual a 1)

4) A+A = A (A **ou** A é igual a A)

5) A.0 = 0 (A **e** 0 é igual a 0)

6) A.1 = A (A **e** 1 é igual a A)

7) A.**not**A = 0 (A **e** não A é igual 0)

8) A.A = A (A **e** A é igual A)

9) **not**(**not**A) = A (negação de não A é igual A)

### Propriedade Comuntativa

10) A+B = B+A (A **ou** B é igual B **ou** A)

11) A.B = B.A (A **e** B é igual B **e** A)

### Propriedade Associativa

12) (A+B) + C = A + (B+C) 

13) (A.B) . C = A . (B.C)

### Propriedade Distributiva

14) A . (B + C) = A . B + A . C

### Teorema de Morgan

15) 
**not**(A.B.C...) = **not**A + **not**B + **not**C ...     
**not**(A+B+C...) = **not**A . **not**B . **not**C ...

## Exercicios para verificar aprendizado

1) A + A . B = A ?

A  B  A.B  A+A.B  
0  0  0    0  
0  1  0    0  
1  0  0    1  
1  1  1    1  

é equivalente e quando eu fiz por conta eu errei.

2) **not**A + A . **not**B = **not**A + **not**B ?

A  B  **not**A  **not**B  A.**not**B  **not**A+A.**not**B  **not**A+**not**B  
0  0  1         1         0           1                    1  
0  1  1         0         0           1                    1  
1  0  0         1         1           1                    1   
1  1  0         0         0           0                    0  

a equivalência é **verdadeira**

3) **not**A + **not**A . **not**B = **not**A ?

A  B  **not**A  **not**B  **not**A.**not**B  **not**A+**not**A.**not**B  
0  0  1         1         1                  1  
0  1  1         0         0                  1  
1  0  0         1         0                  0  
1  1  0         0         0                  0  

Na minha resolução não é verdadeiro, porém eu corrigi depois da correção do professor e é **verdadeiro**

4) A + **not**A . B = A + B ?

A  B  **not**A  **not**A.B  A+**not**A.B  A+B  
0  0  1         0           0             0  
0  1  1         1           1             1  
1  0  0         0           1             1  
1  1  0         0           1             1  

Na minha resolução não equivale, porém eu corrigi depois da correção do professor e é **verdadeiro**

5) **not**A + A . B = **not**A + B ?

A  B  **not**A  A.B  **not**A+A.B  **not**A+B    
0  0  1         0    1             1  
0  1  1         0    1             1  
1  0  0         0    0             0  
1  1  0         1    1             1

Na minha resolução não equivale, porém eu corrigi depois da correção do professor e é **verdadeiro**

6) A + **not**A . **not**B = A + **not**B ?

A  B  **not**A  **not**B  **not**A.**not**B  A+**not**A.**not**B  A+**not**B  
0  0  1         1         1                  1                    1   
0  1  1         0         0                  0                    0  
1  0  0         1         0                  1                    1  
1  1  0         0         0                  1                    1

Na minha resolução não equivale, porém eu corrigi depois da correção do professor e é **verdadeiro**

7) **not**A + **not**A . B = **not**A ?

A  B  **not**A  **not**A.B  **not**A+**not**A.B  
0  0  1         0           0  
0  1  1         1           1  
1  0  0         0           0   
1  1  0         0           0

Na minha resolução não equivale, porém eu corrigi depois da correção do professor e é **verdadeiro**

8) A + A . **not**B = A ?

A  B  **not**B  A.**not**B  A+A.**not**B  
0  0  1         0           0  
0  1  0         0           0  
1  0  1         1           1  
1  1  0         0           1

Na minha resolução não equivale, porém eu corrigi depois da correção do professor e é **verdadeiro**

9) (A + B) . (A + C) = A + B . C ?

A  B  C  A+B  A+C  (A+B).(A+C)  B.C  A+B.C  
0  0  0  0    0    0            0    0  
0  0  1  0    1    0            0    0  
0  1  0  1    0    0            0    0  
0  1  1  1    1    1            1    1  
1  0  0  1    1    1            0    1  
1  0  1  1    1    1            0    1  
1  1  0  1    1    1            0    1  
1  1  1  1    1    1            1    1  

Na minha resolução não equivale, porém eu corrigi depois da correção do professor e é **verdadeiro**

Todas essas expressões são **expressões auxiliares** onde podemos simplificar nossas expressões para facilitar a resolução.

## Conclusão e revisão

Dessa forma abordamos os **postulados da algebra booleana** que são:

* Identidades Booleanas  
* Propriedade Comutativa  
* Propriedade associativa  
* Propriedade distributiva  
* Teorema de Morgan  
* Expressões Auxiliares

Fim da aula
