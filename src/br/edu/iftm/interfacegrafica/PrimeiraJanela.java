package br.edu.iftm.interfacegrafica;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class PrimeiraJanela {
    public static void main(String[] args) throws Exception {
        JFrame janela = new JFrame("Título da minha priemira Janela");
        janela.setBounds(100, 100, 500, 500);
        janela.setLayout(null);

        JLabel labelUsuario = new JLabel("Usuário: ");
        JLabel labelSenha = new JLabel("Senha: ");

        JTextField campoUsuario = new JTextField();
        JPasswordField campoSenha = new JPasswordField();

        JButton botao = new JButton("Entrar");

        labelUsuario.setBounds(50, 80, 50, 20);
        campoUsuario.setBounds(50, 100, 150, 30);
        labelSenha.setBounds(50, 160, 50, 20);
        campoSenha.setBounds(50, 181, 100, 30);
        botao.setBounds(50, 250, 100, 30);

        janela.add(labelUsuario);
        janela.add(campoUsuario);
        janela.add(labelSenha);
        janela.add(campoSenha);
        janela.add(botao);

        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.setVisible(true);

    }
}
