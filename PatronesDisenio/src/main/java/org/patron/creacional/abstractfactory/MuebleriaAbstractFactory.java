package org.patron.creacional.abstractfactory;

import org.patron.creacional.abstractfactory.mesa.IMesa;
import org.patron.creacional.abstractfactory.silla.ISilla;
import org.patron.creacional.abstractfactory.sofa.ISofa;

public abstract class MuebleriaAbstractFactory {
    public abstract ISilla crearSilla();
    public abstract IMesa crearMesa();
    public abstract ISofa crearSofa();
}
