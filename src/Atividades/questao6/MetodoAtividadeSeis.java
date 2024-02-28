package atividades.questao6;

import java.util.Scanner;

public class MetodoAtividadeSeis {
    
    public void salarioFinal(){
        Scanner input = new Scanner(System.in);

        System.out.println("Quantas horas trabalhadas? ");
        int horas= input.nextInt();

        double salario = horas*12.5;

        System.out.println("Sálario há receber: R$ "+salario);
    }
}
