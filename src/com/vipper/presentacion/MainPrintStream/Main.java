/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vipper.presentacion.MainPrintStream;

import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programacion
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // 1. Redirigir a un fichero la salida a la consola --> método setOutput
            // 2. método printf --> en el string que se quiere imprimir ir sustiyendo variables
            //     en lugar de estar concatenando con +

            PrintStream p1 = new PrintStream("ejemploPrintStream.txt");
            //Redirecconar el System.out al fichero 
            System.setOut(p1);
            System.out.println("ESTE EJEMPLO ESCRIBE DIRECTAMENTE EN EL FICHRERO");
            System.out.println("Es la primera linea del archivo");
            System.out.println("Nombre producto \t \t Cantidad \t Precio \t");
            for (int i = 0; i < 10; i++) {
                //Escribir un producto
                System.out.printf("%15s \t \t %d \t %.1f \n", "producto"+i, i*100, 1.1*i);
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        }
    }
    
}
