# Aula 3 - Simplificando Expressões Booleanas 

Professor Nivaldo Junior  
link da aula: https://www.youtube.com/watch?v=4nVoLN7cBAw

## Simplificando expressões booleanas  

Veja nas imagems **a03-tabelas-postulados-1.png**, **a03-tabelas-postulados-2.png**, **a03-tabelas-postulados-3.png**, **a03-tabelas-postulados-4.png**, tabelas dos postulados 

1) S = (A+B+C).(A+B+C)

essa caso equivale a seguinte propriedade **A.A = A**, essa propriedade está registrada na imagem: **a03-tabelas-postulados-2.png**, na coluna de multiplicação segunda linha.

Dessa forma ao invés de resolver (A+B+C).(A+B+C), podemos resolver (A+B+C), que será equivalente, dessa forma não precisamos executar uma etapa, nesse exemplo, ganhando um tempo.

2) S = A.B + A(B + C) + B(B + C)

Nessa expressão temos distributivas na expressão **A(B + C)** e na expressão **B(B + C)**, essa propriedade foi abordada na **aula 2 item 14 propriedade distributiva**, depois de distribuir a expressão fica dessa forma:

S = A.B + **A.B + A.C + B.B + B.C**

Podemos começar nossa simplificação por **B.B** que atende a mesma propriedade do exercício anterior, onde **B.B = B**, **Na aula 2** essa propriedade foi abordada como **Identidades Booleanas item 8**,  depois de simplificar nossa expressão fica dessa forma:

S = A.B + A.B + A.C + **B** + B.C

Agora podemos simplificar **A.B + A.B** que se torna **A.B**, Essa propriedade é a propriedade das **identidades booleanas** que foi abordada no **item 4 da aula 2**, dessa forma após simplificar a expressão ela fica dessa forma:

S = **A.B** + A.C + B + B.C

Agora podemos simplificar **B + B.C** que se torna **B**, essa propriedade é a propriedade das **expressões auxiliares** que foi abordada no **exercicio 1 da aula 2**, dessa forma simplificamos a expressão e temos:

S = A.B + A.C + **B**

Por fim temos mais uma simplificação onde **A.B + B** é igual a **B**, que é a propriedade das **identidades booleanas** deixando a expressão da seguinte forma:

S = **B** + A.C

Então com essas simplificações podemos transforma isso: **S = A.B + A(B + C) + B(B + C)** , nisso: **S = B + A.C** a prova de tal afirmação pode ser verificada na seguinte imagem **a03-prova-de-simplificacao-2.png**.

3) S = A.B.C + A.**not**C + A.**not**B

É possível verificar que temos uma **distributiva** onde transformamos toda a expressão na seguinte expressão

S = A(B.C + **not**C + **not**B)

Aqui será um processo mais elaborado porque queremos chegar na simplificação de **Morgan** e para tal vamos fazer o seguinte:

**not**C + **not**B = **not**(B.C)

Agora temos:

S = A(B.C + **not**(B.C)), vamos renomear B.C de Y e agora fazemos essa mudança:

S = A(***Y*** + **not**(***Y***)) 

Essa expressão acima atende ao postulado das **identidades** onde a soma do igual pelo seu negativo equivale a **1**

Simplificamos e

S = A.1 

A vezes 1 é igual a A, segundo o **postulado das identidades**, dessa forma nossa solução é

S = A

É possível verificar isso na imagem **a03-prova-de-simplificacao-3.png**

4) S = (A+**not**B).(A+C)

Podemos aplicar o conceito de **distributiva** e desenvolver essa expressão booleana.

S = A.A + A.C + **not**B.A + **not**B.C

Segundo o **postulado das identidades** podemos simplificar **A.A = A**, logo a expressão fica:

S = **A** + A.C + **not**B.A + **not**B.C

Segundo o postulado da **associativa**, podemos transformar a expressão booleana acima na expressão abaixo:

S = (A + A.C + **not**B.A)+ **not**B.C 

e aplica o postulado da **distributiva**

S = A(1+ A.C + **not**B.A)+ **not**B.C

Agora aplicamos a identidade que diz que 1 + qualquer coisa = 1

S = A(1) + **not**B.C

Novamente temos a **identidade** A.1 = A

S= A + **not**B.C

ou seja, ***S = (A+**not**B).(A+C)*** = ***S= A + **not**B.C***

É possível conferir isso na imagem **a03-prova-de-simplificacao-4.png**

5) S = A.B.C(A.B+**not**C(B.C+A.C))  (na aula 4 a imagem do fim desse exercicio recebe uma correçaõ.)

Podemos começar **distribuíndo** a parte interna dos parenteses da expressão booleana

S = A.B.C(A.B+ **not**C.B.C + **not**C.C.A)

Agora podemos simplificar **not**C.C = 0 segundo o **postulado das identidades**.

S = A.B.C(A.B+ 0.B + 0.A)

Agora podemos simplificar **0.A = 0** segundo o **postulado das identidades**.

S = A.B.C(A.B+ 0 + 0)

Podemos eliminar os valores 0 e a expressão booleana fica assim:

S = A.B.C(A.B)

Agora aplicamos a **propriedade associativa** para tirar os parenteses e ordenar nossa expressão para melhorar sua visualização.

S = A.A.B.B.C

Simplificamos usando o **postulado das identidades** 

S = A.B.C

Por fim temos que S = A.B.C(A.B+**not**C(B.C+A.C)) = S = A.B.C, isso pode ser conferido na imagem **a03-prova-de-simplificacao-5.png**

6) S = (A+B).**not**(A+B)

Aqui podemos chamar A+B de Y

S = Y.**not**Y

aplicamos o **postulado das identidades**

S = 0

Podemos verificar que S = (A+B).**not**(A+B) = 0 observando isso na imagem **a03-prova-de-simplificacao-6.png**. olhar a imagem **a04-prova-de-simplificacao-6-correta.png**  da aula 4 pois essa imagem possui um erro que não altera o resultado final, mas que possui um equivoco no desenvolvimento das tabelas.

Após resolvermos todos esses exercícios existem algumas dicas para identificar possibilidades de simplificação, as dicas são:

* Procure "coisas" iguais em uma expressão  
* Verifique a possibilidade de desenvolver distributivas ou de reduzir para distributivas encontrando elementos que se repete em todos os termos.  
* Desenvolver distributivas quando os elementos forem diferentes  

"Simplificação de algebra booleana é usar as propriedade e postulados da algebra booleana para reduzir o tamanho de uma expressão booleana". 

Fim da Aula
