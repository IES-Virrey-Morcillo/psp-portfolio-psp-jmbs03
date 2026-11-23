/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos1;

import static java.lang.Thread.sleep;
import java.util.ArrayList;

/**
 *
 * @author josema
 */
public class MiPrimerHilo {

    public static void main(String[] args) {
        ArrayList<MiHilo> hilos = new ArrayList();
        int finalizados = 0;

        for (int i = 1; i < 6; i++) {
            MiHilo h = new MiHilo("Hilo " + i, (int) (Math.random() * 25));
            hilos.add(h);
            h.start();
//            try {
//                h.join();
//            } catch (InterruptedException ex) {
//                System.out.println("Error al esperar " + ex.getMessage());
//            }
        }

        while (finalizados < 5) {

            try {
                sleep(5000);
            } catch (InterruptedException ex) {
                System.getLogger(MiPrimerHilo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
            }
            for (int i=0;i<hilos.size();i++) {
                MiHilo h = hilos.get(i);
                if (!h.isAlive()) {
                    finalizados++;
                    System.out.println("Hilo padre detecta que el hilo " + h.getName() + " ha finalizado.");
                    hilos.remove(h);
                    i--;
                }
            }
        }
    }

}
