/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.tallerreportes.persistence;



import co.edu.sena.tallerreportes.model.LateArrival;
import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Aprendiz
 */
public class LateArrivalDAO implements ILateArrivalDAO {

    @Override
    public LateArrival findById(Integer Id) throws Exception {
        try {
            return EntityManagerHelper.getEntityManager().find(LateArrival.class, Id);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public List<LateArrival> findAll() throws Exception {
         try {
            Query query= EntityManagerHelper.getEntityManager().createNamedQuery("LateArrival.findAll");
            return query.getResultList();
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public List<ApprenticeCount1> findQuantityDocument() throws Exception {
       try {
            Query query= EntityManagerHelper.getEntityManager().createQuery("SELECT NEW co.edu.sena.mavenexamples.model.ApprenticeCount( l.documentApprentice.document, COUNT(l.id)) FROM LateArrival l  GROUP BY l.documentApprentice.document" );
            return(List<ApprenticeCount1>) query.getResultList();
        } catch (RuntimeException e) {
            throw e;
        } 
    }
    
}
