/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package co.edu.sena.tallerreportes.persistence;
import co.edu.sena.tallerreportes.model.LateArrival;
import java.util.List;

/**
 *
 * @author Aprendiz
 */
public interface ILateArrivalDAO {
    public LateArrival findById(Integer Id) throws Exception;
    public List<LateArrival> findAll() throws Exception;
    public List<ApprenticeCount1> findQuantityDocument() throws Exception;
}
