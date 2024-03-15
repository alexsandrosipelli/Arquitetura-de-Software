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
public class XPTO implements CalcularFrete {

    @Override
    public double calcularFrete(Carga carga) {
        if (carga.getPeso() <= 10) {
            return 14.77;
        } else if (carga.getPeso() <= 20) {

            return 16.82;
        } else {

            return 18.13;
        }
    }

}
