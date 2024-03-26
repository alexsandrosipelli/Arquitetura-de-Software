/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio1;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexs
 */
public class Pedido {

    private List<ItemPedido> itensPedido;
    private double valorTotal;
    private Estoque estoque;
    /*aqui esta sendo feito a composiçao forte entre itensPedido com a pedido*/
    public Pedido(Estoque estoque) {

        this.itensPedido = new ArrayList<>();
        this.valorTotal = 0;
        this.estoque = estoque;
    }

    /*metodo para antes de adicionar no pedido ver se tem em estoque a quantidade e se nao tiver avisar qual  nao tem e a quantidade disponivel*/
 /*esse metodo esta verificando se a quantidade tem no estoque e se  tiver esta usando o metodo de remover a quantidade do estoque passando o codigo do produto e a quantidade a ser removida*/
    public void adicionarItem(ItemPedido item) {
        Produto produto = item.getProduto();

        // Verifica se o produto está disponível no estoque
        if (verificarProdutoEmEstoque(produto.getCodigo())) {
            int quantidadeDisponivel = verificarQuantidadeEmEstoque(produto.getCodigo());

            if (quantidadeDisponivel >= item.getQuantidade()) {
                if (estoque.removerQuantidade(produto.getCodigo(), item.getQuantidade())) {
                    itensPedido.add(item);
                    System.out.println("Item adicionado ao pedido: " + produto.getCategoria());
                } else {
                    System.out.println("Erro ao adicionar item ao pedido.");
                }
            } else {
                System.out.println("A quantidade do item " + produto.getCategoria() + " é maior do que a quantidade disponível em estoque.");
                System.out.println("Quantidade em estoque: " + quantidadeDisponivel);
            }
        } else {
            System.out.println("O produto " + produto.getCategoria() + " não está disponível no estoque.");
        }
    }

    private boolean verificarProdutoEmEstoque(int codigoProduto) {
        for (Produto produto : estoque.verEstoque()) {
            if (produto.getCodigo() == codigoProduto) {
                return true;
            }
        }
        return false;
    }

    private int verificarQuantidadeEmEstoque(int codigoProduto) {
        for (Produto produto : estoque.verEstoque()) {
            if (produto.getCodigo() == codigoProduto) {
                return produto.getQuantidade();
            }
        }
        return 0; // Retorna 0 se o produto não for encontrado no estoque
    }

    public double calcularTotal() {
        double total = 0;
        for (ItemPedido item : itensPedido) {
            total += item.getQuantidade() * item.getProduto().getPreco();
        }
        this.valorTotal = total;
        return total;
    }

    public void cupomFiscal() {
        System.out.println("Cupom Fiscal:");
        for (ItemPedido item : itensPedido) {
            System.out.println(item.getProduto() + ", quantidade=" + item.getQuantidade());
        }
        System.out.println("Total do pedido: " + valorTotal);
    }
}
