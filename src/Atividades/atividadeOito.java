package Atividades;

import java.util.Scanner;

public class atividadeOito {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Valor de custo: ");
        double valor = input.nextDouble(); 

        System.out.println("Valor de venda: ");
        double venda = input.nextDouble(); 

        if(venda>=(valor+valor/2)){
            System.out.println("Lucro!");
        }else{
            System.out.println("Prejuízo!");
        }
    }
}
