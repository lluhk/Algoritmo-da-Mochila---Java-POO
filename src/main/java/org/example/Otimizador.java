package org.example;

import java.util.ArrayList;
import java.util.List;

class Otimizador {
    public static List<Produto> otimizarEstoque(List<Produto> produtos, int capacidadeMaxima) {
        int n = produtos.size();
        int[][] dp = new int[n + 1][capacidadeMaxima + 1];


        for (int i = 1; i <= n; i++) {
            Produto produto = produtos.get(i - 1);
            for (int w = 1; w <= capacidadeMaxima; w++) {
                if (produto.getPeso() <= w) {
                    dp[i][w] = Math.max(produto.getValor() + dp[i - 1][w - produto.getPeso()], dp[i - 1][w]);
                } else {
                    dp[i][w] = dp[i - 1][w];
                }
            }
        }


        List<Produto> selecionados = new ArrayList<>();
        int w = capacidadeMaxima;
        for (int i = n; i > 0 && w > 0; i--) {
            if (dp[i][w] != dp[i - 1][w]) {
                Produto produto = produtos.get(i - 1);
                selecionados.add(produto);
                w -= produto.getPeso();
            }
        }

        return selecionados;
    }
}