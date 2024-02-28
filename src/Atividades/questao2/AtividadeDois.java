package atividades.questao2;

import java.util.Scanner;

public class AtividadeDois {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Segundo número: ");
        int num2 = input.nextInt();

        MetodoAtividadeDois metodo = new MetodoAtividadeDois();

        metodo.calculadora(num1, num2);
    }
}
