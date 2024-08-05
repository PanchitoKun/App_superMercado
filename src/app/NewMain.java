/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package app;
import model.*; 
public class NewMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Producto o_Producto = new Producto(); 
        o_Producto.setId(1);
        o_Producto.setNombre("PAPAS");
        o_Producto.setDescripcion("xd" );
        o_Producto.setStock(3);
        o_Producto.setPrecio(4000);
        
        System.out.println("id: "+o_Producto.getId());
        System.out.println("Nombre: "+o_Producto.getNombre());
        System.out.println("Descripcion: "+o_Producto.getDescripcion());
        System.out.println("Stook: "+o_Producto.getStock());
        System.out.println("Precio: "+o_Producto.getPrecio());
        
        
     

        
        
    }
    
}
