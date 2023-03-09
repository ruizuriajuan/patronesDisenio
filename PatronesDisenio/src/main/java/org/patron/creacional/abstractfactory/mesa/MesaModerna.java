package org.patron.creacional.abstractfactory.mesa;

public class MesaModerna implements IMesa{
    @Override
    public String getTipo() {
        return "Moderna";
    }

    @Override
    public String getColor() {
        return "Cafe";
    }
}
