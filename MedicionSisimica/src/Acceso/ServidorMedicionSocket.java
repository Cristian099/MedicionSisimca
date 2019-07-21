/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Acceso;

import java.io.IOException;
import java.io.PrintStream;
import java.net.Socket;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author faber
 */
public class ServidorMedicionSocket implements ServidorMedicion{
     private Socket socket = null;
    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private final String IP_SERVIDOR = "localhost";
    private final int PUERTO = 5000;
    
    //Metodos
    private String consultarServicio(String servicio) {
       String respuesta = null;
        try{
            conectar(IP_SERVIDOR, PUERTO);
            respuesta = leerFlujoEntradaSalida(servicio);
            cerrarFlujos();
            desconectar();
            
        }catch (IOException ex) {
            Logger.getLogger(ServidorMedicionSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        return respuesta;
    }
    
    private String leerFlujoEntradaSalida(String servicio) throws IOException {
        String respuesta = "";
        entradaDecorada = new Scanner(socket.getInputStream());
        salidaDecorada = new PrintStream(socket.getOutputStream());
        salidaDecorada.flush();
        // Usando el protocolo de comunicación
        salidaDecorada.println(servicio);
        if (entradaDecorada.hasNextLine()) {
            respuesta = entradaDecorada.nextLine();
        }
        return respuesta;
    }

    private void cerrarFlujos() {
        salidaDecorada.close();
        entradaDecorada.close();
    }

    private void desconectar() {
        try {
            socket.close();
        } catch (IOException ex) {
            Logger.getLogger(ServidorMedicionSocket.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public void conectar(String address, int port) throws IOException {
        socket = new Socket(address, port);
        System.out.println("Conectado");
    }

   

     @Override
    public void agregarMedicion(String idEstacion, String promedio, String desviacion) {
        String respuesta = consultarServicio("agregarMedicion, "+idEstacion+","+promedio+","+desviacion);
        
    }
    
}
