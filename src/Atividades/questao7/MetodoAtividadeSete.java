package atividades.questao7;

import java.util.Scanner;

public class MetodoAtividadeSete {

    public void salarioFinal() {

        Scanner input = new Scanner(System.in);

        System.out.println("Quantas horas trabalhadas? ");
        int horas = input.nextInt();

        double salario = horas * 12.5;

        System.out.println("Sálario há receber: R$ " + salario);

        if (salario < 50.00) {
            System.out.println("\nAtenção, dirija-se à direção do Hotel!\n");
        }
    }
}
