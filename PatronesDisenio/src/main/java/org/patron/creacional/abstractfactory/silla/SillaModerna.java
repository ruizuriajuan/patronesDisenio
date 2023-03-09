package org.patron.creacional.abstractfactory.silla;

public class SillaModerna implements ISilla{
    @Override
    public String getEstilo() {
        return "Moderna";
    }

    @Override
    public int patas() {
        return 4;
    }

    @Override
    public String getColor() {
        return "Cafe";
    }

    @Override
    public String toString() {
        return getEstilo()+ ", tiene"+patas()+" patas y tiene color "+getColor();
    }
}
