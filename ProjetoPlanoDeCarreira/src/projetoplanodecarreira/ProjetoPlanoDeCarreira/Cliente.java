/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package projetoplanodecarreira.ProjetoPlanoDeCarreira;

import salario.Salario;
import strategy.CalcularBonus;
import strategy.Departamentos;

/**
 *
 * @author alexsandro.lsipelli
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
          try {
            Salario salario = new Salario(1000, "Livro de design pattern");
            int opc =0;
            double salarioAtual = Departamentos.values()[opc].calcularSalario(salario);
            System.out.println("O frete sera " + salarioAtual);
        } catch (Exception e) {

            System.out.println(" ERRO" + e.getMessage());

        }
    }
    
}
