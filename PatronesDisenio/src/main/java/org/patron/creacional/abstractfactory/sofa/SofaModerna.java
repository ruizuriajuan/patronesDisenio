package org.patron.creacional.abstractfactory.sofa;

public class SofaModerna implements ISofa{
    @Override
    public String estilo() {
        return "Moderna";
    }

    @Override
    public String material() {
        return "Cuero";
    }

    @Override
    public String color() {
        return "Azul";
    }
}
