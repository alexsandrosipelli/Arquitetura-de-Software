/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exercicio1;
import java.util.List;

/**
 *
 * @author alexs
 */
public interface Estoque {

    public void carregarProdutos();

    public boolean remover(int id);

    public List<Produto> verEstoque();

    boolean removerQuantidade(int id, int quantidade);
}
