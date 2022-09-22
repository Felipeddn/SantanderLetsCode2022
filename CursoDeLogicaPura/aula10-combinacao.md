# Aula 10 -  Combinação

Intrutor da Lets Code: Ricardo (professor Web Full Stack)

## Análise combinatória

### Combinação simples 

Para encontrar essa quantidade de agrupamentos formados em uma **combinação simples** utilizamos a seguinte fórmula: 

C{n,p} = n!/(p!(n - p)!)

Onde **n** é a quantidade de elementos de um conjunto e **p** é um número natural menor ou igual a **n**, que representa a quantidade de elementos que irão formar os agrupamentos.

### Combinação com repetição

Para encontrar essa quantidade de agrupamentos formados em uma **combinação com repetição** utilizamos a seguinte fórmula: 

C{n,p} = (n+p-1)! / p!(n - p)!    

Onde **n** é a quantidade de elementos de um conjunto e **p** é um número natural menor ou igual a **n**, que representa a quantidade de elementos que irão formar os agrupamentos.

### Permutação Simples

Para determinarmos o número de agrupamentos de uma permutação simples utilizamos a seguinte expressão:  

P = n! / (n-p)!

Onde **n** é a quantidade de elementos de um conjunto e **p** é um número natural menor ou igual a **n**, que representa a quantidade de elementos que irão formar os agrupamentos.

### Permutação com elementos repitidos

Se desejar contar também os casos com repetição em uma permutação, utilizamos a seguinte expressão:

P = n<sup>p</sup>

Onde **n** é a quantidade de elementos de um conjunto e **p** é um número natural menor ou igual a **n**, que representa a quantidade de elementos que irão formar os agrupamentos.

## Algoritmos de ordenação 

### Selection Sort

A ordenação por seleção ou selection sort consiste em selecionar o menor item e colocar na primeira posição, selecionar o segundo menor item e colocar na segunda posição, segue estes passos até que reste um único elemento.

Para todos os casos (melhor, médio e pior caso) possui complexidade **C(n) = O(n<sup>2</sup>)** e não é um algoritmo estável.

### Insertion Sort

Insertion sort ou ordenação por inserção é o método que percorre um vetor de elementos da esquerda para a direita e à medida que avança vai ordenando os elementos à esquerda.

Possui complexidade **C(n) = O(n)** no melhor caso e **C(n) = O(n<sup>2</sup>) no caso médio e pior caso.

### Merge Sort

Esse algoritmo divide o problema em pedaços menores, resolve cada pedaço e depois junta (merge) os resultados. O vetor será dividido em duas partes iguais, que serão cada um divididas em duas partes, e assim até ficar um ou dois elementos cuja ordenação é trivial.

É um método estável e possui complexidade **C(n) = O(n log n) para todos os casos.

### Quick Sort

Escolhe um elemento da lista chamada pivô. Reorganiza a lista de forma que os elementos menores que o pivô fiquem de um lado, e os maiores fiquem do outro. Esta operação é chamada de "particionamento". Recursivamente ordena a sub-lista abaixo e acima do pivô.

Possui complexidade **C(n) = O(n<sup>2</sup>)** no pior caso **C(n) = O(n log n)** no melhor e médio caso e não é um algoritmos estável.



Fim da aula
