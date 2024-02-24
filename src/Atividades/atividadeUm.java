package Atividades;

import java.util.Scanner;

public class atividadeUm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("De qual numero deseja ver a tabuada?");
        int num = input.nextInt();

        int i = 0;
        while(i<=10){
            int resultado = num*i;
            System.out.println(num + " x " + i + " = " + resultado + "\n");
            i++;

        }
    }
}
