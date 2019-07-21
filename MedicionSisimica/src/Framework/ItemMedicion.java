/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Framework;
import Framework.Actuador;

/**
 *
 * @author ahurtado
 */
public abstract class ItemMedicion {
    protected Sensor miSensor;
    protected Actuador miActuador;

    public void setSensor(Sensor sensor) {
    miSensor=sensor;    
    }

    public void setActuador(Actuador actuador) {
    miActuador = actuador;
    }
    
    public void procesarMedicion(){
        hacerLeerSensor();
        hacerAlmacenarResultado();
        if(hacerCompararValores()){
            hacerEjecutarAcciones();
        }
        }        

    abstract protected void hacerLeerSensor();
    abstract protected void hacerAlmacenarResultado();
    abstract protected boolean hacerCompararValores();
    abstract protected void hacerEjecutarAcciones();
}
   
