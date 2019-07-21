/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppMedicionSisimica;

import Framework.AbstractApp;
import Framework.Disparador;
import Framework.LecturaPorEvento;

/**
 *
 * @author Crist
 */
public class appMedicionSisimica extends AbstractApp{

    @Override
    public void crearSistemaMedicion() {
        FabricaSismografo miFabrcia = new FabricaSismografo();
        Disparador disparador = new Disparador(new LecturaPorEvento(), miFabrcia);
        FrameSismico frmSismico = new FrameSismico(disparador);
        miFabrcia.Settings(frmSismico.getEscala(), frmSismico.getAlarma());
        frmSismico.setVisible(true);
    }
    public static void main(String[] args){
        appMedicionSisimica Medicion = new appMedicionSisimica();
        Medicion.crearSistemaMedicion();
    }
    
}
