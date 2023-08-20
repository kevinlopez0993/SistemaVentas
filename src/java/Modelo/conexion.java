/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelo;

/**
 *
 * @author kevlo
 */

import java.sql.Connection;
import java.sql.DriverManager;

public class conexion {
    private final String baseDatos = "sis_bd";
    private final String servidor = "jdbc:mysql://localhost/" + baseDatos;
    private final String usuario = "root";
    private final String clave = "";
    
    public Connection conectar(){
        Connection cn = null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            cn = DriverManager.getConnection(servidor, usuario, clave);
        }catch(Exception e){
            System.out.println("Error al conectar" + e.getMessage());
        }
        return cn;
    }

}