package br.com.letscode.java;

public class Main {
    // não consegui executar no intellij mas consegui executar com java Main.java

    public static void main(String[] args) {
	// write your code here
        /* 
        boolean resultado = true;
        boolean resultado2 = false;
        // atalho para System.out.println() -> sout + enter. Só funciona no intellij.
        System.out.println("Esse é um valor boolean " + resultado);
        System.out.println("Esse é outro valor boolean " + resultado2);
        */

        boolean fimDeSemana = true;
        boolean fazendoSol = true;
        boolean vamosAPraia = fimDeSemana && fazendoSol;
        // usaremos operadores lógicos para desenvolver essa aplicação o && equivale ao and.
        System.out.println("vamos a praia? " + vamosAPraia);

        /*
        * Tabela verdade
        *
        * Operador && (and)
        * true && true = true
        * true && false = false
        * false && true = false
        * false && false = false
        *
        * Operador || (OR)
        * true || true = true
        * true || false = true
        * false || true = true
        * false || false = false
        */

        // Operador ternário
        String mensagem = fimDeSemana ? "É fim de semana" : "Não é fim de semana";
        // a String mensagem irá receber a mensagem baseado no seguinte: se fimDeSemana for verdadeiro receberá o
        // primeiro valor ("É fim de semana"), caso seja falso receberá o segundo valor ("Não é fim de semana")
        System.out.println(mensagem);

    }
}
