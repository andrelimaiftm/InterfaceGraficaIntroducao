package br.edu.iftm.interfacegrafica.views;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SegundaJanela {

	private JFrame frame;
	private JTextField campoUsuario;
	private JPasswordField campoSenha;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					SegundaJanela window = new SegundaJanela();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public SegundaJanela() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel labelUsuario = new JLabel("Usu\u00E1rio:");
		labelUsuario.setBounds(10, 11, 70, 14);
		frame.getContentPane().add(labelUsuario);
		
		campoUsuario = new JTextField();
		campoUsuario.setBounds(10, 27, 127, 20);
		frame.getContentPane().add(campoUsuario);
		campoUsuario.setColumns(10);
		
		JLabel labelSenha = new JLabel("Senha:");
		labelSenha.setBounds(10, 58, 46, 14);
		frame.getContentPane().add(labelSenha);
		
		campoSenha = new JPasswordField();
		campoSenha.setBounds(10, 77, 127, 20);
		frame.getContentPane().add(campoSenha);
		
		JButton botao = new JButton("Login");
		botao.setBounds(28, 125, 89, 23);
		frame.getContentPane().add(botao);

		botao.addActionListener(new ActionListener(){
            @Override
            public void actionPerformed(ActionEvent e){
                String usuario = campoUsuario.getText();
                String senha = campoSenha.getText();
                System.out.printf("Usuário: %s \tSenha: %s, acaba de logar!\n",usuario,senha);
            }
        } );
	}
}
