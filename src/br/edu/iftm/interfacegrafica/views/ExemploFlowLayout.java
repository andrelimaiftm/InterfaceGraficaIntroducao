package br.edu.iftm.interfacegrafica.views;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.WindowConstants;
import java.awt.FlowLayout;

public class ExemploFlowLayout {
    public static void main(String[] args) {

        JFrame janela =  new JFrame("Exemplo FlowLayout");
        janela.setBounds(50, 50, 200, 200);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        FlowLayout layout = new FlowLayout(FlowLayout.LEFT);
        janela.setLayout(layout);

        JButton botao1 = new JButton("Botão 1");
        JButton botao2 = new JButton("Botão 2");
        JButton botao3 = new JButton("Botão 3");
        JButton botao4 = new JButton("Botão 4");
        JButton botao5 = new JButton("Botão 5");

        janela.add(botao1);
        janela.add(botao2);
        janela.add(botao3);
        janela.add(botao4);
        janela.add(botao5);

        janela.setVisible(true);
        
    }
}
