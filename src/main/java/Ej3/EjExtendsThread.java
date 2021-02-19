package Ej3;
/**
 * @author Prof Matias Garcia.
 * <p> Copyright (C) 2017 para <a href = "https://www.profmatiasgarcia.com.ar/"> www.profmatiasgarcia.com.ar </a>
 * - con licencia GNU GPL3.
 * <p> Este programa es software libre. Puede redistribuirlo y/o modificarlo bajo los términos de la
 * Licencia Pública General de GNU según es publicada por la Free Software Foundation, 
 * bien con la versión 3 de dicha Licencia o bien (según su elección) con cualquier versión posterior. 
 * Este programa se distribuye con la esperanza de que sea útil, pero SIN NINGUNA GARANTÍA, 
 * incluso sin la garantía MERCANTIL implícita o sin garantizar la CONVENIENCIA PARA UN PROPÓSITO
 * PARTICULAR. Véase la Licencia Pública General de GNU para más detalles.
 * Debería haber recibido una copia de la Licencia Pública General junto con este programa. 
 * Si no ha sido así ingrese a <a href = "http://www.gnu.org/licenses/"> GNU org </a>
 */
public class EjExtendsThread extends Thread {
    // constructor

    public EjExtendsThread(String str) {
        super(str);
    }

    // redefinición del método run()
    public void run() {
        for (int i = 0; i < 10; i++) {
            System.out.println("Este es el thread : " + getName());
        }
    }

    public static void sleep(long millis) throws InterruptedException {

    }

    public static void main(String[] args) {
        //Creo dos objetos de la clase con diferente string
        EjExtendsThread miThread1 = new EjExtendsThread("Hilo de prueba");
        EjExtendsThread miThread2 = new EjExtendsThread("Prueba de hilo");
        //Ejecuto ambos threads
        miThread1.start();
        miThread2.start();
    }
}
