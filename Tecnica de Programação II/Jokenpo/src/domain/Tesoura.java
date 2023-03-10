package domain;

import java.util.Map;

public class Tesoura extends Algoritmo{
    
    @Override
    public Map<String, String> executar(Tipo pTipo){
        switch (pTipo){
            case PAPEL -> valor = "Ganhou! Tesoura corta papel!";
            case TESOURA -> valor = "Empate! Tesoura empata com tesoura!";
            case PEDRA -> valor = "Perdeu! Pedra quebra tesoura!";
            case LAGARTO -> valor = "Ganhou! Tesoura decapta o lagarto!";
            case SPOCK -> valor = "Perdeu! Spock derrete a tesoura!";
            default -> valor = "Opcao invalida!";
        }
        
        resultado.put(KEY, valor);
        return resultado;
    }
    
}
