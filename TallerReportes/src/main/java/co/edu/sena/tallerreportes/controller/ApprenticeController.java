/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.tallerreportes.controller;


import co.edu.sena.tallerreportes.model.Apprentice;
import co.edu.sena.tallerreportes.persistence.DAOFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;
import java.util.Properties;

import org.eclipse.persistence.sessions.Session;

/**
 *
 * @author Aprendiz
 */
public class ApprenticeController {
    public Apprentice findById(Long document) throws Exception
    {
        if(document== 0)
        {
            throw new Exception("El documento es obligatorio");
            
        }
        return DAOFactory.getApprenticeDAO().findById(document);
    }
    public List<Apprentice> findAll() throws Exception
    {
        return DAOFactory.getApprenticeDAO().findAll();
    }
    public String setMessage() throws Exception
    {
        String message="";
        try {
          List<Apprentice>   apprentices= findAll();
          message ="<p>Cordial saludo ahí le envío los que van para plan de mejora</p> "
                  +"<table border='1'>"+"<tr><th>Documento</th><th>Nombre</th><th>Programa</th></tr>";
            for (Apprentice apprentice : apprentices) {
                message +="<tr>"+"<td>"+apprentice.getDocument()+"</td>"+"<td>"+apprentice.getFullName()+"</td>"
                        +"<td>"+apprentice.getIdCourse().getCareer()+"</td>"+"</tr>";
            }
            message +="</table>";
        } catch (Exception e) {
            throw e;
        }
        return message;
    }
   
    
}
