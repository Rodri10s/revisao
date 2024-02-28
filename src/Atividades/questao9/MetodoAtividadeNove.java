package atividades.questao9;

public class MetodoAtividadeNove {
    
    public void verificadorDeMes(int num){

        switch (num) {
            case 1:
                System.out.println("Número "+num+" corresponde ao mês de Janeiro!");
                break;
                case 2:
                System.out.println("Número "+num+" corresponde ao mês de Fevereiro!");
                break;
                case 3:
                System.out.println("Número "+num+" corresponde ao mês de Março!");
                break;
                case 4:
                System.out.println("Número "+num+" corresponde ao mês de Abril!");
                break;
                case 5:
                System.out.println("Número "+num+" corresponde ao mês de Maio!");
                break;
                case 6:
                System.out.println("Número "+num+" corresponde ao mês de Junho!");
                break;
                case 7:
                System.out.println("Número "+num+" corresponde ao mês de Julho!");
                break;
                case 8:
                System.out.println("Número "+num+" corresponde ao mês de Agosto!");
                break;
                case 9:
                System.out.println("Número "+num+" corresponde ao mês de Setembro!");
                break;
                case 10:
                System.out.println("Número "+num+" corresponde ao mês de Outubro!");
                break;
                case 11:
                System.out.println("Número "+num+" corresponde ao mês de Novembro!");
                break;
                case 12:
                System.out.println("Número "+num+" corresponde ao mês de Dezembro!");
                break;
            default: System.out.println("Digite um número entre 1 e 12");
                break;
        }
    }
}
