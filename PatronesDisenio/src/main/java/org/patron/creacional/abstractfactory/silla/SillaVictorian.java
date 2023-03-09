package org.patron.creacional.abstractfactory.silla;

public class SillaVictorian implements ISilla{
    @Override
    public String getEstilo() {
        return "Victorian";
    }

    @Override
    public int patas() {
        return 3;
    }

    @Override
    public String getColor() {
        return "Blanco";
    }

    @Override
    public String toString() {
        return getEstilo()+ ", tiene"+patas()+" patas y tiene color "+getColor();
    }
}