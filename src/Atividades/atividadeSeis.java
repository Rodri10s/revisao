package Atividades;

import java.util.Scanner;

public class atividadeSeis {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas horas trabalhadas? ");
        int horas= input.nextInt();

        double salario = horas*12.5;

        System.out.println("Sálario há receber: "+salario);
    }
}
