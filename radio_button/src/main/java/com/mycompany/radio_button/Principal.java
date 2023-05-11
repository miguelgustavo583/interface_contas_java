/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.radio_button;

/**
 *
 * @author Pichau
 */
import javax.swing.ButtonGroup;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JRadioButton;

public class Principal {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Exemplo de Radio Buttons");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        JPanel panel = new JPanel();
        
        JRadioButton radioButton1 = new JRadioButton("Opção 1");
        JRadioButton radioButton2 = new JRadioButton("Opção 2");
        JRadioButton radioButton3 = new JRadioButton("Opção 3");
        
        // Agrupa os botões de opção para que apenas um possa ser selecionado
        ButtonGroup buttonGroup = new ButtonGroup();
        buttonGroup.add(radioButton1);
        buttonGroup.add(radioButton2);
        buttonGroup.add(radioButton3);
        
        panel.add(radioButton1);
        panel.add(radioButton2);
        panel.add(radioButton3);
        
        frame.getContentPane().add(panel);
        frame.pack();
        frame.setVisible(true);
    }
}
