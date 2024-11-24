package org.example;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class TesteEstoque {

    public static void main(String[] args) {

        int capacidadeMaximaEstoque = 200;
        int numeroDeProdutos = 20;

        List<Produto> produtosAleatorios = gerarProdutosAleatorios(numeroDeProdutos);

        System.out.println("Produtos gerados:");
        produtosAleatorios.forEach(System.out::println);

        List<Produto> produtosSelecionados = Otimizador.otimizarEstoque(produtosAleatorios, capacidadeMaximaEstoque);

        System.out.println("\nProdutos selecionados para otimização:");
        produtosSelecionados.forEach(System.out::println);

        int volumeTotal = produtosSelecionados.stream().mapToInt(Produto::getVolume).sum();
        double valorTotal = produtosSelecionados.stream().mapToDouble(Produto::getValor).sum();

        System.out.printf("\nEspaço total ocupado pelos produtos selecionados: %d m³\n", volumeTotal);
        System.out.printf("Valor total dos produtos selecionados: R$ %.2f\n", valorTotal);
    }

    private static List<Produto> gerarProdutosAleatorios(int quantidade) {
        List<Produto> produtos = new ArrayList<>();
        Random random = new Random();

        for (int i = 0; i < quantidade; i++) {
            String nome = "Produto_" + (i + 1);
            double altura = 2.0 + (5.0 - 2.0) * random.nextDouble();
            double largura = 2.0 + (5.0 - 2.0) * random.nextDouble();
            double comprimento = 2.0 + (5.0 - 2.0) * random.nextDouble();
            double valor = 100.0 + (1000.0 - 100.0) * random.nextDouble();
            produtos.add(new Produto(nome, valor, altura, largura, comprimento));
        }

        return produtos;
    }
}
