package atividades.questao5;

import java.util.Scanner;

public class AtividadeCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int num = input.nextInt();

        MetodoAtividadeCinco metodo = new MetodoAtividadeCinco();

        boolean primo = metodo.verificarPrimo(num);
        boolean impar = metodo.verificarImpar(num);

        metodo.imprimirResultado(impar, primo);
    }
}
