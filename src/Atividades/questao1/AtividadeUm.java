package atividades.questao1;

import java.util.Scanner;

public class AtividadeUm {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("De qual numero deseja ver a tabuada?");
        int num = input.nextInt();

        MetodoAtividadeUm metodo = new MetodoAtividadeUm();

        metodo.geradorDeTabuada(num);

        }
    }
