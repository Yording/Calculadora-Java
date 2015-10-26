/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectoaula;

import java.awt.BorderLayout;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author estudiante
 */
public class GUI extends JFrame {

    private PanelResultado resultados;
    private panelBotones botones;

    public GUI() {

        super("Calculadora");
        setIconImage(new ImageIcon(getClass().getResource("../Imagenes/logoApp.png")).getImage());
        resultados = new PanelResultado();
        botones = new panelBotones(this);

        add(resultados, BorderLayout.NORTH);
        add(botones, BorderLayout.CENTER);

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent e) {
                cerrarVentana();
            }
        });

    }

    public void cerrarVentana() {
        int response = JOptionPane.showOptionDialog(this, "Desea cerrar la ventana",
                "Cerrar Ventana",
                JOptionPane.YES_NO_OPTION,
                JOptionPane.QUESTION_MESSAGE, null,
                new String[]{"Si", "No"}, "Default");

        if (response == JOptionPane.OK_OPTION) {
            dispose();
        }
    }

    public void Numeros(String operacion) throws ScriptException {
        try {
            String input = resultados.getResultado();

            switch (operacion) {
                case "0":
                    resultados.txtresultado.setText(input += "0");
                    break;
                case "1":
                    resultados.txtresultado.setText(input += "1");
                    break;
                case "2":
                    resultados.txtresultado.setText(input += "2");
                    break;
                case "3":
                    resultados.txtresultado.setText(input += "3");
                    break;
                case "4":
                    resultados.txtresultado.setText(input += "4");
                    break;
                case "5":
                    resultados.txtresultado.setText(input += "5");
                    break;
                case "6":
                    resultados.txtresultado.setText(input += "6");
                    break;
                case "7":
                    resultados.txtresultado.setText(input += "7");
                    break;
                case "8":
                    resultados.txtresultado.setText(input += "8");
                    break;
                case "9":
                    resultados.txtresultado.setText(input += "9");
                    break;
                case "+":
                    resultados.txtresultado.setText(input += "+");
                    break;
                case "-":
                    resultados.txtresultado.setText(input += "-");
                    break;
                case "*":
                    resultados.txtresultado.setText(input += "*");
                    break;
                case "/":
                    resultados.txtresultado.setText(input += "/");
                    break;
                case ",":
                    resultados.txtresultado.setText(input += ".");
                    break;
                case "=":
                    ScriptEngineManager manager = new ScriptEngineManager();
                    ScriptEngine engine = manager.getEngineByName("js");
                    try {
                        Object result = engine.eval(input);
                        resultados.txtresultado.setText(result.toString());
                    } catch (RuntimeException ex) {
                        JOptionPane.showMessageDialog(null, "La expresión a calcular no es válida, por favor verifique.");
                    }
                    break;
                case "<-":
                    resultados.txtresultado.setText("");
                    break;
            }
        } catch (NumberFormatException e) {
            JOptionPane.showMessageDialog(null, "Ingrese un número valido.");
        }

    }

}
