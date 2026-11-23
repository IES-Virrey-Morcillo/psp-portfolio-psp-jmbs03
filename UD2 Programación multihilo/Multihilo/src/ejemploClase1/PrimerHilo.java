/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploClase1;

/**
 *
 * @author josema
 */
public class PrimerHilo extends Thread {

    private String nombre;
    private int x;

    public PrimerHilo(String nombre, int x) {
        this.nombre = nombre;
        this.x = x;
    }

    @Override
    public void run() {
        for (int i = 0; i < x; i++) {
            System.out.println("En el hilo " + nombre + " - Contador: " + i);
            try {
                Thread.sleep(250);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido " + e.getMessage());
            }
        }
        System.out.println("Hilo " + nombre + " finaliza.");

    }

    public static void main(String[] args) {
        PrimerHilo p4 = new PrimerHilo("Alejandro", 9);
        PrimerHilo p1 = new PrimerHilo("Antonio", 10);
        PrimerHilo p2 = new PrimerHilo("Denis", 7);
        PrimerHilo p3 = new PrimerHilo("Manuel", 3);
        try {
            p3.start();
            p3.join();
            
            p4.start();
            p1.start();
            p2.start();

            p4.join();
            p1.join();
            p2.join();
            System.out.println("Hilo principal terminado.");
        } catch (InterruptedException ex) {
            System.getLogger(PrimerHilo.class.getName()).log(System.Logger.Level.ERROR, (String) null, ex);
        }
    }

}
