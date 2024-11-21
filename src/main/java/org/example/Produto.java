package org.example;

class Produto {
    private String nome;
    private double altura;
    private double largura;
    private double comprimento;
    private double valor;

    public Produto(String nome, double valor, double altura, double largura, double comprimento) {
        this.nome = nome;
        this.valor = valor;
        this.altura = altura;
        this.largura = largura;
        this.comprimento = comprimento;
    }

    public String getNome() {
        return nome;
    }

    public double getAltura() {return altura;}
    public double getLargura() {return largura;}
    public double getComprimento() {return comprimento;}

    public double getValor() {
        return valor;
    }

    public int getVolume() {
        int myInt = (int) (comprimento * largura * altura);
        return myInt;
    }

    @Override
    public String toString() {
        return "Produto{" +
                "nome='" + nome + '\'' +
                ", altura=" + altura +
                ", largura=" + largura +
                ", comprimento=" + comprimento +
                ", m³=" + getVolume() +
                ", valor=" + valor +
                '}';
    }
}