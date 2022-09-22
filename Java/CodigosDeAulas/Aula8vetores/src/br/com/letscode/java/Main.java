package br.com.letscode.java;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // veja como seria armazenar 5 valores em variáveis sem o uso de array
        /*
        int numero1 = 1;
        int numero2 = 2;
        int numero3 = 3;
        int numero4 = 4;
        int numero5 = 5;
        */

        //veja como é mais prático fazer isso com um array e a sintaxe para escrever um array
        int[] numeros = new int[5];
        // [] [] [] [] []
        // para nomear variáveis do tipo array o nome deve estar em plural

        //podemos preencher nosso array através de seus indices que inicia pelo valor 0.
        numeros[0] = 1;
        numeros[1] = 2;
        numeros[2] = 3;
        numeros[3] = 4;
        numeros[4] = 5;
        // mas essa não é uma maneira prática de fazer isso. Existe uma forma mais prática para isso.

        //E para visualizar o conteúdo de array fazemos assim
        System.out.println(numeros);

        //o resultado do comando de linha acima foi [I@e9e54c2, onde:
        // [ quer dizer que se trata de um array
        // I significa o tipo do array que é inteiros
        // @e9e54c2 é o endereço de memória do computador onde está armazenado o conteúdo desse array

        //podemos visualizar o conteúdo do array da seguinte forma:
        /*
        System.out.println("Visualizando conteúdo de um array de forma pouco prática: ");
        System.out.println("Conteúdo da variável números na posição 1: " + numeros[0]);
        System.out.println("Conteúdo da variável números na posição 2: " + numeros[1]);
        System.out.println("Conteúdo da variável números na posição 3: " + numeros[2]);
        System.out.println("Conteúdo da variável números na posição 4: " + numeros[3]);
        System.out.println("Conteúdo da variável números na posição 5: " + numeros[4]);
         */
        // essa não é uma forma prática de visualizar conteúdos de um array

        //A forma pratica de inserir conteúdo e visualizar conteúdo de array é através de laços de repetição
        System.out.println("Visualizando array com laços de repetição: ");
        for(int index = 0; index < numeros.length; index++ ){
            System.out.println("Conteúdo da variável números na posição "+ index +": " + numeros[index]);
        }

        //Vamos fazer um array de letras agora
        //Na declaração de um array na hora de colocar o tipo não podemos esquecer dos [], ou seja:
        // Para um array de strings declaramos String[] nome_da_variável.
        /*
        String[] letras = new String[5];
        letras[0] = "A";
        letras[1] = "B";
        letras[2] = "C";
        letras[3] = "D";
        letras[4] = "X";



        //Vamos visualizar seu conteúdo agora
        System.out.println("Visualizar Array de letras com laço de repetição: ");
        for(int index2 = 0; index2 < letras.length; index2++ ){
            System.out.println("Conteúdo da variável números na posição "+ index2 +": " + letras[index2]);
        }

        */

        // forma de definir valores do array já na declaração do mesmo
        String[] letras2 = {"E", "F", "G", "H", "Z"};

        System.out.println("Visualizar Array de letras com laço de repetição: ");
        for(int index2 = 0; index2 < letras2.length; index2++ ){
            System.out.println("letras["+ index2 + "]: " + letras2[index2]);
        }

        //O Java possui um método para facilitar a visualização de array:
        System.out.println("Array mostrado pelo método do Java: " + Arrays.toString(letras2));

        //Descobrindo o maior elemento em um array:
        int[] numeros2 = {9, 10, 12, 25, 2};

        //uma abordagem inteligente para descobrir o maior valor em um array é atribuir
        // ao maior o primeiro valor do array, a mesma abordagem é valida para o menor valor
        int maior = numeros2[0];
        int menor = numeros2[0];
        double media = 0;

        for(int index = 0; index < numeros2.length; index++){
            //armazenando o maior valor
            if (maior < numeros2[index]){
                maior = numeros2[index];
            }
            //armazenando o menor valor
            if (menor > numeros2[index]){
                menor = numeros2[index];
            }
            // armazenando todos os valores para tirar a média depois
            media+= numeros2[index];
        }

        // obtendo a média
        media = (double)  media/numeros2.length;

        System.out.println("O maior número do array numeros2 é " + maior);
        System.out.println("O menor número do array numeros2 é " + menor);
        System.out.println("A média dos números do array numeros2 é " + media);

    }
}
