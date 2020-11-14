
package Produtos;

import interfaces.ITipoLager;


public class SkolPilsen implements ITipoLager{

    @Override
    public void exibirInfoLager() {
        System.out.println(" Cervejas de baixa fermentação, sendo produzidas em uma temperatura reduzida, por volta de 10 graus.\nIngredientes: água, malte, milho e lúpulo.");
    }

   
    
}
