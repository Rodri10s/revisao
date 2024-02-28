package atividades.questao2;

import java.util.Scanner;

public class MetodoAtividadeDois {
    
    public void calculadora(int numeroUm, int numeroDois){

        Scanner input = new Scanner(System.in);
        
        System.out.println("\nQual operação deseja realizar?\n");
        System.out.println("1 - Soma\n2 - Subtração\n3 - Multiplicação\n4 - Divisão\n");

        int operacao = input.nextInt();

        switch (operacao) {
            case 1:
                System.out.println("\n" + numeroUm + " + " + numeroDois + " = " + (numeroUm+numeroDois) + "\n");
                break;
            case 2:
                System.out.println("\n" + numeroUm + " - " + numeroDois + " = " + (numeroUm-numeroDois) + "\n");
                break;
            case 3:
                System.out.println("\n" + numeroUm + " x " + numeroDois + " = " + (numeroUm*numeroDois) + "\n");
                break;
            case 4:
                System.out.println("\n" + numeroUm + " / " + numeroDois + " = " + (numeroUm/numeroDois) + "\n");
                break;
            default:
                break;
        }
    }
}
