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
public class EstoqueProduto implements Estoque {

    private List<Produto> produtos;

    public EstoqueProduto() {
        this.produtos = new ArrayList<>();
    }

    /*aqui criando os produtos do estoque, passando o codigo,valor, categoria e quantidade. Para que fique esses produtos no estoque*/
    @Override
    public void carregarProdutos() {
        produtos.add(new Produto(1, 23.0, "Limpeza", 5));
        produtos.add(new Produto(2, 1543.0, "Eletrônico", 5));
        produtos.add(new Produto(3, 50.30, "Bebidas Refrescante", 5));
        produtos.add(new Produto(4, 25.23, "Legumes Frescos", 5));
        produtos.add(new Produto(5, 45.13, "Frutas Frescas", 5));
        produtos.add(new Produto(6, 20.43, "Copos", 5));

    }

    @Override
    public boolean remover(int id) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == id) {
                produtos.remove(produto);
                return true;
            }
        }
        return false;
    }

    @Override
    public List<Produto> verEstoque() {
        return produtos;
    }

    @Override
    public boolean removerQuantidade(int id, int quantidade) {
        for (Produto produto : produtos) {
            if (produto.getCodigo() == id && produto.getQuantidade() >= quantidade) {
                produto.setQuantidade(produto.getQuantidade() - quantidade);
                return true;
            }
        }
        return false;
    }
}
