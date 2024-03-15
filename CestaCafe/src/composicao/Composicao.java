/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author alexsandro.lsipelli
 *
 * composição --> container
 */
public class Composicao implements Componente {

    private List<Componente> listaProdutos;
    private String nome;

    public Composicao() {
    }

    public Composicao(String nome) {
        listaProdutos = new ArrayList<>();
        this.nome = nome;

    }

    public void adicionar(Componente componente) {
        listaProdutos.add(componente);

    }

    public void remover(Componente componente) {
        listaProdutos.remove(componente);

    }

    @Override
    public double getPreco() {
        double total = 0;
        for (Componente c : listaProdutos) {
            total += c.getPreco();
        }
        return total;
    }

    @Override
    public String toString() {
        return "Composicao{" + "listaProdutos=" + listaProdutos + ", nome=" + nome + '}';
    }

}
