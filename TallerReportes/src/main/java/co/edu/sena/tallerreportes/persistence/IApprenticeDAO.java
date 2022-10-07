/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.tallerreportes.persistence;



import co.edu.sena.tallerreportes.model.Apprentice;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public interface IApprenticeDAO {
    public Apprentice findById(Long document) throws Exception;
    public List<Apprentice> findAll() throws Exception;
}
