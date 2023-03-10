package domain;

import java.util.Scanner;


public class Main {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        var pizzaria = new Pizzaria();
        
        System.out.println("Menu Pizzas");
        System.out.println("Escolha uma das opções \n 1-Calabresa \n 2-Cangaceira \n 3-Poruguesa \n 4-Quatro queijos");
        int pizza = in.nextInt();
               
        switch (pizza){
            case 1 -> {
                pizzaria.criarPizza(TipoPizza.CALABRESA);
                pizzaria.delivery();
            }
            
            case 2 -> {
                pizzaria.criarPizza(TipoPizza.CANGACEIRA);
                pizzaria.delivery();
            }
            
            case 3 -> {
                pizzaria.criarPizza(TipoPizza.PORTUGUESA);
                pizzaria.delivery();
            }
            
            case 4 -> {
                pizzaria.criarPizza(TipoPizza.QUATRO_QUEIJOS);
                pizzaria.delivery();
            }
            
            default -> {
                throw new AssertionError();
            }
}
        
        
        
        
    }
    
}
