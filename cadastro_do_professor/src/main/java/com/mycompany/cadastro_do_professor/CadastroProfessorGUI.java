/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_do_professor;

/**
 *
 * @author Pichau
 */
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

public class CadastroProfessorGUI extends JFrame {
    private List<Professor> professores;

    private JLabel lblNome;
    private JTextField txtNome;
    private JLabel lblMatricula;
    private JTextField txtMatricula;
    private JLabel lblDisciplina;
    private JTextField txtDisciplina;
    private JLabel lblAulas;
    private JTextField txtAulas;
    private JButton btnCadastrar;
    private JTextArea txtAreaProfessores;

    public CadastroProfessorGUI() {
        professores = new ArrayList<>();

        lblNome = new JLabel("Nome:");
        txtNome = new JTextField(20);
        lblMatricula = new JLabel("Matrícula:");
        txtMatricula = new JTextField(10);
        lblDisciplina = new JLabel("Disciplina:");
        txtDisciplina = new JTextField(20);
        lblAulas = new JLabel("Quantidade de aulas:");
        txtAulas = new JTextField(5);
        btnCadastrar = new JButton("Confirmar Cadastro");
        txtAreaProfessores = new JTextArea(10, 40);
        txtAreaProfessores.setEditable(false);

        btnCadastrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                cadastrarProfessor();
            }
        });

        JPanel panel = new JPanel();
        panel.setLayout(new GridLayout(6, 2));
        panel.add(lblNome);
        panel.add(txtNome);
        panel.add(lblMatricula);
        panel.add(txtMatricula);
        panel.add(lblDisciplina);
        panel.add(txtDisciplina);
        panel.add(lblAulas);
        panel.add(txtAulas);
        panel.add(new JLabel()); // espaço em branco
        panel.add(btnCadastrar);

        Container container = getContentPane();
        container.setLayout(new FlowLayout());
        container.add(panel);
        container.add(new JScrollPane(txtAreaProfessores));

        setTitle("Cadastro de Professor");
        setSize(500, 400);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    private void cadastrarProfessor() {
        String nome = txtNome.getText();
        String matricula = txtMatricula.getText();
        String disciplina = txtDisciplina.getText();
        int aulas = Integer.parseInt(txtAulas.getText());

        Professor professor = new Professor(nome, matricula, disciplina, aulas);
        professores.add(professor);

        txtAreaProfessores.append(professor.toString() + "\n");

        // Limpa os campos de entrada
        txtNome.setText("");
        txtMatricula.setText("");
        txtDisciplina.setText("");
        txtAulas.setText("");
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            public void run() {
                new CadastroProfessorGUI();
            }
        });
    }

    private class Professor {
        private String nome;
        private String matricula;
        private String disciplina;
        private int aulas;

        public Professor(String nome, String matricula, String disciplina, int aulas) {
            this.nome = nome;
            this.matricula = matricula;
            this.disciplina = disciplina;
            this.aulas = aulas;
        }

        @Override
        public String toString() {
            return "Nome: " + nome + ", Matrícula: " + matricula + ", Disciplina: " + disciplina + ", Aulas: " + aulas;
        }
    }
}

