/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Vista.Loq_Insertar;
import java.sql.*;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import static javax.swing.UIManager.getInt;

/**
 *
 * @author ESTACION 4
 */
public class Numero {
    public int c;
    String label;

    public void NumeroR() throws SQLException{
        conectar cc= new conectar();
    Connection cn= cc.conexion();

    String query= ("select max(nregistro) from muestras");
    Statement pst = cn.prepareStatement(query);
    ResultSet ResultSet =pst.executeQuery(query);
            while(ResultSet.next()){
            c =getInt(1);
            System.out.println(c);
            label = String.valueOf(c);
        }
        
       
}


}


