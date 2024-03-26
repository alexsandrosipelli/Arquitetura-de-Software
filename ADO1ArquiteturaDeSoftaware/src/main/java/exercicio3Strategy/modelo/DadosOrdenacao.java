/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio3Strategy.modelo;

/**
 *
 * @author alexs
 * essa classe é o modelo de dado, em aula o exemplo do professor foi a classe Carga
 * 
 */
/*essa classe tem um vetor da inteiros chamado dados, que sera usado nas outras classes para ser preenchida e ordenarda*/
public class DadosOrdenacao {
    private int[] dados;

    public DadosOrdenacao(int[] dados) {
        this.dados = dados;
    }

    public int[] getDados() {
        return dados;
    }
}