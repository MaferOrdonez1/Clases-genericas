/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package generico;

/**
 *
 * @author mafer
 */
public class Generico <Z,M,P>{

    private Z zapatos;
    private M marca;
    private P precio;

    public Generico(Z zapatos, M marca, P precio) {
        this.zapatos = zapatos;
        this.marca = marca;
        this.precio = precio;
    }

    
    public Z getZapatos() {
        return zapatos;
    }

    public void setZapatos(Z zapatos) {
        this.zapatos = zapatos;
    }

    public M getMarca() {
        return marca;
    }

    public void setMarca(M marca) {
        this.marca = marca;
    }

    public P getPrecio() {
        return precio;
    }

    public void setPrecio(P precio) {
        this.precio = precio;
    }
    
    
    public static void main(String[] args) {
        
        Generico<String,Integer,Double> cliente1 = new Generico<String,Integer,Double>("Jordan",1,1900.99);
        System.out.println(cliente1);
        
        Generico<String,String,String> cliente2 = new Generico<String,String,String>("Jordan","Style","2002");
        System.out.println(cliente2);
    }
    
}
