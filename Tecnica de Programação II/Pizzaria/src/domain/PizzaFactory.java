package domain;

import java.util.Arrays;


public class PizzaFactory {
    
    public Pizza criarPizza(TipoPizza tipo){
        Pizza pizza = null;
        
        switch (tipo){
            case CALABRESA -> pizza = new Calabresa(50D, 
                    "Calabresa Premium", 
                    Arrays.asList(
                            "\n Molho de tomate", 
                            "\n Calabresa em rodelas", 
                            "\n Cebola", 
                            "\n Azeitona verde",
                            "\n Pimenta calabresa em flocos",
                            "\n Oregano"));
            
            case PORTUGUESA -> pizza = new Portuguesa(55D,
                    "Portuguesa", 
                    Arrays.asList(
                            "\n Molho de tomate", 
                            "\n Queijo mussarela",
                            "\n Presunto",
                            "\n Ovo cozido",
                            "\n Cebola",
                            "\n Azeitona verde",
                            "\n Oragano"));
            
            case QUATRO_QUEIJOS -> pizza = new QuatroQueijo(80D, 
                    "Quatro Queijos Premium", 
                    Arrays.asList(
                            "\n Molho de tomate",
                            "\n Queijo mussarela",
                            "\n Queijo margherita",
                            "\n Queijo gorgonzola",
                            "\n Queijo provolone",
                            "\n Cebola roxa",
                            "\n Catupiry",
                            "\n Azeitona preta",
                            "\n Oregano"));
            
            case CANGACEIRA -> pizza = new Cangaceira(63D, 
                    "Cangaceira", 
                    Arrays.asList(
                            "\n Molho de tomate",
                            "\n Queijo fresco",
                            "\n Carne seca",
                            "\n Cebola",
                            "\n Tomate",
                            "\n Azeitona",
                            "\n Oregano"));
            
            default -> throw new AssertionError();
        }
        
    return pizza;
    }
}
