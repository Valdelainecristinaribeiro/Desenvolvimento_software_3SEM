package domain;

import java.util.List;

public abstract class Pizza {
    
    private double preco;
    private String nome;
    private List<String> ingredientes;

    public Pizza(double preco, String nome, List<String> ingredientes) {
        this.preco = preco;
        this.nome = nome;
        this.ingredientes = ingredientes;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<String> getIngredientes() {
        return ingredientes;
    }

    public void setIngredientes(List<String> ingredientes) {
        this.ingredientes = ingredientes;
    }
       
    public String getDescricao() {
        return this.getClass().getSimpleName() +
                "{" + "\n preco=" + preco + "\n nome=" + nome + "\n ingredientes=" + ingredientes + '}';
    }
    
}
