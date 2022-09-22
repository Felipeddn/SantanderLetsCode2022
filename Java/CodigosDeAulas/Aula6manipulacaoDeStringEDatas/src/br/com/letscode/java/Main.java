package br.com.letscode.java;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.TextStyle;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {
	// write your code here
        // Nessa aula vamos tentar programar a seguinte linha de comando:
        // Olá, {nome}. Hoje é {dia-da-semana}, {saudação-baseada-no-horario}
        // mas antes vamos aprender alguns métodos de manipulação de strings.
        //String texto = "Olá, mundo"; isso foi o que aprendemos de manipulação de strings até o momento.

        String nome = "Felipe";

        // método para deixar texto em letras maiúsculas.
        System.out.println(nome.toUpperCase());

        // método para deixar texto em letras minúsculas.
        System.out.println(nome.toLowerCase());

        // método para saber o tamanho do texto.
        System.out.println("Essa palavra possui " + nome.length() + " letras.");

        // método para comparar strings
        String nomeOutro = "Felipe";
        String nomeOutro2 = "felipe";
        System.out.println("As strings são iguais? " + nome.equals(nomeOutro));
        System.out.println("As strings são iguais? " + nome.equals(nomeOutro2));

        // método para comparar strings ignorando letras maiúsculas e minúsculas
        System.out.println("As strings são iguais (ignora letras maiúsculas e minúsculas)? " + nome.equalsIgnoreCase(nomeOutro2));

       // vamos retomar a proposta inicial da aula

       // ISO 8601 - determina com representar datas, determina o formato padrão para o mundo.
        LocalDate hoje = LocalDate.now();

        // método que retorna data no padrão aaaa-mm-dd
        System.out.println("Data atual: " + hoje);

        // método que retorna dia da semana em inglês
        System.out.println("Dia da semana atual: " + hoje.getDayOfWeek());

        // método que retorna dia da semana em um idioma específico.
        // armazenando informações em variáveis para usar no método getDisplayName.
        Locale brasil = new Locale("pt", "BR");
        System.out.println("Dia da semana atual (em português): " +hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil) );

        //armazenando em uma variável o dia da semana formatado para o Brasil.
        String diaSemana = hoje.getDayOfWeek().getDisplayName(TextStyle.FULL, brasil);

        //armazenando na variável saudação baseada no horário.
        String saudacao;
        LocalDateTime agora = LocalDateTime.now();
        if(agora.getHour() >= 0 && agora.getHour() < 12){
            saudacao = "bom dia";
        } else if(agora.getHour() >= 12 && agora.getHour() < 18){
            saudacao = "boa tarde";
        } else if (agora.getHour() >= 18 && agora.getHour() < 24){
            saudacao = "boa noite";
        } else {
            saudacao = "é bom ver você aqui";
        }

        //apresentando mensagem com o método System.out,printf()
        System.out.printf("Olá %s, hoje é %s, %s.%n", nome, diaSemana, saudacao.toUpperCase());
    }
}
