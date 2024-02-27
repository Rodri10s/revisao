package atividades;

public class AtividadeTres {
    public static void main(String[] args) {

        int resultado = 0;
        int anterior = 1;

        while (resultado <= 100) {
            System.out.println(resultado);
            resultado = resultado + anterior;
            anterior = resultado - anterior;

        }

    }
}
