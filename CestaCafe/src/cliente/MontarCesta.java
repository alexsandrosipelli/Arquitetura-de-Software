/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import composicao.Componente;
import composicao.Composicao;
import composicao.Folha;

/**
 *
 * @author alexsandro.lsipelli
 */
public class MontarCesta {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Composicao cesta = new Composicao(" Cesta de cafe da manha");
        //o obj que pode se instanciado de varias maneiras --> polimofismo  
        Componente p1 = new Folha("pao de queijo", 4.21);
        Componente p2 = new Folha("pacotinho de cafe soluvel", 5.12);
        Componente p3 = new Folha("leite", 6.99);

        cesta.adicionar(p3);
        cesta.adicionar(p2);
        cesta.adicionar(p1);
        System.out.println(cesta.toString());

        //criando os bombons
        Componente p4 = new Folha("maracuja", 2.45);
        Componente p5 = new Folha("CEREJA", 4.71);
        Componente p6 = new Folha("MORANGO", 1.71);
        //criando a caixa de bombons

        Composicao caixa = new Composicao("CAIXA DE BOMBONS");
        //ADCIONANDO BOMBONS 
        caixa.adicionar(p6);
        caixa.adicionar(p5);
        caixa.adicionar(p4);
        //adicionar a caixa na cesta
        cesta.adicionar(caixa);
        System.out.println(cesta.getPreco());
        System.out.println(cesta.toString());
        System.out.println(cesta);
    }

}
