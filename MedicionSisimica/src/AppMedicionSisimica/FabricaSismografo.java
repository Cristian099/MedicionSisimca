/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppMedicionSisimica;

import Framework.ItemMedicion;
import Framework.LecturaSimple;
import javax.swing.JLabel;
import javax.swing.JTextField;

/**
 *
 * @author Crist
 */
public class FabricaSismografo extends Framework.FabricaItemMedicion {
    JTextField Escala = null;
    JLabel Alarma = null;
    
    public FabricaSismografo() {
    }
    public void Settings(JTextField escala , JLabel alarma){
        this.Alarma = alarma;
        this.Escala = escala;
    }
    @Override
    public ItemMedicion crearItemMedicion() {
        ItemMedicion medSisimica = new  ItemMedicionMS();
        medSisimica.setSensor(new SensorSismico(new LecturaSimple(),Escala));
        medSisimica.setActuador(new Alarma(Alarma));
        return medSisimica;
    }
    
}
