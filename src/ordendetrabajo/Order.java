/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ordendetrabajo;

import java.util.Date;

/**
 *
 * @author LENOVO
 */
public class Order {
    private String name;
    private String surname;
    private float dni;
    private Date fechacreacion;
    private float cellNumber;
    private String artifact;
    private String description;
    private double price;
    
    public Order(double price, String name) {
        this.price = price;
        this.name = name;
    }

    /**
     * @return the name
     */
    public String getName() {
        return name;
    }

    /**
     * @param name the name to set
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * @return the surname
     */
    public String getSurname() {
        return surname;
    }

    /**
     * @param surname the surname to set
     */
    public void setSurname(String surname) {
        this.surname = surname;
    }

    /**
     * @return the dni
     */
    public float getDni() {
        return dni;
    }

    /**
     * @param dni the dni to set
     */
    public void setDni(float dni) {
        this.dni = dni;
    }

    /**
     * @return the fechacreacion
     */
    public Date getFechacreacion() {
        return fechacreacion;
    }

    /**
     * @param fechacreacion the fechacreacion to set
     */
    /*
    public void setFechacreacion(Date fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
*/

    /**
     * @return the cellNumber
     */
    public float getCellNumber() {
        return cellNumber;
    }

    /**
     * @param cellNumber the cellNumber to set
     */
    public void setCellNumber(float cellNumber) {
        this.cellNumber = cellNumber;
    }

    /**
     * @return the artifact
     */
    public String getArtifact() {
        return artifact;
    }

    /**
     * @param artifact the artifact to set
     */
    public void setArtifact(String artifact) {
        this.artifact = artifact;
    }

    /**
     * @return the description
     */
    public String getDescription() {
        return description;
    }

    /**
     * @param description the description to set
     */
    public void setDescription(String description) {
        this.description = description;
    }

    /**
     * @return the price
     */
    public double getPrice() {
        return price;
    }

    /**
     * @param price the price to set
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
