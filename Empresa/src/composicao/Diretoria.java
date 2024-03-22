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
 */
public class Diretoria implements DepartamentoComponent {

    private List<DepartamentoComponent> departamentos;
    //departamentos = new ArrayList<>();

    public Diretoria() {
        departamentos = new ArrayList<>();
    }

    public void addDepartamento(DepartamentoComponent departamento) {
        departamentos.add(departamento);
    }

    public void removeDepartamento(DepartamentoComponent departamento) {
        departamentos.remove(departamento);
    }

    @Override
    public double getCusto() {
        double totalCusto = 0;
        for (DepartamentoComponent departamento : departamentos) {
            totalCusto += departamento.getCusto();
        }
        return totalCusto;
    }

    @Override
    public int getFuncionario() {
        int totalFuncionarios = 0;
        for (DepartamentoComponent departamento : departamentos) {
            totalFuncionarios += departamento.getFuncionario();
        }
        return totalFuncionarios;
    }

}
