package Atividades;

public class atividadeQuatro {
    public static void main(String[] args) {
        int soma = 0;
        long multiplicacao = 0;

        for (int i = 0; i <= 30; i++) {
            if (!(i % 2 == 0)) {
                soma = soma + i;
            } else if (multiplicacao == 0) {
                multiplicacao = i;
            } else {
                multiplicacao = multiplicacao * i;
            }
        }
        System.out.println("Soma dos números impares: " + soma);
        System.out.println("Multiplicação dos números pares: " + multiplicacao);

    }

}
