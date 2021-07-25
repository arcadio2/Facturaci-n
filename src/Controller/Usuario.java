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
public class Usuario {
    private String nombre; 
    private String appat; 
    private String apmat;
    private int sexo; 
    private int estadoCivil; 
    private String telefono; 
    private String fecha; 
    private String correo;
    private String RFC; 
    private int edad;

 
    public String getNombre() {
        return nombre;
    }

 
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

 
    public String getAppat() {
        return appat;
    }

 
    public void setAppat(String appat) {
        this.appat = appat;
    }


    public String getApmat() {
        return apmat;
    }


    public void setApmat(String apmat) {
        this.apmat = apmat;
    }

 
    public int getSexo() {
        return sexo;
    }

 
    public void setSexo(int sexo) {
        this.sexo = sexo;
    }


    public int getEstadoCivil() {
        return estadoCivil;
    }


    public void setEstadoCivil(int estadoCivil) {
        this.estadoCivil = estadoCivil;
    }


    public String getTelefono() {
        return telefono;
    }

 
    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }


    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }


    public String getCorreo() {
        return correo;
    }

    
    public void setCorreo(String correo) {
        this.correo = correo;
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
     * @return the edad
     */
    public int getEdad() {
        return edad;
    }

    /**
     * @param edad the edad to set
     */
    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    
    
}
