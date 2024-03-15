/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package cliente;

import modelo.Carga;
import strategy.*;

/**
 *
 * @author alexsandro.lsipelli
 */
public class Cliente {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /*agora com esse trecho de codigo estou escondendo a regra do negocio e estou eliminando o if else*/
        try {
            Carga carga = new Carga(12, "Livro de design pattern");
            int opc = 2;
            double frete = ListaEmpresas.values()[opc].calcularFrete(carga);
            System.out.println("O frete sera " + frete);
        } catch (Exception e) {

            System.out.println(" ERRO" + e.getMessage());

        }

    }

//  /* public static double calcularFrete(String nomeEmpresa, Carga carga) {
//  /*futuramente outras empresa vao se interessa em fazer parte, COM MUITAS EMPRESAS SERÁ UMA LOGICA DE DIFICIL MANUTENÇÃO.
//  PORTANTO TRATA COM (IF ELSE) NAO TEM UMA ESCALABILIDADE BOA --> pare resolver isso vamos usar o design ----> STRATEGY*/
//  /*PARA CADA IF E ELSE SERÁ FEITO UMA INTEFACE*/
//  /*POLIMOFISMO EM AÇÃO AQUI A empresa ESTA SERVIDO PARA TODOS OS CASOS DE EMPRESAS DIFERENTES*/
//
//        CalcularFrete empresa;
//        if (nomeEmpresa.equalsIgnoreCase("ABC")) {
//            empresa = new ABC();
//        } else if (nomeEmpresa.equalsIgnoreCase("CBA")) {
//            empresa = new CBA();
//        } else if (nomeEmpresa.equalsIgnoreCase("XPTO")) {
//            empresa = new XPTO();
//        } else {
//
//            throw new IllegalArgumentException("EMPRESA INVALIDA");
//        }
//        return empresa.calcularFrete(carga);
//    }*/
}
