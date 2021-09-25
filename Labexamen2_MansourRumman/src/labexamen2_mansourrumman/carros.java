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
public class carros {
     String vin,color;
    Bateria bat;
    Carroceria cc;
    Interior Int;
    Audio audi;
    Asientos asi;

    public carros(String vin, String color, Bateria bat, Carroceria cc, Interior Int, Audio audi, Asientos asi) {
        this.vin = vin;
        this.color = color;
        this.bat = bat;
        this.cc = cc;
        this.Int = Int;
        this.audi = audi;
        this.asi = asi;
    }

    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public Bateria getBat() {
        return bat;
    }

    public void setBat(Bateria bat) {
        this.bat = bat;
    }

    public Carroceria getCc() {
        return cc;
    }

    public void setCc(Carroceria cc) {
        this.cc = cc;
    }

    public Interior getInt() {
        return Int;
    }

    public void setInt(Interior Int) {
        this.Int = Int;
    }

    public Audio getAudi() {
        return audi;
    }

    public void setAudi(Audio audi) {
        this.audi = audi;
    }

    public Asientos getAsi() {
        return asi;
    }

    public void setAsi(Asientos asi) {
        this.asi = asi;
    }

    @Override
    public String toString() {
        return "partes{" + "vin=" + vin + ", color=" + color + ", bat=" + bat + ", cc=" + cc + ", Int=" + Int + ", audi=" + audi + ", asi=" + asi + '}';
    }
}
