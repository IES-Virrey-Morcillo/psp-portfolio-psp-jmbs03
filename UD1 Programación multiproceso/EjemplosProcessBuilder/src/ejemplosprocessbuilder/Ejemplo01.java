/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package ejemplosprocessbuilder;

import java.io.File;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author josema
 */
public class Ejemplo01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            // TODO code application logic here
            ProcessBuilder pb = new ProcessBuilder("notepad");
            
            pb.directory(new File("C:\\"));
            pb.redirectErrorStream(true);
            
            Process p = pb.start();

            ProcessBuilder pb2 = new ProcessBuilder("cmd","/c", "dir");
            pb2.directory(new File("C:\\"));
            Process p2 = pb2.start();
            
            
        } catch (IOException ex) {
            Logger.getLogger(Ejemplo01.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
