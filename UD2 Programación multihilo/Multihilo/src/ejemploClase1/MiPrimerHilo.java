/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploClase1;

import static java.lang.Thread.sleep;
import java.util.ArrayList;

/**
 *
 * @author josema
 */
public class MiPrimerHilo {

    public static void main(String[] args) {
        
        MiHilo h1 = new MiHilo("Hilo Mathias qué alegría verte");
        MiHilo h2 = new MiHilo("Hilo Alejandro que risa te da");

        h1.start();
        h2.start();

    }

}
