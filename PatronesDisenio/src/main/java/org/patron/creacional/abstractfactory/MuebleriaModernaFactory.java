package org.patron.creacional.abstractfactory;

import org.patron.creacional.abstractfactory.mesa.IMesa;
import org.patron.creacional.abstractfactory.mesa.MesaModerna;
import org.patron.creacional.abstractfactory.silla.ISilla;
import org.patron.creacional.abstractfactory.silla.SillaModerna;
import org.patron.creacional.abstractfactory.sofa.ISofa;
import org.patron.creacional.abstractfactory.sofa.SofaModerna;

public class MuebleriaModernaFactory extends MuebleriaAbstractFactory{

    @Override
    public ISilla crearSilla() {
        ISilla sillaModerna = new SillaModerna();
        return sillaModerna;
    }

    @Override
    public IMesa crearMesa() {
        IMesa mesaModerna = new MesaModerna();
        return mesaModerna;
    }

    @Override
    public ISofa crearSofa() {
        ISofa sofaModerna = new SofaModerna();
        return sofaModerna;
    }


}
