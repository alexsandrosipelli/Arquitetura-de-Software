/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

/**
 *
 * @author alexs
 */
public class Produto {

    private int codigo;
    private double preco;
    private String categoria;
    private int quantidade;

    public Produto(int codigo, double preco, String categoria, int quantidade) {
        this.codigo = codigo;
        this.preco = preco;
        this.categoria = categoria;
        this.quantidade = quantidade;
    }

    public Produto(int codigo, double preco, String categoria) {
        this.codigo = codigo;
        this.preco = preco;
        this.categoria = categoria;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    @Override
    public String toString() {
        return "Produto{" + "codigo=" + codigo + ", preco=" + preco + ", categoria=" + categoria + ", quantidade=" + quantidade + '}';
    }
 
}
