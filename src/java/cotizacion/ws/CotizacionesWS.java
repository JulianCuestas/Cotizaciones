/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion.ws;

import cotizacion.dto.CotizacionRemote;
import cotizacion.dto.RtaCotizacionDTO;
import javax.ejb.EJB;
import javax.jws.WebService;
import javax.jws.WebMethod;
import javax.jws.WebParam;

/**
 *
 * @author Julian DCJ
 */
@WebService(serviceName = "CotizacionesWS")
public class CotizacionesWS {
    
    @EJB
    private CotizacionRemote cotizacionRemote;
    
    /**
     * @param montoSolicitado
     * @return 
     */
    @WebMethod(operationName = "generarCotizacion")
    public RtaCotizacionDTO generarCotizacion(@WebParam(name = "montoSolicitado") double montoSolicitado) {
        return cotizacionRemote.generarCotizacion(montoSolicitado);
    }
}
