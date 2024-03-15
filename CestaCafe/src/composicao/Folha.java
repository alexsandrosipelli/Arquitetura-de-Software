/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao;

/**
 *
 * @author alexsandro.lsipelli
 */
public class Folha implements Componente {

    private String nome;
    private double preco;

    public Folha(String nome, double preco) {
        this.nome = nome;
        this.preco = preco;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String toString() {
        return "Folha{" + "nome=" + nome + ", preco=" + preco + '}';
    }

}
