package atividades.questao8;

import java.util.Scanner;

public class AtividadeOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor de custo: ");
        double valor = input.nextDouble(); 

        System.out.println("Valor de venda: ");
        double venda = input.nextDouble(); 

        MetodoAtividadeOito metodo = new MetodoAtividadeOito();

        metodo.verificadorDeLucro(valor, venda);
    }
}
