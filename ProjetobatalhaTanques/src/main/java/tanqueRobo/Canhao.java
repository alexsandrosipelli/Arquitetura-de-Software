 

package tanqueRobo;

 
/*
 *  Professor Gerson Risso
 *


 */
public interface Canhao {
    public void atirar();
    /*long por conta da cadencia, assim da para usar o thread.sleep, que usa long como paramentro.    
    */
    public void atirar(long cadencia);

}
