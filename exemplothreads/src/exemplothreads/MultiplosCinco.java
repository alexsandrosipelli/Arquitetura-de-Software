/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exemplothreads;

/**
 *
 * @author alexsandro.lsipelli
 */
public class MultiplosCinco extends Thread{
    @Override
    public void run(){
    for (int i = 5; i < 2000; i += 5) {
        System.out.println(i);

    }
}
    
}
    

