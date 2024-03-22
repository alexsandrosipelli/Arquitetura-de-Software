/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package fabrica;

/**
 *
 * @author alexsandro.lsipelli
 */
public class FabricaGM implements Fabrica {

    @Override
    public Carro metodoFabrica(Enum carro) {/*AGORA O METODO È METODO DE CLASSE PQ TEM O STATIC*/

        if (carro.equals(ListaCarrosGM.ONIX)) {
            return new Onix(12000, "Urban");
        } else if (carro.equals(ListaCarrosGM.CORSA)) {
            return new Corsa(3000, "Tsi");
        }
        return null;
    }

}
