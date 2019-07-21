/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package server.negocio;

/**
 *
 * @author faber
 */
public class MedicionSismo {
    private String idEstacion;
    private String valorPromedioSismo;
    private String desviacion;

    public MedicionSismo(String idEstacion, String valorPromedioSismo, String desviacion) {
        this.idEstacion = idEstacion;
        this.valorPromedioSismo = valorPromedioSismo;
        this.desviacion = desviacion;
    }

    public String getIdEstacion() {
        return idEstacion;
    }

    public void setIdEstacion(String idEstacion) {
        this.idEstacion = idEstacion;
    }

    public String getValorPromedioSismo() {
        return valorPromedioSismo;
    }

    public void setValorPromedioSismo(String valorPromedioSismo) {
        this.valorPromedioSismo = valorPromedioSismo;
    }

    public String getDesviacion() {
        return desviacion;
    }

    public void setDesviacion(String desviacion) {
        this.desviacion = desviacion;
    }

    @Override
    public String toString() {
        return super.toString(); //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
}
