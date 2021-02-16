/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.vipper.presentacion.MainPrintStream;

import java.io.DataOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Programacion
 */
public class MainEscribirDatosBinario {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // Escribir datos en binario
            DataOutputStream s = new DataOutputStream(new FileOutputStream("datosbinarios.dat"));
            // Bucle para escribir en este fichero diferentes tipos de datos
            for (int i = 0; i < 10; i++) {
                s.writeByte(i);
                s.writeShort(i);
                s.writeInt(i);
                s.writeLong(i);
                s.writeFloat(i);
                s.writeDouble(i);          
            }
            
        } catch (FileNotFoundException ex) {
            System.out.println(ex.toString());
        } catch (IOException ex) {
            Logger.getLogger(MainEscribirDatosBinario.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
