/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package concretas;

import Produtos.EisenbahnPilsen;
import Produtos.EisenbahnStrongGoldenAle;
import interfaces.IFabricaDeCerveja;
import interfaces.ITipoAle;
import interfaces.ITipoLager;

/**
 *
 * @author Jake Freitas
 */
public class FabricaEisenbahn implements IFabricaDeCerveja{

    @Override
    public ITipoLager criarCervejaLager() {
        return new EisenbahnPilsen();
    }

    @Override
    public ITipoAle criarCervejaAle() {
        return new EisenbahnStrongGoldenAle();
    }
    
}
