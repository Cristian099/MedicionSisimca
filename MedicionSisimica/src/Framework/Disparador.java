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
public class Disparador extends Sensor{
    FabricaItemMedicion fim;

    public Disparador(LecturaPorEvento lector, FabricaItemMedicion miFabrica) {
        super(lector);
        this.fim=miFabrica;
    }

    public Disparador() {
        super(null);
    }
    
    @Override
     public void actualizar(){
       fim.crearItemMedicion().procesarMedicion();
     }   
}
