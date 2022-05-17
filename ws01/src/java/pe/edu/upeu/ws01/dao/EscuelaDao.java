/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package pe.edu.upeu.ws01.dao;

import java.util.List;
import pe.edu.upeu.ws01.model.Escuela;


/**
 *
 * @author Copito
 */
public interface EscuelaDao {
    int create(Escuela post);
    int update(Escuela post);
    int delete(int id);
    Escuela read(int id);
    List<Escuela> readAll();
}
