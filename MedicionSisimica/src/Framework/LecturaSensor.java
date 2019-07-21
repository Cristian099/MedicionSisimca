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
public abstract class LecturaSensor {
    protected Sensor sensor;
    public LecturaSensor(Sensor sensor){
        this.sensor = sensor;
    }
    public double leer(){return sensor.obtenerMedida();}

    void setSensor(Sensor sensor) {
        this.sensor = sensor;
    }
}
