/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;

/**
 *
 * @author alexsandro.lsipelli
 * PRODUTO CONCRETO
 */
public class Onix implements Carro {

    private double preco;
    private String modelo;

    public Onix(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Onix{" + "preco=" + preco + ", modelo=" + modelo + '}';
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

}
