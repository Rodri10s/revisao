package atividades.questao5;

public class MetodoAtividadeCinco {

    int numero;

    public boolean verificarPrimo(int num){
        for (int i = 2; i < num; i++) {
            if (num%i==0) {
                return false;
            }  
        }
        return true;
    }

    public boolean verificarImpar(int num){
        if (num%2==1) {
            return true;
        } else {
            return false;
        }
    }

    public void imprimirResultado(boolean impar, boolean primo){
        if (primo == true) {
            System.out.println("O Número é Primo");
        } else if (impar == true) {
            System.out.println("O Número é Ímpar");
        } else if (impar == false) {
            System.out.println("O Número é Par");
        }
    }
}
