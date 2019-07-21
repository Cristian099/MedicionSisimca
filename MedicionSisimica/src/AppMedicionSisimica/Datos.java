/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package AppMedicionSisimica;

/**
 *
 * @author Crist
 */
class Datos {
    private double promedio;
    private double desviacion;

    public Datos(double promedio, double desviacion) {
        this.promedio = promedio;
        this.desviacion = desviacion;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public double getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(double desviacion) {
        this.desviacion = desviacion;
    }
    
    
}
