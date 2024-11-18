package org.example;

import java.util.List;

public class SistemaEstoque {
    public static void main(String[] args) {

        Estoque estoque = new Estoque(50);


        estoque.adicionarProduto(new Produto("Produto A", 10, 60));
        estoque.adicionarProduto(new Produto("Produto B", 20, 100));
        estoque.adicionarProduto(new Produto("Produto C", 30, 120));
        estoque.adicionarProduto(new Produto("Produto D", 40, 150));
        estoque.adicionarProduto(new Produto("Produto E", 50, 200));
        estoque.adicionarProduto(new Produto("Produto F", 50, 250));
        estoque.adicionarProduto(new Produto("Produto G", 35, 300));

        System.out.println("Produtos cadastrados:");
        estoque.exibirProdutos();


        List<Produto> produtosOtimizado = Otimizador.otimizarEstoque(estoque.getProdutos(), estoque.getCapacidadeMaxima());

        System.out.println("\nProdutos selecionados para otimização:");
        for (Produto produto : produtosOtimizado) {
            System.out.println(produto);
        }
    }
}