package org.patron.creacional.abstractfactory.mesa;

public interface IMesa {
    String getTipo();
    String getColor();
    static String soy(){
        return "mesita";
    }
}
