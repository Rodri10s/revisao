package Atividades;

import java.util.Scanner;

public class atividadeSete {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas horas trabalhadas? ");
        int horas= input.nextInt();

        double salario = horas*12.5;

        System.out.println("Sálario há receber: "+salario);

        if (salario<50.00) {
            System.out.println("\nAtenção, dirija-se à direção do Hotel!\n");
        }
    }
}
