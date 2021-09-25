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
public class Bateria extends partes {
    int auto;
    String mate;

    public Bateria(int auto, String mate, int tiempo) {
        super(tiempo);
        this.auto = auto;
        this.mate = mate;
    }

    public int getAuto() {
        return auto;
    }

    public void setAuto(int auto) {
        this.auto = auto;
    }

    public String getMate() {
        return mate;
    }

    public void setMate(String mate) {
        this.mate = mate;
    }

    @Override
    public String toString() {
        return "Bateria{" + "auto=" + auto + ", mate=" + mate + '}';
    }
    
}
