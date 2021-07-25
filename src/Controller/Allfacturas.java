/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

/**
 *
 * @author Asus
 */
public class Allfacturas {
    private int id_factura; 
    private String fecha_factura; 
    private String RFC; 


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
     * @return the fecha_factura
     */
    public String getFecha_factura() {
        return fecha_factura;
    }

    /**
     * @param fecha_factura the fecha_factura to set
     */
    public void setFecha_factura(String fecha_factura) {
        this.fecha_factura = fecha_factura;
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



    
}
