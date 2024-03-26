/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4Composite.composicao;

/**
 *
 * @author alexs
 * Folha (Leaf)
Representa os elementos individuais da hierarquia.
Implementa o comportamento específico para os elementos individuais.
 */
/*esse é a folha Representa um produto individual no carrinho (Produto).*/
public class Produto implements Componente {

    private String nome;
    private double preco;

    public Produto(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPrecoTotalCompra() {
        return preco;
    }

    @Override
    public String toString() {
        return nome + " (R$" + preco + ")";
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

}
