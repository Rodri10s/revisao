package atividades.questao4;

public class MetodoAtividadeQuatro {

    public void somaImpares() {

        int soma = 0;

        for (int i = 0; i <= 30; i++) {
            if (!(i % 2 == 0)) {
                soma = soma + i;
            }
        }

        System.out.println("Soma dos números impares: " + soma);
    }

    public void multiplicacaoPares() {

        long multiplicacao = 0;

        for (int i = 0; i <= 30; i++) {

            if (i % 2 == 0) {
                if (multiplicacao == 0) {
                    multiplicacao = i;
                } else {
                    multiplicacao = multiplicacao * i;
                }
            }

        }

        System.out.println("Multiplicação dos números pares: " + multiplicacao);
    }
}
