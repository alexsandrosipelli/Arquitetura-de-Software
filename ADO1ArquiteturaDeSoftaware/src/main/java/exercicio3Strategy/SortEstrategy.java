/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Enum.java to edit this template
 */
package exercicio3Strategy;

/**
 *
 * @author alexs
 *
 */

/*esse enum terá 3 constantes que sao os tipos de ordenaçao com isso o index 0 é o INSERTION_SORT e assim vai ...*/
public enum SortEstrategy implements Estrategia {
    /*Por essa classe Enum esta implementando a interface Estrategia, esta sendo feito o Override para qua cada classe(Constante) tenha seu proprio metodo de ordenar*/
 /*Comparado com o exemplo do professor em aula essa seria a classe ListaEmpresas.*/
    INSERTION_SORT {
        @Override
        public void ordenar(int[] v) {
            int i, j;
            int temp;
            for (i = 1; i < v.length; i++) {
                temp = v[i];
                j = i;
                while (j > 0 && v[j - 1] >= temp) {
                    v[j] = v[j - 1];
                    j--;
                }
                v[j] = temp;
            }
            System.out.println("ORDENADO PELO INSERTION_SORT");

        }
    },
    SELECTION_SORT {
        @Override
        public void ordenar(int[] v) {
            int i, j, min, aux;
            for (i = 0; i < v.length - 1; i++) {
                min = i;
                for (j = i + 1; j < v.length; j++) {
                    if (v[j] < v[min]) {
                        min = j;
                    }
                }
                aux = v[i];
                v[i] = v[min];
                v[min] = aux;
            }
            System.out.println("ORDENADO PELO SELECTION_SORT");

        }
    },
    BUBBLE_SORT {
        @Override
        public void ordenar(int[] v) {
            int i, j;
            int temp;
            for (j = 0; j < v.length - 1; j++) {
                for (i = 0; i < v.length - 1 - j; i++) {
                    if (v[i] > v[i + 1]) {
                        temp = v[i];
                        v[i] = v[i + 1];
                        v[i + 1] = temp;
                    }
                }
            }
            System.out.println("ORDENADO PELO BUBBLE_SORT");

        }
    };

}
