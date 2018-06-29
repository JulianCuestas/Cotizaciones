/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion.dto;

import java.io.Serializable;

/**
 *
 * @author Julian DCJ
 */
public class RtaCotizacionDTO implements Serializable{
    
    private static final long serialVersionUID = 1L;
    
    private String codigoRespuesta;
    private String nombreSocio;
    private double valorCuotaMensual;
    private double pagoTotalCredito;
    private double tasaInteres;
    
    private String mensajeRespuesta;

    public String getCodigoRespuesta() {
        return codigoRespuesta;
    }

    public void setCodigoRespuesta(String codigoRespuesta) {
        this.codigoRespuesta = codigoRespuesta;
    }

    public String getNombreSocio() {
        return nombreSocio;
    }

    public void setNombreSocio(String nombreSocio) {
        this.nombreSocio = nombreSocio;
    }

    public double getValorCuotaMensual() {
        return valorCuotaMensual;
    }

    public void setValorCuotaMensual(double valorCuotaMensual) {
        this.valorCuotaMensual = valorCuotaMensual;
    }

    public double getPagoTotalCredito() {
        return pagoTotalCredito;
    }

    public void setPagoTotalCredito(double pagoTotalCredito) {
        this.pagoTotalCredito = pagoTotalCredito;
    }

    public double getTasaInteres() {
        return tasaInteres;
    }

    public void setTasaInteres(double tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public String getMensajeRespuesta() {
        return mensajeRespuesta;
    }

    public void setMensajeRespuesta(String mensajeRespuesta) {
        this.mensajeRespuesta = mensajeRespuesta;
    }

    @Override
    public String toString() {
        return "RtaCotizacionDTO{" + "codigoRespuesta=" + codigoRespuesta + ", nombreSocio=" + nombreSocio + ", valorCuotaMensual=" + valorCuotaMensual + ", pagoTotalCredito=" + pagoTotalCredito + ", tasaInteres=" + tasaInteres + ", mensajeRespuesta=" + mensajeRespuesta + '}';
    }
    
}
