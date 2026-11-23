/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemploClase1;

/**
 *
 * @author josema
 */
public class MiHilo extends Thread {

    private String nombre;

    public MiHilo(String nombre) {
        this.nombre = nombre;
    }

    @Override
    public void run() {
        for (int i = 0; i < 5; i++) {
            System.out.println(nombre + " - Contador: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido " + e.getMessage());
            }
        }
        System.out.println("Hilo " + nombre + " finaliza.");

    }

}
