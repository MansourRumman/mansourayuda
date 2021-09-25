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
public class Interior  extends partes{
    String mat,tipo;
    int bot;

    public Interior(String mat, String tipo, int bot, int tiempo) {
        super(tiempo);
        this.mat = mat;
        this.tipo = tipo;
        this.bot = bot;
    }

    public String getMat() {
        return mat;
    }

    public void setMat(String mat) {
        this.mat = mat;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public int getBot() {
        return bot;
    }

    public void setBot(int bot) {
        this.bot = bot;
    }

    @Override
    public String toString() {
        return "Interior{" + "mat=" + mat + ", tipo=" + tipo + ", bot=" + bot + '}';
    }
    
}
