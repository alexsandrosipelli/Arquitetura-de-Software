/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplothreads;

/**
 *
 * @author alexsandro.lsipelli
 */
public class NumerosImpares extends Thread/*gerar numeros impares usando  recurso da classe Thread*/{
    /*rercuso especifico Run*/
@Override
    public void run(){
    for (int i = 1; i < 2001; i += 2) {
        System.out.println(i);

    }
}
    
}
