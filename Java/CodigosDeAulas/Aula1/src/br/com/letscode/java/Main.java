package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        /*
        String nome4;

        String nome = "Felipe";
        String nome2 = "Let´s Code";
        String nome3 = "Santander";
        nome4 = "Programação";

        System.out.println("Hello, " + nome);
        System.out.println("Hello, " + nome2);
        System.out.println("Hello, "+ nome3);
        System.out.println("Hello, " + nome4);
         */

    // variáveis com tipo númerico

        int a;
        int b = 2;
    //atribuindo valor a variável a
        a = 3;

        int soma = a + b;
        int subtracao = a - b;
        int multiplicacao = a * b;
        int divisao = a / b;
        float divisao_real = (float) a / b;

        // para concatenar texto com variável devemos usar o sinal + e não a vírgula(,).
        // para divisão de números com resultado real, precisamos usar variáveis com o tipo real
        // podemos usar o cast informando o tipo no começo da operação para obter divisão de números reais.

        System.out.println("Soma de a e b = " + soma);
        System.out.println("Subtração de a e b = " + subtracao);
        System.out.println("Multiplicação de a e b = " + multiplicacao);
        System.out.println("Divisão de a e b = " + divisao);
        System.out.println("Divisão real de a e b = " + divisao_real);
    }
}
