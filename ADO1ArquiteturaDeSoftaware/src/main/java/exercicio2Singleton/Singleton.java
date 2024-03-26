/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2Singleton;

/**
 *
 * @author alexs
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        /*tem que ser privada para nao poder acessar fora da classe*/
    }

    public static Singleton getInstance() {
        // Verifica se a instância já foi criada
        if (instance == null) {
            // Bloqueia a criação de múltiplas instâncias em threads simultâneas
            synchronized (Singleton.class) {
                // Verifica novamente dentro da seção crítica para evitar a criação de instâncias duplicadas
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
