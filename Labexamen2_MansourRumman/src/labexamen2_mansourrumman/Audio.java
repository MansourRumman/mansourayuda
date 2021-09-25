/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexamen2_mansourrumman;

/**
 *
 * @author manso
 */
public class Audio extends partes {
    String nombre;
    boolean visor;
    int ancho;

    public Audio(String nombre, boolean visor, int ancho, int tiempo) {
        super(tiempo);
        this.nombre = nombre;
        this.visor = visor;
        this.ancho = ancho;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isVisor() {
        return visor;
    }

    public void setVisor(boolean visor) {
        this.visor = visor;
    }

    public int getAncho() {
        return ancho;
    }

    public void setAncho(int ancho) {
        this.ancho = ancho;
    }

    @Override
    public String toString() {
        return "Audio{" + "nombre=" + nombre + ", visor=" + visor + ", ancho=" + ancho + '}';
    }

}
