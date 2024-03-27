/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package exercicio1;

/**
 *
 * @author alexs
 */
public class RealizarPedido {

    public static void main(String[] args) {

        Estoque estoque = new EstoqueProduto();

        estoque.carregarProdutos();
        System.out.println(estoque.verEstoque());

        /*realizando um pedido*/
    /*produto com codigo 1, preço 23.0 e categora Limpeza*/
        Produto produto1 = new Produto(1, 23.0, "Limpeza");
        Produto produto2 = new Produto(2, 1543.0, "Eletrônico");
        Produto produto3 = new Produto(3, 50.30, "Bebidas Refrescante");
        Produto produto4 = new Produto(4, 25.23, "Legumes Frescos");
        Produto produto5 = new Produto(5, 45.13, "Frutas Frescas");
        Produto produto6 = new Produto(6, 20.43, "Copos");
        /*adicionando um produto que nao tem em estoque para que seja possivel apresentar o erro de adicionar produto que nao tem em estoque*/
        Produto produtoInvalido = new Produto(7, 15.21, "PNEU");

        ItemPedido item1 = new ItemPedido(1, produto1);
        ItemPedido item2 = new ItemPedido(1, produto2);
        ItemPedido item3 = new ItemPedido(1, produto3);
        ItemPedido item4 = new ItemPedido(1, produto4);
        /*aqui adicionando um intem que tem a quantidade maior do que no estoque para testar se vai negar a venda dessa quantidade*/
        ItemPedido item5 = new ItemPedido(6, produto5);

        ItemPedido item6 = new ItemPedido(1, produto6);
        /*colocando o produto invalido no item para adicionar o intem invalido e apresentar o erro de produto nao existe no estoque*/
        ItemPedido item7 = new ItemPedido(1, produtoInvalido);

        /*criando o pedido passando a quantidade e qual o produto no caso o produto é um desses acima */
        Pedido pedido = new Pedido(estoque);
        /*adicionando ao pedido os itens*/
        pedido.adicionarItem(item1);
        pedido.adicionarItem(item2);
        pedido.adicionarItem(item3);
        pedido.adicionarItem(item4);
        pedido.adicionarItem(item5);
        pedido.adicionarItem(item6);
        /*adicionando o item invalido no pedido..*/
        pedido.adicionarItem(item7);

        /*calculando o total com o metodo do pedido*/
        pedido.calcularTotal();
        /*chamando o metodo de cupom fiscal onde vai imprimir os dados do pedido*/
        pedido.cupomFiscal();
        /*vendo o estoque apos o pedido e notando que esta sendo decrementado do estoque a quantidade solicitada*/
        System.out.println(estoque.verEstoque());

        /*aqui vamos remover um produto do estoque, vamos remover o produto com o id 3 que seria a bebidas frescas logo em seguida imprimir novamante o estoque e ver se foi removido mesmo */
        int codigoProdutoARemover = 3;
        boolean removido = estoque.remover(codigoProdutoARemover);
        if (removido) {
            System.out.println("Produto removido do estoque.");
        } else {
            System.out.println("Produto não encontrado no estoque.");
        }
        /*notando a remoçao do produto com o id 3 do estoque*/
        System.out.println(estoque.verEstoque());

    }
}
