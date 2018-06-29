/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion.dto;

import javax.ejb.Remote;

/**
 *
 * @author Julian DCJ
 */
@Remote
public interface CotizacionRemote {
    
    /**
     * 
     * @param montoSolicitado
     * @return 
     */
    public RtaCotizacionDTO generarCotizacion(double montoSolicitado);
    
}
