/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2Singleton.cliente;

/**
 *
 * @author alexs
 *
 */
import exercicio2Singleton.Singleton;
import exercicio2Singleton.Singleton;

public class UsaSingleton extends Thread {

    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
    }

    public static void main(String[] args) {
        /*primeiro passso para criar uma threar criar a instancia */
        UsaSingleton t1 = new UsaSingleton();
        UsaSingleton t2 = new UsaSingleton();
        UsaSingleton t3 = new UsaSingleton();
        UsaSingleton t4 = new UsaSingleton();
        t1.start();/*eles vao ser executado os 4 ao mesmo tempo*/
        t2.start();
        t3.start();
        t4.start();

    }

}
