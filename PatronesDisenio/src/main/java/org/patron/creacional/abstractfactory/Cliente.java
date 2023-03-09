package org.patron.creacional.abstractfactory;

import org.patron.creacional.abstractfactory.silla.ISilla;

public class Cliente {
    public static void main (String [] args) {
        System.out.println("...................................");
        MuebleriaAbstractFactory modernFactory = new MuebleriaModernaFactory();
        MuebleriaAbstractFactory victorianFactory = new MuebleriaVictorianFactory();
        ISilla silla =  modernFactory.crearSilla();
        imprimir(silla);

        silla = victorianFactory.crearSilla();
        imprimir(silla);
    }

    public static void imprimir(ISilla silla){
        System.out.println(silla.toString());
    }
}






