package atividades.questao3;

public class MetodoAtividadeTres {
    private int resultado;
    private int anterior;

    public void resultado() {

        this.resultado = 0;
        this.anterior = 1;

        while (resultado <= 100) {
            System.out.println(resultado);
            resultado = resultado + anterior;
            anterior = resultado - anterior;
        }
    }

}
