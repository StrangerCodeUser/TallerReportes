/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package co.edu.sena.tallerreportes.persistence;

/**
 *
 * @author Aprendiz
 */
public class DAOFactory {
    private static IApprenticeDAO apprenticeDAO= new ApprenticeDAO();
    private static ICourseDAO courseDAO= new CourseDAO();
    private static ILateArrivalDAO lateArrivalDAO= new LateArrivalDAO();

    public static IApprenticeDAO getApprenticeDAO() {
        return apprenticeDAO;
    }

    public static ICourseDAO getCourseDAO() {
        return courseDAO;
    }

    public static ILateArrivalDAO getLateArrivalDAO() {
        return lateArrivalDAO;
    }
    
}
