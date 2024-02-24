package Atividades;

import java.util.Scanner;

public class atividadeCinco {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Informe o número: ");
        int num = input.nextInt();

        if (num%2==0) {
            System.out.println("O número "+num+" é Par!");
        } else if (!(num%2==0 || num%3==0 || num%5==0)) {
            System.out.println("O número "+num+" é Primo!");
        }else{
            System.out.println("O número "+num+" é ímpar!");
        }
    }
}
