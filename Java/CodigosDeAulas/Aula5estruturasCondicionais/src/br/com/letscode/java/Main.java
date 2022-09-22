package br.com.letscode.java;

public class Main {

    public static void main(String[] args) {
        // write your code here

        int nota = 70;
        int nota2 = 50;

        // Se a nota for maior ou igual a 70, então o aluno está aprovado. Para isso usaremos o if-else

        System.out.println("Avaliando nota:");

        if (nota >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        System.out.println("Avaliando nota2:");

        if (nota2 >= 70) {
            System.out.println("Aluno aprovado!");
        } else {
            System.out.println("Aluno reprovado.");
        }

        int nota3 = 50;
        int nota4 = -1;

        /* tentativa pessoal
        // para escolas que avaliam com notas A = 100 B = 80 C = 60 D = 40 E = 20 F = 0

        if (nota3 > 100) {
            System.out.println("Nota A");
        } else if (nota3 <81 && nota3 > 60) {
            System.out.println("Nota B");
        } else if (nota3 < 61 && nota3 > 40) {
            System.out.println("Nota C");
        } else if (nota3 < 41 && nota3 > 20){
            System.out.println("Nota D");
        } else if (nota3 < 21 && nota3 > 0){
            System.out.println("Nota E");
        } else {
            System.out.println("Nota F");
        }
         */

        // A 80 B 70 C 60 D 0

        /*
        if(nota3 >= 80) {
            System.out.println("Graduação A");
        } else if (nota3 < 80 && nota3 >= 70){
            System.out.println("Graduação B");
        } else if (nota3 < 70 && nota3 >= 60){
            System.out.println("Graduação C");
        } else if (nota3 < 60 && nota3 >= 0){
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota inválida!");
        }
        */


        // testando com - 1
        if (nota4 >= 80) {
            System.out.println("Graduação A");
        } else if (nota4 < 80 && nota4 >= 70) {
            System.out.println("Graduação B");
        } else if (nota4 < 70 && nota4 >= 60) {
            System.out.println("Graduação C");
        } else if (nota4 < 60 && nota4 >= 0) {
            System.out.println("Graduação D");
        } else {
            System.out.println("Nota inválida!");
        }

        String graduacao;

        if (nota3 >= 80) {
            graduacao = "A";
        } else if (nota3 < 80 && nota3 >= 70) {
            graduacao = "B";
        } else if (nota3 < 70 && nota3 >= 60) {
            graduacao = "C";
        } else if (nota3 < 60 && nota3 >= 0) {
            graduacao = "D";
        } else {
            graduacao = "";
        }

        switch (graduacao) {
            case "A":
            case "B":
                System.out.println("Aluno aprovado!");
                break;
            case "C":
            case "D":
                System.out.println("Reprovado!");
                break;
            default:
                System.out.println("Graduação inválida");
        }

    }

}
