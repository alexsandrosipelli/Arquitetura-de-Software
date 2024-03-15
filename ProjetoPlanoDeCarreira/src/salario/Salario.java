/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package salario;

/**
 *
 * @author alexsandro.lsipelli
 */
public class Salario {

    double salario;
    String descriçao;

    public Salario(double salario, String descriçao) {
        this.salario = salario;
        this.descriçao = descriçao;
    }

    public Salario() {
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public String getDescriçao() {
        return descriçao;
    }

    public void setDescriçao(String descriçao) {
        this.descriçao = descriçao;
    }

    @Override
    public String toString() {
        return "Salario{" + "salario=" + salario + ", descri\u00e7ao=" + descriçao + '}';
    }

}
