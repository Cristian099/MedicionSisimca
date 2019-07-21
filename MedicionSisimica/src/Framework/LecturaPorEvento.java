/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

/**
 *
 * @author ahurtado
 */
public class LecturaPorEvento extends LecturaSensor{
    Sensor miSensor;

    public LecturaPorEvento(Sensor sensor) {
        super(sensor);
    }
    
    public LecturaPorEvento() {
        super(null);
    }

    void addSensor(Sensor sensor) {
        this.miSensor = sensor;
    }

    public void notificar(){
        miSensor.actualizar();
    }
    
    @Override
    public double leer(){
        return miSensor.obtenerMedida();
    }
    
    
}
