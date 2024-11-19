package org.example;

import java.util.ArrayList;
import java.util.List;

class Estoque {
    private int capacidadeMaxima;
    private List<Produto> produtos;

    public Estoque(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
        this.produtos = new ArrayList<>();
    }

    public int getCapacidadeMaxima() {
        return capacidadeMaxima;
    }

    public void setCapacidadeMaxima(int capacidadeMaxima) {
        this.capacidadeMaxima = capacidadeMaxima;
    }

    public List<Produto> getProdutos() {
        return produtos;
    }

    public void adicionarProduto(Produto produto) {
        produtos.add(produto);
    }

    public void limparLista() {
        produtos.clear();
    }

    public void exibirProdutos() {
        if(produtos.isEmpty()) {
            System.out.println("não há produtos na lista :P");
        }
        for (Produto produto : produtos) {
            System.out.println(produto);
        }
    }
}