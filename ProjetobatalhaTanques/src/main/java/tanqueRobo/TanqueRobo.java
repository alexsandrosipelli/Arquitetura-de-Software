package tanqueRobo;

/*
 *  Professor Gerson Risso
 */
public class TanqueRobo implements Posicao, Cor, Canhao {

    private int x, y;
    private CoresRGB corTanque;
    private CoresRGB corCanhao;
    private String nome;

    public TanqueRobo() {
    }

    public TanqueRobo(int x, int y, CoresRGB corTanque, CoresRGB corCanhao, String nome) {
        this.x = x;
        this.y = y;
        this.corTanque = corTanque;
        this.corCanhao = corCanhao;
        this.nome = nome;
    }

    @Override
    public void movLeste() {
        x++;
    }

    @Override
    public void movOeste() {
        x--;
    }

    @Override
    public void movSul() {
        y--;
    }

    @Override
    public void movNorte() {
        y++;
    }

    @Override
    public int retPosicaoX() {
        return x;
    }

    @Override
    public int retPosicaoY() {
        return y;

    }

    @Override
    public void atribCorTranque(CoresRGB corTranque) {
        this.corTanque = corTranque;

    }

    @Override
    public void atribCorCanhao(CoresRGB corCanhao) {
        this.corCanhao = corCanhao;

    }

    @Override
    public CoresRGB retCorTanque() {
        return corTanque;
    }

    @Override
    public CoresRGB retCorCanhao() {
        return corCanhao;

    }

    @Override
    public void atirar() {
        for (int i = 0; i <= 5; i++) {
            System.out.println("ATIRANDO pa pa pa pa pow pow pow kanbumm.... e morreu");

        }
    }

    @Override

    public void atirar(long cadencia /*milisegundos*/) {
        for (int i = 0; i <= 5; i++) {
            System.out.println("ATIRANDO pa pa pa pa pow pow pow kanbumm.... e morreu");
            esperar(cadencia * 1000);
        }
    }

    private void esperar(long cadencia) {
        try {
            if (cadencia>5000) {
                throw new IllegalArgumentException("valor invalida!");/*criando uma excessao*/
            }
            Thread.sleep(cadencia);/* aqui possui excessao checada(Copilador que identifica)*/

        } catch (InterruptedException e /*(THREAD <-- multitarefa) por interroper a thread (InterruptedException)  */ ) {
            System.out.println(e.getMessage()/*pegando a mensagem de erro e printando*/);
                
        }

    }
    @Override
    public String toString(){/*sobrepor as informaçoes que eu acho importante*/
    return "TanqueRobo{"+" x : " +x+",y : "+y
            +",corTanque "+corTanque
            +"corCanhao "+corCanhao+ ",nome "
            + nome+"}";
    
    
    }
           

}
