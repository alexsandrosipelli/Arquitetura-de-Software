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
public class ABC implements CalcularFrete {

    @Override
    public double calcularFrete(Carga carga) {
        if (carga.getPeso() <= 10) {
            return 12.56;
        } else if (carga.getPeso() <= 20) {
            return 14.78;
        } else {
            return 17.64;
        }
    }

}
