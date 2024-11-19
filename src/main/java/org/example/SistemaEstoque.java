package org.example;

import java.util.List;
import java.util.Scanner;

public class SistemaEstoque {

    static Estoque estoque = new Estoque(0);

    static Scanner sc = new Scanner(System.in);

    public static void alterarTamanhoEstoque() {
        System.out.println("\nDigite a capacidade máxima do estoque:");
        int capacidade = sc.nextInt();

        estoque.setCapacidadeMaxima(capacidade);

        sc.nextLine();
    }

    public static void exibirEstoque() {
        System.out.println("\nTamanho do Estoque: " + estoque.getCapacidadeMaxima() + "\n");
        System.out.println("Produtos cadastrados:");
        estoque.exibirProdutos();
    }

    public static void limparEstoque() {
        estoque.limparLista();
        System.out.println("\nEstoque limpado com sucesso :D");
    }

    public static void adicionarProduto() {
        System.out.println("\nDigite o nome do produto: ");
        String produtoNome = sc.nextLine();

        System.out.println("\nDigite o peso do produto: ");
        int produtoPeso = sc.nextInt();

        System.out.println("\nDigite o valor do produto: ");
        double produtoValor = sc.nextDouble();

        sc.nextLine();

        estoque.adicionarProduto(new Produto(produtoNome, produtoPeso, produtoValor));
    }

    public static void otimizarEstoque() {
        List<Produto> produtosOtimizado = Otimizador.otimizarEstoque(estoque.getProdutos(), estoque.getCapacidadeMaxima());

        System.out.println("\nProdutos selecionados para otimização:");
        for (Produto produto : produtosOtimizado) {
            System.out.println(produto);
        }
    }

    public static void menu() {
        int opssao = -1;
        do {
            System.out.println("\n### MENU ###");
            System.out.println("1. Adicionar produtos");
            System.out.println("2. Exibir estoque");
            System.out.println("3. Alterar tamanho do estoque");
            System.out.println("4. Limpar estoque");
            System.out.println("5. Gerar otimização do estoque");
            System.out.println("0. Sair");
            System.out.println("Escolha uma opção: ");
            opssao = sc.nextInt();
            sc.nextLine();
            switch (opssao) {
                case 1: adicionarProduto(); break;
                case 2: exibirEstoque(); break;
                case 3: alterarTamanhoEstoque(); break;
                case 4: limparEstoque(); break;
                case 5: otimizarEstoque(); break;
                case 0: System.out.println("Saindo :C"); break;
                default: System.out.println("Opção invalida >:C\n");
            }
        } while(opssao != 0);
    }

    public static void main(String[] args) {
        alterarTamanhoEstoque();
        menu();
    }
}