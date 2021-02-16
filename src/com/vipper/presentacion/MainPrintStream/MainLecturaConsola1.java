/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vipper.presentacion.MainPrintStream;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programacion
 */
public class MainLecturaConsola1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Leer de la consola con el System in
        // (Esto generalmente se hace por medio de un Scanner)
        // Mandar la salida al System.err
        int valor = 0;
        System.out.println("Escriba un caracter -->");
        try {
            valor = System.in.read();
        } catch (IOException ex) {
            System.err.println(ex.toString());
            System.exit(-1);
        }
        System.out.println("El caracter que se a leido es --> " + valor);
        System.out.println("El caracter que se a leido es --> " +(char) valor);
    }
    
}
