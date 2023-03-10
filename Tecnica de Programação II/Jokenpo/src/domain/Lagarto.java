package domain;

import java.util.Map;

public class Lagarto extends Algoritmo{
    
    @Override
    public Map<String, String> executar(Tipo pTipo){
        switch (pTipo){
            case PAPEL -> valor = "Ganhou! Lagarto come papel!";
            case PEDRA -> valor = "Perdeu! Pedra esmaga lagarto!";
            case TESOURA -> valor = "Perdeu! Tesoura decapta o lagarto!";
            case LAGARTO -> valor = "Empate! Lagarto empata com lagarto!";
            case SPOCK -> valor = "Ganhou! Lagarto envenena o spock!";
            default -> valor = "Opcao invalida!";
        }
        
        resultado.put(KEY, valor);
        return resultado;
        
    }
}
