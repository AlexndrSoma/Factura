/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package factura;

/**
 *
 * @author alex
 */

//CLASE

public class Factura {
    
    private String Nombre;
    
    private int Cantidad;
    
    private int Costo;
    
//OBJETO
    
public Factura(String Name, int Cant, int Cost){
        this.Nombre = Name;
        this.Cantidad = Cant;
        this.Costo = Cost;          
    }
 


//SETTERS

 public void setNombre(String Name) {
        this.Nombre = Name;
    }

    public void setCantidad(int Cant) {
        this.Cantidad = Cant;
    }

    public void setCosto(int Cost) {
        this.Costo = Cost;
    }
    
    //GETTERS
    
    public String getNombre() {
        return this.Nombre;  
    }
    
    public int getCantidad() {
        return this.Cantidad;  
    }
    
    public int getCosto() {
        return this.Costo;  
    }

    


    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        
        // TODO code application logic here
    }
    
}
