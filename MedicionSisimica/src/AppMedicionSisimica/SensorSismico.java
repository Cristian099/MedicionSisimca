/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppMedicionSisimica;

import Framework.LecturaSensor;
import Framework.Sensor;
import javax.swing.JTextField;

/**
 *
 * @author Crist
 */
public class SensorSismico extends Sensor {
    private final JTextField Campo;
    public SensorSismico(LecturaSensor lector,JTextField campo) {
        super(lector);
        this.Campo = campo;
    }

    @Override
    public double obtenerMedida() {
        return Double.parseDouble(Campo.getText());
    }
    
    
}
