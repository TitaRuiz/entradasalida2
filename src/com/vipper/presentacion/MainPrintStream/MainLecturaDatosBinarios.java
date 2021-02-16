/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vipper.presentacion.MainPrintStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programacion
 */
public class MainLecturaDatosBinarios {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Leer datos binarios de un fichero
            // Declarar nuestro objeto para leer el fichero
            DataInputStream e = new DataInputStream(new FileInputStream("datosbinarios.dat"));
            for (int i = 0; i < 10; i++) {
                //Escribir por pantalla los datos usando el printf
                System.out.printf("datos --> %d %d %d %d %d %f %f \n", i,
                                            e.readByte(),
                                            e.readShort(),
                                            e.readInt(),
                                            e.readLong(),
                                            e.readFloat(),
                                            e.readDouble());         
            }
        } catch (FileNotFoundException ex) {
            System.err.println(ex.toString());
            System.exit(-1);
        } catch (IOException ex) {
            Logger.getLogger(MainLecturaDatosBinarios.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
