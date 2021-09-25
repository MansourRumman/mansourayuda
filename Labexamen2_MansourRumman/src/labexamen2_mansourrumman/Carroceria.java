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
public class Carroceria extends partes {
    String tipo;
    int cap;

    public Carroceria(String tipo, int cap, int tiempo) {
        super(tiempo);
        this.tipo = tipo;
        this.cap = cap;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getCap() {
        return cap;
    }

    public void setCap(int cap) {
        this.cap = cap;
    }

    @Override
    public String toString() {
        return "Carroceria{" + "tipo=" + tipo + ", cap=" + cap + '}';
    }
    
}
