/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4Composite.composicao;

import exercicio4Composite.composicao.Componente;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexs
 */
public class Pedido {

    private String nomeCliente;
    private List<Componente> listaProdutos = new ArrayList<>();
    private int numeroPedido;
    private double totalCompra;

    // Construtor, getters e setters omitidos para brevidade
    public void adicionarProduto(Componente produto) {
        listaProdutos.add(produto);
        totalCompra += produto.getPrecoTotalCompra();
    }

    public void removerProduto(Componente produto) {
        listaProdutos.remove(produto);
        totalCompra -= produto.getPrecoTotalCompra();
    }

    public double getTotalCompra() {
        return totalCompra;
    }

    public void exibirPedido() {
        System.out.println("Número do Pedido: " + numeroPedido);
        System.out.println("Cliente: " + nomeCliente);
        System.out.println("Produtos:");
        for (Componente produto : listaProdutos) {
            System.out.println("- " + produto);
        }
        System.out.println("Total da Compra: R$" + totalCompra);
    }

    public String getNomeCliente() {
        return nomeCliente;
    }

    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public List<Componente> getListaProdutos() {
        return listaProdutos;
    }

    public void setListaProdutos(List<Componente> listaProdutos) {
        this.listaProdutos = listaProdutos;
    }

    public int getNumeroPedido() {
        return numeroPedido;
    }

    public void setNumeroPedido(int numeroPedido) {
        this.numeroPedido = numeroPedido;
    }

    @Override
    public String toString() {
        return "Pedido{" + "nomeCliente=" + nomeCliente + ", listaProdutos=" + listaProdutos + ", numeroPedido=" + numeroPedido + ", totalCompra=" + totalCompra + '}';
    }

}
