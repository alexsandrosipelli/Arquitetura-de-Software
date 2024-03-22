/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;

/**
 *
 * @author alexsandro.lsipelli
 */
public class FabricaVW implements Fabrica {

    /*metodod fabrica vai fabricar o  Fox e o Jetta
    
    O retorno dele é do tipo Carro pois
    alimento o metodo com um parametro generico
    
       Math.random(); METODO STATIC.
    Scanner Scanner scanner = new Scanner(system.in);
    METODO DE INSTANCIA :  visualmente pelo o simples fato de nao ter static, para usar o metodo tem que da o new 
    METODO DE CLASSE: chama ele atravez pelo nome da classe
     */
    @Override
    public Carro metodoFabrica(Enum carro) {/*AGORA O METODO È METODO DE CLASSE PQ TEM O STATIC*/

        if (carro.equals(ListaCarrosVW.FOX)) {
            return new Fox(123000, "Urban");
        } else if (carro.equals(ListaCarrosVW.JETTA)) {
            return new Jetta(35000, "Tsi");
        }
        return null;
    }
}
