
package Produtos;

import interfaces.ITipoLager;


public class EisenbahnPilsen implements ITipoLager{

    @Override
    public void exibirInfoLager() {
        System.out.println(" Nome: Eisenbahn Pilsen 600ml\n A cerveja Eisenbahn Pilsen é o rótulo mais vendido da marca no Brasil.\n É Uma cerveja que nasceu para agradar todos os tipos.\n De baixa fermentação e com teor alcoólico de 4,8%.\n Suas principais características são a pureza, refrescância e espuma cremosa.");
    }
    
}
