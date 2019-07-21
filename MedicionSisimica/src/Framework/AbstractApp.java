/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;
import java.util.logging.Level;
import java.util.logging.Logger;
/**
 *
 * @author ahurtado
 */
public abstract class AbstractApp {  
    public abstract void crearSistemaMedicion();
     /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IllegalAccessException {
        try {
            ((AbstractApp) Class.forName(args[0]).newInstance()).crearSistemaMedicion();
        } catch (ClassNotFoundException | InstantiationException ex) {
            Logger.getLogger(AbstractApp.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
