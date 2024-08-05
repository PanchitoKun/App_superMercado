/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PanchitoKUN
 */
public class Bebidas extends Producto{
    private int id_bebidas; 
    private int fecha_de_vencimiento; 
    private  String sabor_bebida; 
    private String marca; 
private double litros; 

    public Bebidas() {
    }

    public Bebidas(int id_bebidas, int fecha_de_vencimiento, String sabor_bebida, String marca, double litros, int id, String nombre, String descripcion, int stock, int precio) {
        super(id, nombre, descripcion, stock, precio);
        this.id_bebidas = id_bebidas;
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.sabor_bebida = sabor_bebida;
        this.marca = marca;
        this.litros = litros;
    }

    

  

    public int getId_bebidas() {
        return id_bebidas;
    }

    public void setId_bebidas(int id_bebidas) {
        this.id_bebidas = id_bebidas;
    }

    public int getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(int fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public String getSabor_bebida() {
        return sabor_bebida;
    }

    public void setSabor_bebida(String sabor_bebida) {
        this.sabor_bebida = sabor_bebida;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public double getLitros() {
        return litros;
    }

    public void setLitros(double litros) {
        this.litros = litros;
    }


   
    
}
