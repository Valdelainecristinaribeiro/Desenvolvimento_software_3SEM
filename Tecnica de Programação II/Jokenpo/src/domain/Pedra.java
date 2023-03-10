package domain;

import java.util.Map;


public class Pedra extends Algoritmo{
    
    @Override
    public Map<String, String> executar(Tipo pTipo){
        switch (pTipo){
            case PAPEL -> valor = "Perdeu! Papel embrulha pedra!";
            case PEDRA -> valor = "Empate! Pedra empata com pedra!";
            case TESOURA -> valor = "Ganhou! Pedra esmaga tesoura!";
            case LAGARTO -> valor = "Ganhou! Pedra esmaga lagarto!";
            case SPOCK -> valor = "Perdeu! Spock vaporiza a pedra!";
            default -> valor = "Opcao invalida!";
        }
        
        resultado.put(KEY, valor);
        return resultado;
    }
}
