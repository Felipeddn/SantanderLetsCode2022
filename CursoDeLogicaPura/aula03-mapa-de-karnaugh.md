# Mapa de Karnaugh

Instrutor da Lets Code: Ricardo (Professor Web Full Stack)

Mapa de Karnaugh ( se diz Carnô) traduz proposições para uma linguagem binária.

Outro modo de representar a expressão booleana inicial é de forma algébrica, com uma operação de adição no lugar de v (**ou**), uma barra no lugar do (**not**) e uma operação de multiplicação no lugar de ^(**e**).

Expressões Booleanas  
1. A + B  
2. (A +)(A + B)  
3. A + B  

## Mapa de Karnaugh

Os mapas de Karnaugh são ferramentas bastante práticas utilizadas para a **simplificação de expressões booleanas complexas**.  
O mapa consegue transformar a tabela verdade em um modelo que vai ser implementado em hardware, com o circuito mais otimizado possível.  

Para a montagem do mapa de Karnaugh, utilizamos como **colunas** e **linhas** as **entradas da tabela verdade**. Com apenas 2 entradas, teríamos 1 coluna e 1 linha. Com 3 entradas, teríamos 2 linhas e 3 colunas, com os valores 00, 01, 11, 10 (perceba que a tabela verdade representa como 0 e 1, ou seja, falso e verdadeiro).

Para compreender melhor veja a imagem **a03mapa-de-karnaugh.png**.  
Para compreender mais de duas entradas no mapa de karnaugh veja a imagem **a03mapa-de-karnaugh-mais-entradas.png**.

* Regras para o mapa de Karnaugh

* Eles utilizam regras de simplificação de expressões através do agrupamento de células adjacentes contendo o número 1.

Não entendi foi nada dessa regra. 

* Não se pode agrupar de forma a montar diagonais é necessário estar um ao lado do outro.

* O mapa de Karnaugh busca produzir o menor circuito possível.

* Não podemos deixar de contemplar nenhum número 1 no mapa de Karnaugh

* Podemos sobrepor grupos, ou seja, para conseguir a melhor otimização podemos incluir em um grupo números 1 que já estavam em outros grupos.

* Celulas nas extremidades se conectam, uma espécie de pac-man onde a tela não acaba nas extremidades mas continua do outro lado. A imagem **a03bordas-conectadas-karnaugh.png** possibilita visualizar essa regra.

Fim da aula
