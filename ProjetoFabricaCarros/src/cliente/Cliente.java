/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import fabrica.*;

/**
 *
 * @author alexsandro.lsipelli
 */
public class Cliente {

    /**
     * @param args the command line arguments
     *
     *
     */
    public static void main(String[] args) {
        Fabrica fabrica;

        Carro carro = null;

        int tipo = 1;

        if (tipo == 1) {

            fabrica = new FabricaVW();

            carro = fabrica.metodoFabrica(ListaCarrosVW.FOX);

        } else if (tipo == 2) {

            fabrica = new FabricaGM();

            carro = fabrica.metodoFabrica(ListaCarrosGM.CORSA);

        }

        System.out.println(carro);
    }

}
