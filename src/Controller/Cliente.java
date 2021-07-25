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
public class Cliente {

    private String nombre;
    private String appat;
    private String apmat;
    private String correo;
    private int id_cliente;
    private boolean existe;

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
     * @return the appat
     */
    public String getAppat() {
        return appat;
    }

    /**
     * @param appat the appat to set
     */
    public void setAppat(String appat) {
        this.appat = appat;
    }

    /**
     * @return the apmat
     */
    public String getApmat() {
        return apmat;
    }

    /**
     * @param apmat the apmat to set
     */
    public void setApmat(String apmat) {
        this.apmat = apmat;
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
