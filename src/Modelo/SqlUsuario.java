/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.sql.PreparedStatement;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author ESTACION 4
 */
public class SqlUsuario extends conectar{
    public boolean registrar(usuario usr)
    {
        
        PreparedStatement ps = null;
         conectar cc= conectar();
         
      //   String sql = 
        return false;
        
        
    }

    private conectar conectar() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
    public boolean esEmail(String correo) {
		
        // Patrón para validar el email
        Pattern pattern = Pattern.compile("^[_A-Za-z0-9-\\+]+(\\.[_A-Za-z0-9-]+)*@" + "[A-Za-z0-9-]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$");
		
        Matcher mather = pattern.matcher(correo);
		
        return mather.find();
		
}
    
}
