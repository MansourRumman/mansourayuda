/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labexamen2_mansourrumman;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author manso
 */
public class adesam {
 private ArrayList<ensamblador> listaPersonas = new ArrayList();
    private File archivo = null;

    public adesam(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<ensamblador> getListaPersonas() {
        return listaPersonas;
    }

    public void setListaPersonas(ArrayList<ensamblador> listaPersonas) {
        this.listaPersonas = listaPersonas;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaPersonas;
    }

    public void setPersona(ensamblador h) {
        this.listaPersonas.add(h);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, true);
            bw = new BufferedWriter(fw);
            for (ensamblador t : listaPersonas) {
                bw.write(t.getID()+";");
                bw.write(t.getNombre() + ";");
                bw.write(t.getGenero() + ";");                
                bw.write(t.getEdad() + ";");
                bw.write(t.getVe() + ";");                
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

public void cargarArchivo() {
        Scanner sc = null;
        listaPersonas = new ArrayList();
        if (archivo.exists()) {
            try {
                sc = new Scanner(archivo);
                sc.useDelimiter(";");
                while (sc.hasNext()) {
                    listaPersonas.add(new ensamblador(sc.nextInt(),sc.nextInt(),sc.next(),sc.next(),sc.nextInt()));
                }
            } catch (Exception ex) {
            }
            sc.close();
        }//FIN IF
    }
}
