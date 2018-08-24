/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.awt.Dimension;
import java.text.SimpleDateFormat;
import java.util.Observable;
import java.util.Observer;
import javax.swing.SwingConstants;
import javax.swing.SwingUtilities;

/**
 *
 * @author ESTACION 4
 */
public class RelojVisual {
    /**
      * Se pasa un observable de fecha/hora. El Observable debe pasar un
      * Date a esta visual para que la presente.
      */
     public RelojVisual(Observable modelo)
     {
         // La fecha/hora se pinta en el centro de este JLabel
         this.setHorizontalAlignment((SwingConstants.CENTER));

         // Suscripción al cambio de fecha/hora en el modelo recibido.
         modelo.addObserver (new Observer ()
         {
             // Método al que el Observable llamará cuando se cambie
             // la fecha/hora. El arg se espera que sea un Date.
             public void update(java.util.Observable o, Object arg) 
             {
                 final Object fecha = arg;

                 // Se actualiza en pantalla la fecha/hora.
                 SwingUtilities.invokeLater (new Runnable()
                 {
                     public void run()
                     {
                         setText (format.format(fecha));
                     }

                     private void setText(String format) {
                         throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
                     }
                 });
             }
         });

         // Se da una dimension al JLabel.
         this.setPreferredSize(new Dimension (200, 50));
     }

     /**
      * Cambia el formato de presentacion de la fecha/hora en pantalla.
      */
     public void setFormat (SimpleDateFormat unFormato)
     {
         format = unFormato;
     }

     /**
      * Clase para mostrar una fecha/hora en formato texto.
      */
    SimpleDateFormat format = new SimpleDateFormat ("dd/MM/yyyy hh:mm:ss");

    private void setHorizontalAlignment(int i) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    private void setPreferredSize(Dimension dimension) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
