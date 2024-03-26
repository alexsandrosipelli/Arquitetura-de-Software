/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio4Composite.composicao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexs Composite Representa as composições de objetos, ou seja,
 * elementos que possuem outros elementos (folhas e/ou outros composites) como
 * filhos. Implementa operações para adicionar, remover e acessar filhos. essa
 * classe serve para adcionar novas folhas (produto) e tbm adicionar novas
 * compossiçoes (caixaProdutos)
 */
/*Representa uma coleção de produtos no carrinho (CaixaProdutos) seja esses produtos folhas ou caixas .*/
public class CaixaProdutos implements Componente {

    private List<Componente> itens = new ArrayList<>();

    public void adicionarProduto(Componente item) {
        itens.add(item);
    }

    public void removerProduto(Componente item) {
        itens.remove(item);
    }

    @Override
    public double getPrecoTotalCompra() {
        double precoTotal = 0;
        for (Componente item : itens) {
            precoTotal += item.getPrecoTotalCompra();
        }
        return precoTotal;
    }

    @Override
    public String toString() {
        return "CaixaProdutos{" + "itens=" + itens + '}';
    }

}
