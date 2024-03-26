/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exercicio4Composite.composicao;

/**
 *
 * @author alexs Esta é a interface que será implementada tanto pelas classes de
 * folha (Produto) quanto pelas classes compostas (CaixaProdutos). Ela define o
 * método getPrecoTotal() para obter o preço total da compra.
 * 
 *Componente
Define a interface comum para todos os elementos da hierarquia (folhas e composites).
Pode ser uma classe abstrata ou uma interface que declara operações comuns a todas as partes da hierarquia.
 */
public interface Componente {

    public double getPrecoTotalCompra();

}
