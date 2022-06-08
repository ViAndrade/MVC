package com.example.softwareengineering.models;

public class produtos {

    String produto;
    double preco;
    int quantidadeDisponivel;

    public produtos(String produto, double preco, int quantidadeDisponivel) {
        this.produto = produto;
        this.preco = preco;
        this.quantidadeDisponivel = quantidadeDisponivel;
    }

    public String getProduto() {
        return produto;
    }

    public void setProduto(String produto) {
        this.produto = produto;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public int getQuantidadeDisponivel() {
        return quantidadeDisponivel;
    }

    public void setQuantidadeDisponivel(int quantidadeDisponivel) {
        this.quantidadeDisponivel = quantidadeDisponivel;
    }
}
