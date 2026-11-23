/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejemplos1;

/**
 *
 * @author josema
 */
public class MiHilo extends Thread {

    private String nombre;
    private int numero;

    public MiHilo(String nombre, int numero) {
        this.nombre = nombre;
        this.numero = numero;
        this.setName(nombre);
    }

    @Override
    public void run() {
        for (int i = 1; i < numero; i++) {
            System.out.println(nombre + " - Contador: " + i);
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo interrumpido " + e.getMessage());
            }
        }
        System.out.println("Hilo " + nombre + ". Finaliza tras " + numero + " impresiones.");

    }

}
