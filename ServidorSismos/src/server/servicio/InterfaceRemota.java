/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.servicio;

import java.rmi.Remote;
import java.rmi.RemoteException;

/**
 *
 * @author faber
 */
public interface InterfaceRemota extends Remote{
    public void agregarMedicion(String id, String promedio, String desviacion) throws RemoteException;
    
}
