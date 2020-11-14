/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretas;

import Produtos.SkolPilsen;
import interfaces.IFabricaDeCerveja;
import interfaces.ITipoAle;
import interfaces.ITipoLager;

/**
 *
 * @author Jake Freitas
 */
public class FabricaSkol implements IFabricaDeCerveja{

    @Override
    public ITipoLager criarCervejaLager() {
        return new SkolPilsen();
        
    }

    @Override
    public ITipoAle criarCervejaAle() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

   
    
}
