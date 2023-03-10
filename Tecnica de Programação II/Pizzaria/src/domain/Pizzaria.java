package domain;

public class Pizzaria {
    
    Pizza pizza = null;
    
    public void criarPizza(TipoPizza tipo){
        var factory = new PizzaFactory();
        pizza = factory.criarPizza(tipo);
    }
    
    public void delivery(){
        System.out.println(pizza.getDescricao());
    }
}
