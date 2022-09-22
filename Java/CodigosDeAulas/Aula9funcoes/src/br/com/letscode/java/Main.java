package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // veja uma abordagem de saudação antes de conhecermos a ideia de função
        String nome = "Felipe";
        //System.out.println("Hello "+ nome+ ".");
        String nome2 = "Lets code";

        //essa abordagem ela é problemática a longo prazo, vejamos uma função que podemos fazer
        saudacao(nome);
        saudacao(nome2);
        //saudacao();

        //método para realizar a soma de valores
        int result = soma(2, 3);
        System.out.println("O resultado é : " + result);

    }

    // Funções em Java são chamados de métodos.
    public static void saudacao(String nome){
        /*
        if(nome.equals("")){
            nome = "nome não informado!";
        }

        if (nome == null){
            nome = "nome nulo";
        }
         */
        System.out.println("Hello, " + nome + " .");
    }

    public static int soma(int number1, int number2){
        /*
        int valor;
        valor = number1 + number2;
        return valor;
         */
        return number1 + number2;
    }
}
