/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.tallerreportes.persistence;

import co.edu.sena.tallerreportes.model.Apprentice;

import java.util.List;
import javax.persistence.Query;

/**
 *
 * @author Aprendiz
 */
public class ApprenticeDAO implements IApprenticeDAO {

    @Override
    public Apprentice findById(Long document) throws Exception {
        try {
            return EntityManagerHelper.getEntityManager().find(Apprentice.class, document);
        } catch (RuntimeException e) {
            throw e;
        }
    }

    @Override
    public List<Apprentice> findAll() throws Exception {
        try {
            Query query= EntityManagerHelper.getEntityManager().createNamedQuery("Apprentice.findAll");
            return query.getResultList();
        } catch (RuntimeException e) {
            throw e;
        }
    }
    
}
