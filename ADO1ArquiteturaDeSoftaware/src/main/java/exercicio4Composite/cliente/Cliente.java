package exercicio4Composite.cliente;

import exercicio4Composite.composicao.Pedido;
import exercicio4Composite.composicao.CaixaProdutos;
import exercicio4Composite.composicao.Produto;

public class Cliente {

    public static void main(String[] args) {
        /*criando produtos (folhas Simples)para amazenar na caixa e depois colocar em outra caixa*/
        Produto p8 = new Produto("Vinho Seco", 11.25);
        Produto p9 = new Produto("Vinho Suave", 15.28);
        /*criando produtos(folhas Simples) aqui esta sendo frutas*/
        Produto p1 = new Produto("Maça", 1.25);
        Produto p2 = new Produto("Pera", 5.28);

        /*criando produtos(folhas Simples) aqui esta sendo limpeza*/
        Produto p3 = new Produto("Amaciante", 20.0);
        Produto p4 = new Produto("Detergente", 10.0);

        /*criando produtos(folhas Simples) aqui matimentos*/
        Produto p5 = new Produto("Carne", 50.0);
        Produto p6 = new Produto("Feijao", 35.0);
        /*aqui vai ser apenas um produto aparte que nao vai ser colocando em uma caixa apenas adicionando no pedidto*/
        Produto p7 = new Produto("bala", 0.25);

        /*auqi  estou criando as caixas da classe Caixaprodutos, com ela eu posso adicionar tanto caixas quanto folhas*/
        CaixaProdutos caixaFrutas = new CaixaProdutos();
        caixaFrutas.adicionarProduto(p1);
        caixaFrutas.adicionarProduto(p2);

        /*auqi  estou criando as caixas da classe Caixaprodutos, com ela eu posso adicionar tanto caixas quanto folhas*/
        CaixaProdutos caixaLimpeza = new CaixaProdutos();
        caixaLimpeza.adicionarProduto(p3);
        caixaLimpeza.adicionarProduto(p4);

        /*auqi  estou criando as caixas da classe Caixaprodutos, com ela eu posso adicionar tanto caixas quanto folhas*/
        CaixaProdutos caixaMantimento = new CaixaProdutos();
        caixaMantimento.adicionarProduto(p5);
        caixaMantimento.adicionarProduto(p6);

        /*auqi  estou criando as caixas da classe Caixaprodutos, com ela eu posso adicionar tanto caixas quanto folhas*/
        CaixaProdutos caixaVinhos = new CaixaProdutos();
        caixaVinhos.adicionarProduto(p8);
        caixaVinhos.adicionarProduto(p9);

        /*aqui na caixa de mantimentos vou adicionar a caixa de vinhos.E quando o pedido adicionar a caixa de mantimentos tbm estará adicinando a caixa de vinhos que dentro dela contem os produtos */
        caixaMantimento.adicionarProduto(caixaVinhos);

        /*aqui estou criando o pedido que pode conter caixa com caixa dentro, ou apenas caixa e tbm apenas produto*/
        Pedido pedido = new Pedido();
        pedido.setNumeroPedido(1);
        pedido.setNomeCliente("Cliente ALEX");
        /*aqui adicionando as caixas*/
        pedido.adicionarProduto(caixaFrutas);
        pedido.adicionarProduto(caixaLimpeza);

        /*aqui adcionando uma caixa que tem outra caixa dentro*/
        pedido.adicionarProduto(caixaMantimento);

        /*aqui adicionando o produto isolado, que nao esta em nhm caixa*/
        pedido.adicionarProduto(p7);

        pedido.exibirPedido();
    }
}
