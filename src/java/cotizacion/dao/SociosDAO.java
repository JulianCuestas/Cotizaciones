/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cotizacion.dao;

import cotizacion.dto.HibernateUtil;
import cotizacion.model.Socios;
import java.util.List;
import org.hibernate.Session;

/**
 *
 * @author Julian DCJ
 */
public class SociosDAO {
    private Session session;
    
    public Socios consultarSocioDisponible(double montoSolicitado){
        try{
            session = HibernateUtil.getSessionFactory().openSession();
            session.beginTransaction();
            List<Socios> lista = session.createQuery("SELECT s FROM Socios s WHERE s.montoDisponible > :montoSolicitado ORDER BY tasa ASC")
                    .setParameter("montoSolicitado", montoSolicitado).list();
            session.getTransaction().commit();
            session.close();
            if (!lista.isEmpty()) {
                return lista.get(0);
            }
        }catch(Exception e){
            System.err.println("Cotizaciones: ERROR al intentar listar los socios.");
            e.printStackTrace();
        }
        return null;
    }
}
