/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;

/**
 *
 * @author alexsandro.lsipelli
 */
public class Corsa implements Carro {

    private double preco;
    private String modelo;

    public Corsa(double preco, String modelo) {
        this.preco = preco;
        this.modelo = modelo;
    }

    @Override
    public double getPreco() {
        return preco;
    }

    @Override
    public String getModelo() {
        return modelo;
    }

    @Override
    public String toString() {
        return "Corsa{" + "preco=" + preco + ", modelo=" + modelo + '}';
    }

}
