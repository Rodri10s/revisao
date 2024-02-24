package Atividades;

import java.util.Scanner;

public class atividadeDois {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Primeiro número: ");
        int num1 = input.nextInt();
        System.out.println("Segundo número: ");
        int num2 = input.nextInt();

        System.out.println("\nQual operação deseja realizar?\n");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("\n" + num1 + " + " + num2 + " = " + (num1+num2) + "\n");
                break;
            case 2:
                System.out.println("\n" + num1 + " - " + num2 + " = " + (num1-num2) + "\n");
                break;
            case 3:
                System.out.println("\n" + num1 + " x " + num2 + " = " + (num1*num2) + "\n");
                break;
            case 4:
                System.out.println("\n" + num1 + " / " + num2 + " = " + (num1/num2) + "\n");
                break;
            default:
                break;
        }
    }
}
