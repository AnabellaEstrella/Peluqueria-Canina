package Persistencia;

import Logica.Mascota;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Anabella
 */
public class ControladoraPersistencia {
    MascotaJpaController mascotaJPA = new MascotaJpaController();
    
    public void crearMascota(Mascota mascota) {
        try {
            mascotaJPA.create(mascota);
        } catch (Exception ex) {
            Logger.getLogger(ControladoraPersistencia.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public boolean buscarMascota(int id) {
        return mascotaJPA.findMascota(id) != null;
    }
}
