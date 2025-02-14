package br.com.lojinha.pojo;

public class Produto {
    // Aula atributos
    //public String nome;
    //public String marca;
    //public double valor;
    //public String tamanho;
    //public String itensInclusos;

    // Aula Encapsulamento
    private String nome;
    private String marca;
    private double valor;
    private String tamanho;
    private String itensInclusos;

    public String getNome() {
        return this.nome;
    }

    public void setNome(String novoNome) {
        this.nome = novoNome;
    }

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String novaMarca) {
        this.marca = novaMarca;
    }

    public double getValor() {
        return this.valor;
    }

    public void setValor(double novoValor) {
        this.valor = novoValor;
    }

    public String getTamanho() {
        return this.tamanho;
    }

    public void setTamanho(String novoTamanho) {
        this.tamanho = novoTamanho;
    }

    public String getItensInclusos() {
        return this.itensInclusos;
    }

    public void setItensInclusos(String novoItensInclusos) {
        this.itensInclusos = novoItensInclusos;
    }
}
