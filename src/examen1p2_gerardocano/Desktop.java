/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Desktop extends PC {
    private int ram,storage;
    private String tipostor, GPU;

    public Desktop(int ram, int storage, String tipostor, String GPU) {
        this.ram = ram;
        this.storage = storage;
        this.tipostor = tipostor;
        this.GPU = GPU;
    }

    public Desktop() {
        super();
    }

    public int getRam() {
        return ram;
    }

    public void setRam(int ram) {
        this.ram = ram;
    }

    public int getStorage() {
        return storage;
    }

    public void setStorage(int storage) {
        this.storage = storage;
    }

    public String getTipostor() {
        return tipostor;
    }

    public void setTipostor(String tipostor) {
        this.tipostor = tipostor;
    }

    public String getGPU() {
        return GPU;
    }

    public void setGPU(String GPU) {
        this.GPU = GPU;
    }
    
}
