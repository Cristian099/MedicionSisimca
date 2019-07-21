/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;
import java.rmi.AccessException;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.negocio.MedicionSismo;
import server.servicio.InterfaceRemota;

/**
 *
 * @author faber
 */
public class ServidorRMI implements ServidorMedicion{
    private static final String IP = "localhost"; // Puedes cambiar a localhost
    private static final int PUERTO = 2500; //Si cambias aquí el puerto, recuerda cambiarlo en el servidor
    public server.negocio.MedicionSismo[] gestorI;
    public server.negocio.MedicionSismo gestorSI;

    public ServidorRMI() {
    }
    

    @Override
    public void agregarMedicion(String idEstacion, String promedio, String desviacion) throws RemoteException, AccessException  {
         
      Registry miRegistro;
      miRegistro = LocateRegistry.getRegistry(IP, PUERTO);
      InterfaceRemota s;
        try {
            s = (InterfaceRemota) miRegistro.lookup("Clientes");
            s.agregarMedicion(idEstacion, promedio, desviacion);
        } catch (NotBoundException ex) {
            Logger.getLogger(ServidorRMI.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
}
