package atividades.questao8;

public class MetodoAtividadeOito {

    public void verificadorDeLucro(double valor, double venda) {

        if (venda >= (valor + valor / 2)) {
            System.out.println("Lucro!");
        } else {
            System.out.println("Prejuízo!");
        }
    }
}
