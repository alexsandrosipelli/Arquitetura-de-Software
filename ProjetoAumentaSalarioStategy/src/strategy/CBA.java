/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package strategy;

import modelo.Carga;

/**
 *
 * @author alexsandro.lsipelli
 */
public class CBA implements CalcularFrete {

    @Override
    public double calcularFrete(Carga carga) {
        if (carga.getPeso() <= 10) {
            return 10.56;
        } else if (carga.getPeso() <= 20) {
            return 12.34;
        } else {

            return 15.09;
        }
    }

}
