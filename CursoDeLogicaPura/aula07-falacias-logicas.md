# Aula 7 - Falacias lógicas 

Instrutor da Lets Code: Ricardo (Professor Web Full Stack)

Uma falácia lógica é definida como um argumento incoerente, sem fundamento, inválido ou falho na tentativa de provar logicamente o que alega.

**Falácias formais** são erros em lógica dedutíveis a partir dos nossos conhecimentos de lógica formal. São, portanto, falhas na forma ou estrutura de argumentos, ao contrário de **falácias informais**, que podem ter formato lógica coerente, mas premissas falsas ou adulteradas.

## Falácias proposicionais  

Falácias proposicionais são erros lógicos que concernem a proposições lógicas formuladas com a estrutura incorreta.

### Afirmação da disjunção

Consiste em concluir que uma das proposições de uma disjunção é falsa se a outra é verdadeira:

1. p v q  
2. p  
3. |- ¬ q

Exemplo:

1. Para estar na capa da revista Caras, uma pessoa precisa ser uma celebridade ou ser extremamente bonita.  
2. A pessoa na capa deste mês foi uma celebridade.  
3. Portanto, essa celebridade não é extremamente bonita.

### Negação do antecedente

A negação do antecedente, também chamada de falácia da inversa, consiste em inferir a inversa a partir de uma proposição de causa-consequência. Se A, então B. A é falso. Portanto, B também é falso.

1. a -> b  
2. |- ¬a -> ¬b

Exemplo:  
"Se cada homem tivesse um conjunto bem definido de regras de conduta com as quais ele regulasse sua vida, ele não seria melhor do que uma máquina. Mas tais regras não existem, portanto homens não podem ser máquinas." - Turing Alan(1950), "Computing Machinery and Intelligence".

### Afirmação do consequente 

A afirmação do consequente, também chamada de falácia da recíproca, consiste em concluir a recíproca a partir de uma proposição de causa-consequência. Se A, então B. B é verdadeiro. Portanto, A é verdadeiro.

1. a -> b  
2. |- b -> a

Exemplo:  
"- Então você deve dizer o que pensa - disse a lebre de março".  
"- Eu já faço isso - Alice se apressou em responder. - Ou pelo menos, pelo menos eu acho o que eu digo... É o mesmo, não é?"  
"- O mesmo? De maneira nenhuma! - Disse o chapeleiro. - Nesse caso, seria o mesmo que dizer: vejo o que como e como o que vejo!"

## Fálacias categóricas

### Ilícita negativa

Por conta de um símbolo que está presente no texto que não possui no teclado do computador veja a imagem **a07ilicita-negativa.png** para entender o conteúdo desse tópico.

### Composição/Divisão

Implica que uma parte de algo deve ser aplicada ao todo. Muitas vezes, quando algo é verdadeiro em parte, isso também se aplica ao todo, mas é crucial saber se existe evidência de que este é mesmo o caso.

Exemplo:  
Daniel era uma criança precoce com uma predileção por pensamento lógico. Ele sabia que os átomos são invisíveis, então logo concluiu que ele, por ser feito de átomos, também era invisível. Nunca foi vitorioso em uma partida de esconde-esconde.

### Composição

Por conta de um símbolo que está presente no texto que não possui no teclado do computador veja a imagem **a07composicao.png** para entender o conteúdo desse tópico.

### Divisão

Supor que uma propriedade do todo pode ser aplicada a cada parte.

Exemplo  
Você deve ser rico, pois estuda num colégio de ricos.

### Acidente ou ***dicto simpliciter***

Generalizar do seguinte modo:  

- X é verdadeiro sob a condição Y.  
- X acontece na condição Z.  
- Logo, X é verdadeiro na condição Z.

Exemplo 1:  
É permitido aos soldados matar em tempos de guerra.   
O soldado Julio matou em tempo de paz.  
Logo, é permitido ao soldado Julio matar também em tempos de paz.  

Exemplo 2:  
Matheus não fuma para não desenvolver câncer de pulmão.  
Ricardo não fuma e desenvolveu câncer de pulmão.  
Logo, não fumar também provoca câncer de pulmão.

Fim da aula
