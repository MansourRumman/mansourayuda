/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexamen2_mansourrumman;

public class ensamblador {

    int ID, edad;
    String nombre, genero;
    int ve;

    public ensamblador(int ID, int edad, String nombre, String genero, int ve) {
        this.ID = ID;
        this.edad = edad;
        this.nombre = nombre;
        this.genero = genero;
        this.ve = ve;
    }

    public ensamblador() {

    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getVe() {
        return ve;
    }

    public void setVe(int ve) {
        this.ve = ve;
    }

    @Override
    public String toString() {
        return "ensamblador{" + "ID=" + ID + ", edad=" + edad + ", nombre=" + nombre + ", genero=" + genero + ", ve=" + ve + '}';
    }

}
