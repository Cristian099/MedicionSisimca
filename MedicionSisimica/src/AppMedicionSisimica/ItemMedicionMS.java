/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppMedicionSisimica;

import Framework.ItemMedicion;

/**
 *
 * @author Crist
 */
public class ItemMedicionMS extends ItemMedicion {
    double valor;
    double promedio;
    double desviacion;
    int cantSensores = 4;
    public ItemMedicionMS() {
    }
    
    @Override
    protected void hacerLeerSensor() {
        double[]  registro = new double[cantSensores];
        for(int i = 0 ; i < cantSensores;i++){
            registro[i] = this.miSensor.leer();
        }
        promedio = calcPromedio(registro);
        desviacion = calcDesviacion(registro);
    }

    @Override
    protected void hacerAlmacenarResultado() {
        //Perroo aqui toca meter lo de la bd
        /**TODO*/
    }

    @Override
    protected boolean hacerCompararValores() {
        System.out.println(""+valor);
        return valor > 7;
    }

    @Override
    protected void hacerEjecutarAcciones() {
        this.miActuador.actuar();
    }

    private double calcPromedio(double[] registro) {
        double sum = 0;
        for(int i = 0 ; i < registro.length; i++){
            sum += registro[i];
        }
        return sum/registro.length;
    }

    private double calcDesviacion(double[] registro) {
        double sum = 0;
        for(int i = 0 ; i < registro.length ; i++){
            sum += Math.pow(registro[i]-this.promedio, 2);
        }
        return Math.sqrt(sum/(registro.length-1));
    }
    
}
