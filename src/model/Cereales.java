/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PanchitoKUN
 */
public class Cereales extends Producto{
 
    private int id_cereales; 
    private int fecha_de_vencimiento; 
    private String sabor_cereales; 
    private int kg_cerales; 
 private String marca ; 

    public Cereales() {
    }

    public Cereales(int id_cereales, int fecha_de_vencimiento, String sabor_cereales, int kg_cerales, String marca) {
        this.id_cereales = id_cereales;
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.sabor_cereales = sabor_cereales;
        this.kg_cerales = kg_cerales;
        this.marca = marca;
    }

    public Cereales(int id_cereales, int fecha_de_vencimiento, String sabor_cereales, int kg_cerales, String marca, int id, String nombre, String descripcion, int stock, int precio, String sellos) {
        super(id, nombre, descripcion, stock, precio, sellos);
        this.id_cereales = id_cereales;
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.sabor_cereales = sabor_cereales;
        this.kg_cerales = kg_cerales;
        this.marca = marca;
    }

    public int getId_cereales() {
        return id_cereales;
    }

    public void setId_cereales(int id_cereales) {
        this.id_cereales = id_cereales;
    }

    public int getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(int fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public String getSabor_cereales() {
        return sabor_cereales;
    }

    public void setSabor_cereales(String sabor_cereales) {
        this.sabor_cereales = sabor_cereales;
    }

    public int getKg_cerales() {
        return kg_cerales;
    }

    public void setKg_cerales(int kg_cerales) {
        this.kg_cerales = kg_cerales;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }
 
 
 
    
    
    
    
    
}
