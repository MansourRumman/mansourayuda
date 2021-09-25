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
public class adcarros {
    private ArrayList<carros> listaVehiculos = new ArrayList();
    private File archivo = null;

    public adcarros(String path) {
        archivo = new File(path);
    }

    public File getArchivo() {
        return archivo;
    }
    

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }

    public ArrayList<carros> getListaPersonas() {
        return listaVehiculos;
    }

    public void setListaPersonas(ArrayList<carros> listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    @Override
    public String toString() {
        return "listaPersonas=" + listaVehiculos;
    }

    //extra mutador
    public void setPersona(carros m) {
        this.listaVehiculos.add(m);
    }

    //metodos de administracion
    public void escribirArchivo() throws IOException {
        FileWriter fw = null;
        BufferedWriter bw = null;
        try {
            fw = new FileWriter(archivo, false);
            bw = new BufferedWriter(fw);
            for (carros t : listaVehiculos) {
                bw.write(t.getVin()+";");
                bw.write(t.getColor() + ";");
                bw.write(t.getBat().getAuto() + ","+t.getBat().getMate() + ","+t.getBat().getTiempo() + ";");                
                bw.write(t.getCc().getTipo() + ","+t.getCc().getCap() + ","+t.getCc().getTiempo() + ";");
                bw.write(t.getInt().getMat() + ","+t.getInt().getTipo() + ","+t.getInt().getBot() + ","+t.getInt().getTiempo() + ";");
                bw.write(t.getAsi().getMate()+","+t.getAsi().isTipo()+","+t.getAsi().isMasaje()+","+t.getAsi().getTiempo()+";");
                bw.write(t.getAudi().getNombre()+","+t.getAudi().isVisor()+","+t.getAudi().getAncho()+","+t.getAudi().getTiempo()+";");
            }
            bw.flush();
        } catch (Exception ex) {
        }
        bw.close();
        fw.close();
    }

    public void cargarArchivo() {
        Scanner s = null;
        listaVehiculos = new ArrayList();
        if (archivo.exists()) {
            try {
                s = new Scanner(archivo);
                s.useDelimiter(";");
                while (s.hasNext()) {
                    listaVehiculos.add(new carros(s.next(),s.next(),new Bateria(s.nextInt(),s.next(),s.nextInt()), new Carroceria(s.next(),s.nextInt(),s.nextInt()), new Interior(s.next(),s.next(),s.nextInt(),s.nextInt()), new Audio(s.next(),s.next().equalsIgnoreCase("true"),s.nextInt(),s.nextInt()), new Asientos(s.next(),s.next().equalsIgnoreCase("true"),s.next().equalsIgnoreCase("true"),s.nextInt())));
                }
            } catch (Exception ex) {
            }
            s.close();
        }//FIN IF
    }
}
