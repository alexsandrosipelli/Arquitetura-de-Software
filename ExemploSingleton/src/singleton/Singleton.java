
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package singleton;

/**
 *
 * @author alexsandro.lsipelli
 *//*existem dois tipos de fazer o SINGLETON uma é realizando a instancia assim que se cria a classe e outra é colocando em um metodo para instanciar e dessa maneira
se for por thread pode usar outros locais de memorias*/
public class Singleton {/*lazy singleton carrega a classe mas apenas é instanciada quando é chamada.
    O padrao lazy singleton  nao garate uma intancia apenas*/
 /*o outro singleton, ele é  ja instanciando assim que executa a classe. se fizer varias threads vai ser a mesma instancia sempre*/

 /*quando eu executo um projeto java todas as classes sao carregadas na memoria
    a clase Singleton e a UsaSinglenton sao carregadas na memoria e nesse caso especifico ao carregar a classe ja cria uma intancia da classe na memoria
    
     */
 /*    private static Singleton singleton= new Singleton();/*aqui ja esta sendo criada uma instancia da classe */

    private static Singleton singleton;

    /*variavel estatica da classe Singleton nao é um obj, pq nao tem new alguma coisa kkkkk */

    private Singleton()/*tem que ser privada para nao poder acessar fora da classe*/ {
    }

    public static Singleton getInstance() {/*quando coloca Static significa que esse mesmo metodo é o metodo da classe*/
        if (singleton == null) {/*se nao tiver instancia cria*/

            singleton = new Singleton();
        }/*se ja tiver a instancia so retorna*/

        return singleton;
    }
}
