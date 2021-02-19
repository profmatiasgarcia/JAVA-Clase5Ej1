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
public class PruebaRunneable {

    public static void main(String[] args) {
        // El siguiente código crea dos nuevos threads y los ejecuta 
        EjRunneable p1 = new EjRunneable("Hilo de prueba");
        EjRunneable p2 = new EjRunneable("Prueba de hilo");
        // se crean objetos de la clase Thread pasándolo el objeto Runnable como argumento
        Thread miThread1 = new Thread(p1);
        Thread miThread2 = new Thread(p2);
        // se arranca los objetos de la clase Thread
        miThread1.start();
        miThread2.start();
    }
}
