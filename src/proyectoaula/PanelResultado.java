/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaula;

import java.awt.GridLayout;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.SwingConstants;

/**
 *
 * @author estudiante
 */
public class PanelResultado extends JPanel {

   
    public JTextArea txtresultado;

    public PanelResultado() {

        txtresultado = new JTextArea(3,1);

        setLayout(new GridLayout(1, 1));
        setBorder(BorderFactory.createTitledBorder(""));
        add(txtresultado);
        txtresultado.setAlignmentX(SwingConstants.CENTER);
    }
    public String  getResultado() {
       return txtresultado.getText();
    }
    
    public void SoloNumeros(JTextArea text){
        text.addKeyListener(new KeyAdapter(){
        @Override
        public void keyTyped(KeyEvent e){
            char c=e.getKeyChar();
            if(Character.isDigit(c)){
                e.consume();
            }
        }
        
        });
    }
}
