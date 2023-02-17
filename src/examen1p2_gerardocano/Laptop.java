/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_gerardocano;

/**
 *
 * @author gcano
 */
public class Laptop extends PC{
    private String marca, res, RGB;

    public Laptop(String marca, String res, String RGB) {
        this.marca = marca;
        this.res = res;
        this.RGB = RGB;
    }

    public Laptop() {
    super();
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getRes() {
        return res;
    }

    public void setRes(String res) {
        this.res = res;
    }

    public String getRGB() {
        return RGB;
    }

    public void setRGB(String RGB) {
        this.RGB = RGB;
    }
    
}
