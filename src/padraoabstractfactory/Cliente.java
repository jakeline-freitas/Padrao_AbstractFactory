/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package padraoabstractfactory;

import concretas.FabricaEisenbahn;
import interfaces.IFabricaDeCerveja;
import interfaces.ITipoAle;
import interfaces.ITipoLager;

/**
 *
 * @author Jake Freitas
 */
public class Cliente {
    public static void main(String[] args) {
        IFabricaDeCerveja fabrica = new FabricaEisenbahn();
        
        ITipoAle eisenbahnAle = fabrica.criarCervejaAle();
        
        eisenbahnAle.exibirInfoAle();
        
        ITipoLager eisenbahnPilsen = fabrica.criarCervejaLager();
        System.out.println("#-------------------------------#");
        eisenbahnPilsen.exibirInfoLager();
    }
    
}
