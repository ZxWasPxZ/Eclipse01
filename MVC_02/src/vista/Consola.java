/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;
import modelo.Academia;
/**
 *
 * @author antonio.jose
 */
public class Consola {
    public void mostrarDatos(){
        Academia juanxxiii = new Academia("Juan XXIII", 800, "Gonzalo de Tomas", 25.50f);
        
        System.out.println("Nombre: "+juanxxiii.getNombre());
    }
}
