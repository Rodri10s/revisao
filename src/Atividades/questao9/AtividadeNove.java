package atividades.questao9;

import java.util.Scanner;

public class AtividadeNove {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número do mês: ");
        int num = input.nextInt();

        MetodoAtividadeNove metodo = new MetodoAtividadeNove();

        metodo.verificadorDeMes(num);
        
    }
}
