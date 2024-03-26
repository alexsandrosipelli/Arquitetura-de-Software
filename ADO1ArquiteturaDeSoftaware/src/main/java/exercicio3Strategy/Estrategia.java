/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package exercicio3Strategy;

/**
 *
 * @author alexs Esta interface define o contrato para os métodos de ordenação
 * que todas as estratégias devem implementar.
 * comparada com o exemplo do professor essa seria a Interface CalcularFrete
 */
public interface Estrategia {

    void ordenar(int[] v);

}
