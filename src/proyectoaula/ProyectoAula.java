/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaula;

import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;


/**
 *
 * @author estudiante
 */
public class ProyectoAula {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        GUI interfazins = new GUI();
        interfazins.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        interfazins.setSize(250, 350); 
        interfazins.setVisible(true); 
        interfazins.setResizable(false);
        interfazins.setLocationRelativeTo(null); 

    }

   

}
