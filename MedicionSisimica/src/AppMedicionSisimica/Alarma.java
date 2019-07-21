/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppMedicionSisimica;

import Framework.Actuador;
import javax.swing.JLabel;

/**
 *
 * @author Crist
 */
public class Alarma extends Actuador{
    JLabel Sirena;

    public Alarma() {
    }

    public Alarma(JLabel Sirena) {
        this.Sirena = Sirena;
    }
    

    @Override
    public void actuar() {
        Sirena.setText("Wiiiiuuu Wiuuuuu");//No se como putas suena una alarma :V
    }
    
}
