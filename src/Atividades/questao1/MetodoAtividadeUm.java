package atividades.questao1;

public class MetodoAtividadeUm {
    int i;

    public void geradorDeTabuada(int numero){
        this.i = 0;
        while(i<=10){
            int resultado = numero*i;
            System.out.println(numero + " x " + i + " = " + resultado + "\n");
            i++;
    }
}
}
