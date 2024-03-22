/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package composicao;

/**
 *
 * @author alexsandro.lsipelli
 */
class Departamento implements DepartamentoComponent {

    private String nome;
    private double custo;
    private int funcionarios;

    public Departamento(String nome, double custo, int funcionarios) {
        this.nome = nome;
        this.custo = custo;
        this.funcionarios = funcionarios;
    }

    @Override
    public double getCusto() {
        return custo;
    }

    @Override
    public int getFuncionario() {

        return funcionarios;
    }

}
