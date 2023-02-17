/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package examen1p2_gerardocano;

/**
 *
 * @author gcano
 */
public class PC {
    protected String ip,hostname,mask;

    public PC(String ip, String hostname, String mask) {
        this.ip = ip;
        this.hostname = hostname;
        this.mask = mask;
    }

    public PC() {
    }

    public String getIp() {
        return ip;
    }

    public void setIp(String ip) {
        this.ip = ip;
    }

    public String getHostname() {
        return hostname;
    }

    public void setHostname(String hostname) {
        this.hostname = hostname;
    }

    public String getMask() {
        return mask;
    }

    public void setMask(String mask) {
        this.mask = mask;
    }
    
    
}
