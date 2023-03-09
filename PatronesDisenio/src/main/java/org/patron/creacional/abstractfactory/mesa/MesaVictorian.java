package org.patron.creacional.abstractfactory.mesa;

public class MesaVictorian implements IMesa{
    @Override
    public String getTipo() {
        return "Vicotrian";
    }

    @Override
    public String getColor() {
        return "Blanco";
    }
}