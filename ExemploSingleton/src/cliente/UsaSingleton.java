package cliente;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
/**
 *
 * @author alexsandro.lsipelli
 */
import singleton.Singleton;

public class UsaSingleton extends Thread {

    @Override
    public void run() {
        Singleton s = Singleton.getInstance();
        System.out.println(s);
    }

    /**
     * @param args the command line arguments
     *//*o padrao lazy singleton  nao garate uma intancia apenas*/
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
        
        

        /*   Singleton s1 = Singleton.getInstance();/*todos possui o mesmo endereço de memoria como se fosse 3 nomes para a mesma coisa*/
 /*   Singleton s2 = Singleton.getInstance();/* garantir que tenha apenas uma instancia para a clase, isso é padrao de projeto*/
 /*   Singleton s3 = Singleton.getInstance();/* nomes diferentes para a mesma instancia*/
 /*   System.out.println(s2);
        System.out.println(s3);*/
    }

}
