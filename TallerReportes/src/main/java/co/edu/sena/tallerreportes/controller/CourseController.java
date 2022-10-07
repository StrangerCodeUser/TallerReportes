/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.tallerreportes.controller;


import co.edu.sena.tallerreportes.model.Course;
import co.edu.sena.tallerreportes.persistence.DAOFactory;
import java.io.File;
import java.io.FileOutputStream;
import java.util.List;


/**
 *
 * @author Aprendiz
 */
public class CourseController {

    public Course findById(Integer id) throws Exception {
        if (id == 0) {
            throw new Exception("El documento es obligatorio");

        }
        return DAOFactory.getCourseDAO().findById(id);
    }

    public List<Course> findAll() throws Exception {
        return DAOFactory.getCourseDAO().findAll();
    }

  
}
