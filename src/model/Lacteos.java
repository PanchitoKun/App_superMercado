/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author PanchitoKUN
 */
public class Lacteos extends Producto{
    private int id_lacteos; 
    private int fecha_de_vencimiento; 
    private String sabor_leche; 
    private String marca; 
private double litros; 

    public Lacteos() {
        
    }

    public Lacteos(int id_lacteos, int fecha_de_vencimiento, String sabor_leche, String marca, double litros) {
        this.id_lacteos = id_lacteos;
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.sabor_leche = sabor_leche;
        this.marca = marca;
        this.litros = litros;
    }

    public Lacteos(int id_lacteos, int fecha_de_vencimiento, String sabor_leche, String marca, double litros, int id, String nombre, String descripcion, int stock, int precio, String sellos) {
        super(id, nombre, descripcion, stock, precio, sellos);
        this.id_lacteos = id_lacteos;
        this.fecha_de_vencimiento = fecha_de_vencimiento;
        this.sabor_leche = sabor_leche;
        this.marca = marca;
        this.litros = litros;
    }

    public int getId_lacteos() {
        return id_lacteos;
    }

    public void setId_lacteos(int id_lacteos) {
        this.id_lacteos = id_lacteos;
    }

    public int getFecha_de_vencimiento() {
        return fecha_de_vencimiento;
    }

    public void setFecha_de_vencimiento(int fecha_de_vencimiento) {
        this.fecha_de_vencimiento = fecha_de_vencimiento;
    }

    public String getSabor_leche() {
        return sabor_leche;
    }

    public void setSabor_leche(String sabor_leche) {
        this.sabor_leche = sabor_leche;
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
