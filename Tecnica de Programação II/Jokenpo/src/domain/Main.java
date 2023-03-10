package domain;


import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        var jokenpo = new Jokenpo();
               
        System.out.println("Escolha uma das opcoes \n 1-PAPEL \n 2-TESOURA \n 3-PEDRA \n 4-LAGARTO \n 5-SPOCK \n");
        int jogada = in.nextInt();
        int computador = new Random().nextInt(5) + 1;
        System.out.println("O COMPUTADOR escolheu: " + Tipo.getInstance(computador));

        
        var algoritmo = getAlgoritmo(jogada);

        jokenpo.setAlgoritmo(algoritmo);
        Tipo tipoJogadaComputador = Tipo.getInstance(computador);

        jokenpo.jogar(tipoJogadaComputador);
        
        in.close();
        
    }
    private static Algoritmo getAlgoritmo(Integer pId) {
        Algoritmo algoritmo = null;
        switch (pId) {
            case 1 -> algoritmo = new Papel();
            case 2 -> algoritmo = new Tesoura();
            case 3 -> algoritmo = new Pedra();
            case 4 -> algoritmo = new Lagarto();
            case 5 -> algoritmo = new Spock();
            default -> throw new IllegalStateException("Unexpected value: " + pId);
        }
        
    return algoritmo;
    }
}