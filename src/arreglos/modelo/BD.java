/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arreglos.modelo;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author christian
 */
public class BD {
    Connection conexion;
    String url="C:\\Users\\christian\\Documents\\2a.db";
    
    public BD(){
        try {
            conexion = DriverManager.getConnection("jdbc:sqlite:"+url);
            if(conexion != null){
                System.out.println("conexion correcta");
            }else{
                System.out.println("no hay conexion");
            }
        } catch (SQLException ex) {
            System.out.println("error de conexion");
            Logger.getLogger(BD.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}
