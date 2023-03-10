package domain;

import java.util.Map;

public class Spock extends Algoritmo{
    @Override
    public Map<String, String> executar(Tipo pTipo){
        switch (pTipo){
            case PAPEL -> valor = "Perdeu! Papel refuta spock!";
            case PEDRA -> valor = "Ganhou! Spock vaporiza a pedra!";
            case TESOURA -> valor = "Ganhou! Spock derrete tesoura!";
            case LAGARTO -> valor = "Perdeu! Lagrto envenena spock!";
            case SPOCK -> valor = "Empate! Spock empata com spock!";
            default -> valor = "Opcao invalida!";
        }
        
        resultado.put(KEY, valor);
        return resultado;
        
    }
    
}
