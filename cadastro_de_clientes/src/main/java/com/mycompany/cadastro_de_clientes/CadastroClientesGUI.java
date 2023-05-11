/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.cadastro_de_clientes;

/**
 *
 * @author Pichau
 */
import javax.swing.*;
import java.awt.*;

public class CadastroClientesGUI extends JFrame {
    public CadastroClientesGUI() {
        // Configurações da janela
        setTitle("Sistema de Cadastro de Clientes");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setSize(400, 500);
        setLayout(new GridLayout(17, 2));

        // Criação dos componentes
        JLabel labelTitulo = new JLabel("Cadastro de Clientes");
        JLabel labelNome = new JLabel("Nome:");
        JLabel labelCPF = new JLabel("CPF:");
        JLabel labelRG = new JLabel("RG:");
        JLabel labelEndereco = new JLabel("Endereço:");
        JLabel labelBairro = new JLabel("Bairro:");
        JLabel labelCEP = new JLabel("CEP:");
        JLabel labelCidade = new JLabel("Cidade:");
        JLabel labelEstado = new JLabel("Estado:");
        JLabel labelLogin = new JLabel("Login:");
        JLabel labelSenha = new JLabel("Senha:");
        JLabel labelTelefone = new JLabel("Telefone:");
        JLabel labelCelular = new JLabel("Celular:");
        JLabel labelEmail = new JLabel("Email:");

        JTextField textFieldNome = new JTextField();
        JTextField textFieldCPF = new JTextField();
        JTextField textFieldRG = new JTextField();
        JTextField textFieldEndereco = new JTextField();
        JTextField textFieldBairro = new JTextField();
        JTextField textFieldCEP = new JTextField();
        JTextField textFieldCidade = new JTextField();
        JTextField textFieldEstado = new JTextField();
        JTextField textFieldLogin = new JTextField();
        JPasswordField passwordFieldSenha = new JPasswordField();
        JTextField textFieldTelefone = new JTextField();
        JTextField textFieldCelular = new JTextField();
        JTextField textFieldEmail = new JTextField();

        JButton buttonInserir = new JButton("Inserir");
        JButton buttonAlterar = new JButton("Alterar");
        JButton buttonExcluir = new JButton("Excluir");
        JButton buttonPesquisar = new JButton("Pesquisar");
        JButton buttonFechar = new JButton("Fechar");

        // Adiciona os componentes à janela
        add(new JLabel());
        add(labelTitulo);
        add(labelNome);
        add(textFieldNome);
        add(labelCPF);
        add(textFieldCPF);
        add(labelRG);
        add(textFieldRG);
        add(labelEndereco);
        add(textFieldEndereco);
        add(labelBairro);
        add(textFieldBairro);
        add(labelCEP);
        add(textFieldCEP);
        add(labelCidade);
        add(textFieldCidade);
        add(labelEstado);
        add(textFieldEstado);
        add(labelLogin);
        add(textFieldLogin);
        add(labelSenha);
        add(passwordFieldSenha);
        add(labelTelefone);
        add(textFieldTelefone);
        add(labelCelular);
        add(textFieldCelular);
        add(labelEmail);
        add(textFieldEmail);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new FlowLayout(FlowLayout.RIGHT));
        buttonPanel.add(buttonInserir);
        buttonPanel.add(buttonAlterar);
        buttonPanel.add(buttonExcluir);
        buttonPanel.add(buttonPesquisar);
        buttonPanel.add(buttonFechar);

        add(new JLabel());
        add(buttonPanel);

        // Exibição da janela
        setVisible(true);
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                new CadastroClientesGUI();
            }
        });
    }
}
