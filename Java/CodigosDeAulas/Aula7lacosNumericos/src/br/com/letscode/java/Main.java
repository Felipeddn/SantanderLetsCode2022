package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
    // representar números de 1 a 10
        for (int index = 1; index <= 10; index++){
            System.out.println("Contagem: " + index);
        }

        // veja como o laço de repetição facilita nossa vida para valores maiores, apenas mude o 10 para 50
        for (int index = 1; index <= 50; index++){
            System.out.println("Contagem: " + index);
        }

        // podemos até ser abusado e fazer isso para 500 de forma muito fácil, eu realmente estou convencido que
        // isso é uma ferramenta em tanta para o programador
        for (int index = 1; index <= 500; index++){
            System.out.println("Contagem: " + index);
        }

        // contando de 2 em 2
        for (int index = 1; index <= 500; index+=2){
            System.out.println("Contagem: " + index);
        }

        // contando de 10 em 10
        for (int index = 1; index <= 500; index+=10){
            System.out.println("Contagem: " + index);
        }

        //Uma tabuada com esse recurso de repetição
        for (int index = 1; index <= 10; index++){
            System.out.println("Tabuada do " + index);
            System.out.println(1 * index);
            System.out.println(2 * index);
            System.out.println(3 * index);
            System.out.println(4 * index);
            System.out.println(5 * index);
            System.out.println(6 * index);
            System.out.println(7 * index);
            System.out.println(8 * index);
            System.out.println(9 * index);
            System.out.println(10 * index);
        }

        //laço aninhado para fazer uma tabuada de forma mais prática
        for (int index = 1; index <=10; index++){
            System.out.println("Tabuada do " + index + " com laço aninhado.");
            for (int index2 = 1; index2 <= 10; index2++){
                System.out.println(index + " x " + index2 + " = " + index * index2);
            }
        }
    }
}
