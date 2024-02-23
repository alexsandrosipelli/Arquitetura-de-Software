package arena;

import tanqueRobo.*;


/*
*  Professor Gerson Risso
 */
public class Arena {

    public static void main(String[] args) {
        TanqueRobo tanque = new TanqueRobo(0, 0, CoresRGB.BLUE, CoresRGB.RED, "carry");
        System.out.println(tanque);
        tanque.movNorte();
        tanque.movNorte();
        tanque.movNorte();
        tanque.movNorte();
        System.out.println(tanque);
        tanque.atirar();
        System.out.println(tanque);
        try {
        tanque.atirar(5);
            
        } catch (Exception e) {/*sem esse trycatch o progama é interropido */
            System.out.println(e.getMessage());
            
                
        }
                System.out.println(tanque);

    }

}
