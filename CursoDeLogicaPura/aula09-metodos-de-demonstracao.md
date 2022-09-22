# Métodos de demonstração

Instrutor da Lets Code: Ricardo (Professor Web Full Stack)

## Prova Direta 

Um teorema na forma **P -> Q** pode ser provado através de uma prova direta, na qual começa-se com **P** e deduz-se **Q**.

Exemplo:  
1. P: n = 2k, onde K **pertence** Z
2. (n+1)<sup>2</sup> = (2k + 1)<sup>2</sup>
3. (2k + 1)<sup>2</sup> = 2(2k<sup>2</sup> + 2k) + 1
4. Kinteiro -> (2k<sup>2</sup> +  2k)inteiro
5. (n+1)<sup>2</sup> = 2k + 1
6. Q: (n+1)<sup>2</sup>impar
7. P -> Q

## Prova por contraposição

A prova por contraposição é utilizada quando uma prova direta é inviável, ou seja, não podemos provar diretamente que **P -> Q**. Utilizamos, portanto, a equivalência da contrapositiva: **P -> Q equivale ¬Q -> ¬P**. Começamos, então, com **¬Q** para então deduzir **¬P**, supondo o consequente falso e deduzindo a falsidade do antecedente.

Exemplo:  
Seja **x** um número inteiro. Prove que se **x<sup>2</sup>** é par, então **x** é par. Apesar de poder ser dada uma prova direta, podemos escolher provar esta afirmação por contraposição. A contrapositiva da declaração acima é:  

**¬Q -> ¬P**: Se **x** não é par, então **x<sup>2</sup>** não é par.

Essa última afirmação pode ser comprovada da seguinte forma:

1. ¬Q: x não é par.  
2. x = 2k + 1  
3. (2k + 1)<sup>2</sup> = 2(2k<sup>2</sup> + 2k) + 1  
4. ¬P: x<sup>2</sup> não é par.  
5. ¬Q -> ¬P

Suponha que não é par, então é impar. O produto de dois números impares é ímpar, portanto, **x<sup>2</sup> = x . x** é um número ímpar, assim **x<sup>2</sup>** não é par.

## Prova por contradição

Também é chamada *Reductio ad absurdum*, está prova consiste em utilizar a seguinte equivalência lógica:  
**¬(P -> Q) equivale (P ^ ¬Q)**. Provando a falsidade de **P ^ ¬Q**, portanto, provamos que **P -> Q** é verdadeira. A técnica consiste em supor **P -> Q** verdadeira e desta deduzir uma contradição.

Prove que existe infinitos números primos.

1. Supor **n** um número infinito de primos  
2. x = p<sub>1</sub>, p<sub>2</sub>...p<sub>n</sub> + 1  
3. **x** é indivisivel por p<sub>1</sub>, p<sub>2</sub>...p<sub>n</sub>  
4. **3; pn + 1** que divide **x**  
5. contradição  
6. Existe um número infinito de primos

Fim da aula 
