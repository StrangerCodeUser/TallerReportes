/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.tallerreportes.controller;



import co.edu.sena.tallerreportes.model.LateArrival;
import co.edu.sena.tallerreportes.persistence.DAOFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;


/**
 *
 * @author Aprendiz
 */
public class LateArrivalController {
    public LateArrival findById(Integer id) throws Exception
    {
        if(id== 0)
        {
            throw new Exception("El documento es obligatorio");
            
        }
        return DAOFactory.getLateArrivalDAO().findById(id);
    }
    public List<LateArrival> findAll() throws Exception
    {
        return DAOFactory.getLateArrivalDAO().findAll();
    }
     public List<ApprenticeCount1> findQuantityDocument() throws Exception
    {
        return DAOFactory.getLateArrivalDAO().findQuantityDocument();
    }
    
}
