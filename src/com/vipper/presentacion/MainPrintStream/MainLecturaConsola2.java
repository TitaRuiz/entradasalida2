/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vipper.presentacion.MainPrintStream;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programacion
 */
public class MainLecturaConsola2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Es leer por consola una línea
            BufferedReader b1 = new BufferedReader(new InputStreamReader(System.in));
            System.out.print("Escriba una línea -->");
            String linea = b1.readLine();
            System.out.println("La línea leida es -->" + linea);
            System.out.printf("La linea leida es --> %s",linea);
        } catch (IOException ex) {
            System.out.println(ex.toString());
        }
        
    }
    
}
