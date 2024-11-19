package org.example;

class Produto {
    private String nome;
    private int peso;
    private double valor;

    public Produto(String nome, int peso, double valor) {
        this.nome = nome;
        this.peso = peso;
        this.valor = valor;
    }

    public String getNome() {
        return nome;
    }

    public int getPeso() {
        return peso;
    }

    public double getValor() {
        return valor;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", peso=" + peso +
                ", valor=" + valor +
                '}';
    }
}