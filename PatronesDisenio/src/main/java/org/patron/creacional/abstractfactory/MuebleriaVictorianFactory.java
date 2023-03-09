package org.patron.creacional.abstractfactory;

import org.patron.creacional.abstractfactory.mesa.IMesa;
import org.patron.creacional.abstractfactory.mesa.MesaVictorian;
import org.patron.creacional.abstractfactory.silla.ISilla;
import org.patron.creacional.abstractfactory.silla.SillaVictorian;
import org.patron.creacional.abstractfactory.sofa.ISofa;
import org.patron.creacional.abstractfactory.sofa.SofaVictorian;

public class MuebleriaVictorianFactory extends MuebleriaAbstractFactory{
    @Override
    public ISilla crearSilla() {
        ISilla sillaVictorian = new SillaVictorian();
        return sillaVictorian;
    }

    @Override
    public IMesa crearMesa() {
        IMesa mesaVictorian = new MesaVictorian();
        return mesaVictorian;
    }

    @Override
    public ISofa crearSofa() {
        ISofa sofaVictorian = new SofaVictorian();
        return sofaVictorian;
    }
}
