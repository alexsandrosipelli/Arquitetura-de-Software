/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package produto;

/**
 *
 * @author alexsandro.lsipelli
 */
public class Produto {

    double valorProduto;
    String descricao;
    // TODO code application logic here

    public Produto(double valorProduto, String descricao) {
        this.valorProduto = valorProduto;
        this.descricao = descricao;
    }

    public Produto() {
    }

    @Override
    public String toString() {
        return "Produto{" + "valorProduto=" + valorProduto + ", descricao=" + descricao + '}';
    }

    public double getValorProduto() {
        return valorProduto;
    }

    public void setValorProduto(double valorProduto) {
        this.valorProduto = valorProduto;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

}
