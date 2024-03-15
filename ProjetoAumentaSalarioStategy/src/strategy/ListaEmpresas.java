/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package strategy;

import modelo.Carga;

/**
 *
 * @author alexsandro.lsipelli 
 * ENUNM É O PADRAO STRATEGY DO JAVA
 * SERVE PARA : CLASSES INTERNAS LISTA DE CONSTATES
 *
 */
public enum ListaEmpresas implements CalcularFrete {

    ABC {
        @Override
        public double calcularFrete(Carga carga) {
            if (carga.getPeso()
                    <= 10) {
                return 12.56;
            } else if (carga.getPeso()
                    <= 20) {
                return 14.78;
            } else {
                return 17.64;
            }

        }
    },
    CBA {
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
    },
    XPTO {
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

    };
}
