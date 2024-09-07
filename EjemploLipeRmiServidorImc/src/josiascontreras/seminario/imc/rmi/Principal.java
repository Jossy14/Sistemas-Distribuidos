package josiascontreras.seminario.imc.rmi;

import josiascontreras.seminario.imc.rmi.net.Servidor;

/**
 *
 * @author Josia
 */
public class Principal {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Servidor servicio = new Servidor();
        try {
            servicio.iniciar();
        } catch (Exception ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
    
}
