package Logica;

import Persistencia.ControladoraPersistencia;

/**
 *
 * @author Anabella
 */
public class Controladora {
    ControladoraPersistencia controlPersis = new ControladoraPersistencia();
    
    public void altaMascota(int numCliente, String nombrePerro, String raza, String color, boolean esAlergico, boolean tieneAtencionEspecial, String nombreDuenio, String celDuenio, String observaciones) {
        Mascota masc = new Mascota();
        masc.setNum_cliente(numCliente);
        masc.setNombre_perro(nombrePerro);
        masc.setRaza(raza);
        masc.setColor(color);
        masc.setAlergico(esAlergico);
        masc.setAtencion_especial(tieneAtencionEspecial);
        masc.setNombre_duenio(nombreDuenio);
        masc.setCelular_duenio(celDuenio);
        masc.setObservaciones(observaciones);
        
        controlPersis.crearMascota(masc);
    }
    
    public void altaMascota(Mascota masc) {
        controlPersis.crearMascota(masc);
    }
    
    public boolean buscarMascota(int numCliente) {
        return controlPersis.buscarMascota(numCliente);
    }
}