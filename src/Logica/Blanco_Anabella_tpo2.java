package Logica;

import Igu.Pantalla;

/**
 *
 * @author Anabella
 */
public class Blanco_Anabella_tpo2 {

    public static void main(String[] args) {
        Controladora control = new Controladora();
        
        Pantalla pantalla = new Pantalla(control);
        pantalla.setVisible(true);
        pantalla.setLocationRelativeTo(null);
    }
    
}
