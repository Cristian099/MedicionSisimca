/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;

import Framework.LecturaSensor;

/**
 *
 * @author ahurtado
 */
public abstract class Sensor {
    private LecturaSensor lectura; 
    public void actualizar(){
       // Metodo hook a ser redefinido      
    }
    
    public Sensor(LecturaSensor lec){
        this.lectura = lec;
        lec.setSensor(this);
    }
    
    public double leer(){
        return lectura.leer();
    }

    public double obtenerMedida() {
        return 0.0;
    }

    /**
     * @param lectura the lectura to set
     */
    public void setLectura(LecturaSensor lectura) {
        this.lectura = lectura;
        lectura.setSensor(this);
    }
}
