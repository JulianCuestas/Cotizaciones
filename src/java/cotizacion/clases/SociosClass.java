/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion.clases;

import cotizacion.dao.SociosDAO;
import cotizacion.dto.CotizacionRemote;
import cotizacion.dto.RtaCotizacionDTO;
import cotizacion.model.Socios;
import javax.ejb.Stateless;

/**
 *
 * @author Julian DCJ
 */
@Stateless
public class SociosClass implements CotizacionRemote {

    private SociosDAO sociosDAO;
    
    private RtaCotizacionDTO rtaCotizacionDTO;

    @Override
    public RtaCotizacionDTO generarCotizacion(double montoSolicitado) {
        rtaCotizacionDTO = new RtaCotizacionDTO();
        Socios socio = sociosDAO.consultarSocioDisponible(montoSolicitado);

        if (socio != null) {
            double valorCuotaMensual;
            double VF;//Valor Futuro
            double VA = montoSolicitado;//Valor Actual
            double i = socio.getTasa();//Tasa de interés
            int n = 36;//Periodo de tiempo en Meses

            VF = VA * (1 + n * i);
            valorCuotaMensual = VF/n;
            System.out.println("TASA INTERES: "+i);
            System.out.println("VALOR FUTURO: "+VF);
            System.out.println("VALOR CUOTA MENSUAL: "+i);
            
            this.rtaCotizacionDTO.setNombreSocio(socio.getNombreSocio());
            this.rtaCotizacionDTO.setPagoTotalCredito(VF);
            this.rtaCotizacionDTO.setTasaInteres(socio.getTasa());
            this.rtaCotizacionDTO.setValorCuotaMensual(valorCuotaMensual);
            
            this.setearCodigoRespuesta("000", "Cotización realizada exitosamente.");
        }else{
            this.setearCodigoRespuesta("005", "No hay socio disponible para el monto solicitado.");
        }
        return rtaCotizacionDTO;
    }
    
    private void setearCodigoRespuesta(String codigo, String mensajeRta){
        rtaCotizacionDTO.setCodigoRespuesta(codigo);
        rtaCotizacionDTO.setMensajeRespuesta(mensajeRta);
    }
    
}
