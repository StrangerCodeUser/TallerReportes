/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.tallerreportes.persistence;
import co.edu.sena.tallerreportes.model.Course;

import java.util.List;

/**
 *
 * @author Aprendiz
 */
public interface ICourseDAO {
    public Course findById(Integer id) throws Exception; 
    public List<Course> findAll() throws Exception;
}
