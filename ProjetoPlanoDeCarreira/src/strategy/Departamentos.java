/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package strategy;

import salario.Salario;

/**
 *
 * @author alexsandro.lsipelli
 */
public enum Departamentos implements CalcularBonus {
    DESENVOLVIMENTO {
        @Override
        public double calcularSalario(Salario salario) {
            double salarioNovo = (salario.getSalario()*0.05)+salario.getSalario();
           
            return salarioNovo;
        }

    },
    SUPORTE {
        @Override
        public double calcularSalario(Salario salario) {
            double salarioNovo = salario.getSalario() * 0.04+salario.getSalario();
            return salarioNovo;
        }
    },
    DEMAISDEPARTMENTOS {
        @Override
        public double calcularSalario(Salario salario) {
            double salarioNovo = salario.getSalario() * 0.03 + salario.getSalario() ;
            return salarioNovo;

        }

    };

}
