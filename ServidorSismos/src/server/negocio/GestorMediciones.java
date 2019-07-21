/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.negocio;

import java.sql.SQLException;
import java.util.ArrayList;

/**
 *
 * @author faber
 */
public class GestorMediciones {
   // ArrayList<MedicionSismo> listado;
    private final ConectorJdbc conector;
    
    public GestorMediciones() {
       // listado = new ArrayList();
        conector = new ConectorJdbc();
        
    }
    
    
   // public ArrayList<MedicionSismo> getListado(){
    //    return (ArrayList<MedicionSismo>) listado;
   // }
    
  /*  public ArrayList<MedicionSismo> consultarMediciones() throws ClassNotFoundException, SQLException{
        //TODO Buscar        
          
        conector.conectarse();
        conector.crearConsulta("SELECT * FROM MEDICIONES;");
        ArrayList<MedicionSismo> sismos = new ArrayList();

        while (conector.getResultado().next()) {
            MedicionSismo sis = new MedicionSismo(conector.getResultado().getString("idEstacion"), conector.getResultado().getString("promedio"), conector.getResultado().getString("desviacion"));
            sismos.add(sis);
        }
        conector.desconectarse();
        return sismos;
    }*/
 
    /**
     * agrega un sismo a la base de datos
     *
     * @param idEstacion
     * @param promedio
     * @param desviacion
     * @throws ClassNotFoundException
     * @throws SQLException
     */
    public void agregarMedicion(String idEstacion, String promedio, String desviacion) throws ClassNotFoundException, SQLException {
        System.out.println("Entra agregar mediciones");
        conector.conectarse();
        conector.crearConsulta("INSERT INTO MEDICION VALUES ("
                    +"'"+idEstacion+"','"+promedio+"','"+desviacion+"')");
        conector.desconectarse();

    }
    
}
