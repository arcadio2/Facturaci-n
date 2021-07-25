/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import java.util.ArrayList;

/**
 *
 * @author Asus
 */
public class Factura {
    private int id_cliente; 
    private int id_factura; 
    private String nombre; 
    private String apellido_m;
    private String apellido_p; 
    private String RFC; 
    private String fecha_facturacion; 
    private String correo; 
    private float subtotal; 
    private float descuento; 
    private float IVA; 
    private float TOTAL; 
    private boolean existe; 
    


    
    /**
     * @return the id_cliente
     */
    public int getId_cliente() {
        return id_cliente;
    }

    /**
     * @param id_cliente the id_cliente to set
     */
    public void setId_cliente(int id_cliente) {
        this.id_cliente = id_cliente;
    }

    /**
     * @return the id_factura
     */
    public int getId_factura() {
        return id_factura;
    }

    /**
     * @param id_factura the id_factura to set
     */
    public void setId_factura(int id_factura) {
        this.id_factura = id_factura;
    }

    /**
     * @return the nombre
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * @param nombre the nombre to set
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * @return the apellido_m
     */
    public String getApellido_m() {
        return apellido_m;
    }

    /**
     * @param apellido_m the apellido_m to set
     */
    public void setApellido_m(String apellido_m) {
        this.apellido_m = apellido_m;
    }

    /**
     * @return the apellido_p
     */
    public String getApellido_p() {
        return apellido_p;
    }

    /**
     * @param apellido_p the apellido_p to set
     */
    public void setApellido_p(String apellido_p) {
        this.apellido_p = apellido_p;
    }

    /**
     * @return the RFC
     */
    public String getRFC() {
        return RFC;
    }

    /**
     * @param RFC the RFC to set
     */
    public void setRFC(String RFC) {
        this.RFC = RFC;
    }

    /**
     * @return the correo
     */
    public String getCorreo() {
        return correo;
    }

    /**
     * @param correo the correo to set
     */
    public void setCorreo(String correo) {
        this.correo = correo;
    }

  


 
    public String getFecha_facturacion() {
        return fecha_facturacion;
    }

    /**
     * @param fecha_facturacion the fecha_facturacion to set
     */
    public void setFecha_facturacion(String fecha_facturacion) {
        this.fecha_facturacion = fecha_facturacion;
    }

    /**
     * @return the subtotal
     */
    public float getSubtotal() {
        return subtotal;
    }

    /**
     * @param subtotal the subtotal to set
     */
    public void setSubtotal(float subtotal) {
        this.subtotal = subtotal;
    }

    /**
     * @return the descuento
     */
    public float getDescuento() {
        return descuento;
    }

    /**
     * @param descuento the descuento to set
     */
    public void setDescuento(float descuento) {
        this.descuento = descuento;
    }

    /**
     * @return the IVA
     */
    public float getIVA() {
        return IVA;
    }

    /**
     * @param IVA the IVA to set
     */
    public void setIVA(float IVA) {
        this.IVA = IVA;
    }

    /**
     * @return the TOTAL
     */
    public float getTOTAL() {
        return TOTAL;
    }

    /**
     * @param TOTAL the TOTAL to set
     */
    public void setTOTAL(float TOTAL) {
        this.TOTAL = TOTAL;
    }

    /**
     * @return the existe
     */
    public boolean isExiste() {
        return existe;
    }

    /**
     * @param existe the existe to set
     */
    public void setExiste(boolean existe) {
        this.existe = existe;
    }



    
}
