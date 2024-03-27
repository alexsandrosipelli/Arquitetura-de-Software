/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package exercicio2Singleton;

/**
 *
 * @author alexs 
 * /*A instância é criada dentro do método getInstance(). O método
 * getInstance() é sincronizado usando a palavra-chave synchronized, garantindo
 * que apenas uma thread possa acessá-lo por vez. MAS Tbm existe outros metodos
 * de fazer isso
 */
public class Singleton {

    private static Singleton instance;

    private Singleton() {
        /*o construtor tem que ser privado para nao poder acessar fora da classe,para impedir a criação de instâncias da classe fora dela própria*/
        System.out.println("AQUI SE CASO SAIR APENAS UMA VEZ NA TELA FOI FEITA APENAS UMA INSTANCIA DA CLASSE FCriando instância Singleton...");
    }

    public static Singleton getInstance() {
        // Verifica se a instância já foi criada
        if (instance == null) {
            // Bloqueia a criação de múltiplas instâncias em threads simultâneas

            synchronized (Singleton.class) {
                /* Verifica novamente dentro da seção crítica para evitar a criação de instâncias duplicadas*/
        /*(seção crítica)neste caso, a criação da instância do singleton.*/
                if (instance == null) {
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }

}
