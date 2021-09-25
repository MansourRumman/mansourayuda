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
public class Asientos extends partes  {
    String mate;
    boolean tipo;
    boolean masaje;

    public Asientos(String mate, boolean tipo, boolean masaje, int tiempo) {
        super(tiempo);
        this.mate = mate;
        this.tipo = tipo;
        this.masaje = masaje;
    }

    public String getMate() {
        return mate;
    }

    public void setMate(String mate) {
        this.mate = mate;
    }

    public boolean isTipo() {
        return tipo;
    }

    public void setTipo(boolean tipo) {
        this.tipo = tipo;
    }

    public boolean isMasaje() {
        return masaje;
    }

    public void setMasaje(boolean masaje) {
        this.masaje = masaje;
    }

    @Override
    public String toString() {
        return "Asientos{" + "mate=" + mate + ", tipo=" + tipo + ", masaje=" + masaje + '}';
    }
 
}
