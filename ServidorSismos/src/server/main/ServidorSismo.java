/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.main;

import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import server.servicio.ServidorMedicionesServer;

/**
 *
 * @author faber
 */
public class ServidorSismo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        int PUERTO = 2500;
          try {
            Registry miRegistry = LocateRegistry.createRegistry(PUERTO);
            miRegistry.rebind("Clientes", new ServidorMedicionesServer());
            System.out.println("Servidor RMI escuchando por el puerto "+PUERTO);
        } catch (RemoteException e) {
            System.out.println(e.getMessage());
        }
    }
    
}
