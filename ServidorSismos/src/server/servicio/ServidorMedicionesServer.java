/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.servicio;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.IOException;
import java.io.PrintStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;
import java.util.logging.Level;
import java.util.logging.Logger;
import server.negocio.GestorMediciones;
import server.negocio.MedicionSismo;

/**
 *
 * @author faber
 */
public class ServidorMedicionesServer extends UnicastRemoteObject implements InterfaceRemota{
    private final GestorMediciones gesMediciones;
   
   /* 
    private static ServerSocket ssocket;
    private static Socket socket;

    private Scanner entradaDecorada;
    private PrintStream salidaDecorada;
    private static final int PUERTO = 5000;
*/
    /**
     * Constructor
     */
    public ServidorMedicionesServer() throws RemoteException {
        super();
        gesMediciones = new GestorMediciones();
        
    }
    /**
     * Logica completa del servidor
     */
    /*
    public void iniciar() {
        abrirPuerto();

        while (true) {
            esperarAlCliente();
            lanzarHilo();
        }
    }
*/
    /**
     * Lanza el hilo
     */
    /*
    private static void lanzarHilo() {
        new Thread(new ServidorMedicionesServer()).start();
    }
*/
    /*
    private static void abrirPuerto() {
        try {
            ssocket = new ServerSocket(PUERTO);
            System.out.println("Escuchando por el puerto " + PUERTO);
        } catch (IOException ex) {
            Logger.getLogger(ServidorMedicionesServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    /**
     * Espera que el cliente se conecta y le devuelve un socket
     */
    /*
    private static void esperarAlCliente() {
        try {
            socket = ssocket.accept();
            System.out.println("Cliente conectado");
        } catch (IOException ex) {
            Logger.getLogger(ServidorMedicionesServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
*/
    /**
     * Cuerpo del hilo
     */
    /*
    @Override
    public void run() {
        try {
            crearFlujos();
            leerFlujos();
            cerrarFlujos();

        } catch (IOException e) {
            System.out.println(e);
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(ServidorMedicionesServer.class.getName()).log(Level.SEVERE, null, ex);
        } catch (SQLException ex) {
            Logger.getLogger(ServidorMedicionesServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    */

    /**
     * Crea los flujos con el socket
     *
     * @throws IOException
     */
   /* private void crearFlujos() throws IOException {
        salidaDecorada = new PrintStream(socket.getOutputStream());
        entradaDecorada = new Scanner(socket.getInputStream());
    }

    /**
     * Lee los flujos del socket
     */
   /* private void leerFlujos() throws ClassNotFoundException, SQLException {
        if (entradaDecorada.hasNextLine()) {
            // Extrae el flujo que envía el cliente
            String peticion = entradaDecorada.nextLine();
            decodificarPeticion(peticion);

        } else {
            salidaDecorada.flush();
            salidaDecorada.println("NO_ENCONTRADO");
        }
    }

    /**
     * Decodifica la petición, extrayeno la acción y los parámetros
     *
     * @param peticion petición 
     */
   /* private void decodificarPeticion(String peticion) throws ClassNotFoundException, SQLException {
        System.out.println(peticion);
        StringTokenizer tokens = new StringTokenizer(peticion, ",");
        String parametros[] = new String[10];

        int i = 0;
        while (tokens.hasMoreTokens()) {
            parametros[i++] = tokens.nextToken();
        }
        String accion = parametros[0];
        procesarAccion(accion, parametros);

    }
*/
    /**
     * Segun el protocolo decide qué accion invocar
     *
     * @param id
     * @param promedio
     * @param desviacion
     * @param accion acción a procesar
     * @param parametros parámetros de la acción
     * @throws java.rmi.RemoteException
     */
  /*  private void procesarAccion(String accion, String parametros[]) throws ClassNotFoundException, SQLException {
        switch (accion) {
            case "consultarMediciones":
                ArrayList<MedicionSismo> mediciones;
                mediciones = gesMediciones.consultarMediciones();
                salidaDecorada.println(serializarClientes(mediciones));
                break;
            case "agregarMedciones":
                gesMediciones.agregarMedicion(parametros[1], parametros[2], parametros[3]);
                salidaDecorada.println("Exito");
                break;
        }
    }
    /**
     * Cierra los flujos de entrada y salida
     *
     * @throws IOException
     */
    /*private void cerrarFlujos() throws IOException {
        salidaDecorada.close();
        entradaDecorada.close();
        socket.close();
    }

    /**
     * Convierte el objeto MedicionSismo a json
     *
     * @param listado de mediciones
     * @return cadena json
     */
    /*private String serializarClientes(ArrayList<MedicionSismo> listado) {       
        JsonArray array = new JsonArray();
        JsonObject gsonObj;
        for (MedicionSismo miMedicion : listado) {
            gsonObj = new JsonObject();
            gsonObj.addProperty("idEstacion", miMedicion.getIdEstacion());
            gsonObj.addProperty("promedio", miMedicion.getValorPromedioSismo());
            gsonObj.addProperty("desviacion", miMedicion.getDesviacion());
            array.add(gsonObj);
        }
        System.out.println("Mediciones json serializado: " + array.toString());
        return array.toString();
    }
*/
    @Override
    public void agregarMedicion(String id, String promedio, String desviacion) throws RemoteException {
         
        try {
            gesMediciones.agregarMedicion(id, promedio, desviacion);
        } catch (ClassNotFoundException | SQLException ex) {
            Logger.getLogger(ServidorMedicionesServer.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

   
    
    
}
