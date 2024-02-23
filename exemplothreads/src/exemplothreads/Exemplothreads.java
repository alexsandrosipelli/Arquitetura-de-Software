/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package exemplothreads;

/**
 *
 * @author alexsandro.lsipelli
 */
public class Exemplothreads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        NumerosImpares numImpar = new NumerosImpares();
        NumerosPares numPar = new NumerosPares();
        MultiplosCinco numMult = new MultiplosCinco();
        numImpar.start();
        numPar.start();
        numMult.start();

    }

}
