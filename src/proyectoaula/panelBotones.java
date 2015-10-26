/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaula;

import java.awt.GridLayout;
import java.awt.Insets;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.script.ScriptException;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

/**
 *
 * @author estudiante
 */
public class panelBotones extends JPanel implements ActionListener {

    public JButton btn7, btn8, btn9, btn4, btn5, btn6, btn1, btn2, btn3, btn0, btnigual, btnsuma, btnresta, btnmulti, btndivi, btncoma, btnlimpiar;
    public JPanel pnlimpiar;
    private GUI gui;

    public panelBotones(GUI gui) {

        this.gui = gui;
        btn7 = new JButton("7");
        btn8 = new JButton("8");
        btn9 = new JButton("9");
        btn4 = new JButton("4");
        btn5 = new JButton("5");
        btn6 = new JButton("6");
        btn1 = new JButton("1");
        btn2 = new JButton("2");
        btn3 = new JButton("3");
        btn0 = new JButton("0");
        btnigual = new JButton("=");
        btnsuma = new JButton("+");
        btnresta = new JButton("-");
        btnmulti = new JButton("*");
        btndivi = new JButton("/");
        btncoma = new JButton(",");
        btnlimpiar = new JButton("<-");
        pnlimpiar = new JPanel();
        setLayout(new GridLayout(5, 4));
        setBorder(BorderFactory.createTitledBorder(""));
        pnlimpiar.setLayout(new GridLayout());
        pnlimpiar.add(btnlimpiar);
        
        
        add(btn7);
        add(btn8);
        add(btn9);
        add(btndivi);
        add(btn4);
        add(btn5);
        add(btn6);
        add(btnmulti);
        add(btn1);
        add(btn2);
        add(btn3);
        add(btnresta);
        add(btn0);
        add(btnigual);
        add(btncoma);
        add(btnsuma);
        add(pnlimpiar);

        btn1.addActionListener(panelBotones.this);
        btn2.addActionListener(panelBotones.this);
        btn3.addActionListener(panelBotones.this);
        btn4.addActionListener(panelBotones.this);
        btn5.addActionListener(panelBotones.this);
        btn6.addActionListener(panelBotones.this);
        btn7.addActionListener(panelBotones.this);
        btn8.addActionListener(panelBotones.this);
        btn9.addActionListener(panelBotones.this);
        btn0.addActionListener(panelBotones.this);
        btnsuma.addActionListener(panelBotones.this);
        btnresta.addActionListener(panelBotones.this);
        btnmulti.addActionListener(panelBotones.this);
        btndivi.addActionListener(panelBotones.this);
        btncoma.addActionListener(panelBotones.this);
        btnigual.addActionListener(panelBotones.this);
        btnlimpiar.addActionListener(panelBotones.this);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            gui.Numeros(e.getActionCommand());
        } catch (ScriptException ex) {
            JOptionPane.showMessageDialog(null, "Ingrese un número valido.");
        }
    }

}
