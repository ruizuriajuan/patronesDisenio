package org.patron.creacional.abstractfactory.sofa;

public class SofaVictorian implements ISofa{
    @Override
    public String estilo() {
        return "Victorian";
    }

    @Override
    public String material() {
        return "Tela";
    }

    @Override
    public String color() {
        return "Blanco";
    }
}