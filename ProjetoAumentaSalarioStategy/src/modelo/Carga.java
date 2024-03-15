/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modelo;

/**
 *
 * @author alexsandro.lsipelli
 *
 * Vai ser o tipo abstrato de dados
 *
 */
public class Carga {//TAD tipo abstrato de dado

    private double peso;
    private String descricao;

    public Carga() {
    }

    public Carga(double peso, String descricao) {
        this.peso = peso;
        this.descricao = descricao;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }
 
    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    @Override
    public String toString() {
        return "Carga{" + "peso=" + peso + ", descricao=" + descricao + '}';
    }

}
