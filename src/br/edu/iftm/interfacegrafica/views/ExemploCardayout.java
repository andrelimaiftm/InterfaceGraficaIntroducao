package br.edu.iftm.interfacegrafica.views;

import java.awt.CardLayout;
import java.awt.Color;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;

public class ExemploCardayout extends JPanel {

    CardLayout layout;
    JPanel p1,p2,p3;
    
    public ExemploCardayout(){
        p1 = new JPanel();
        p2 = new JPanel();
        p3 = new JPanel();
        this.setSize(500, 500);
        layout = new CardLayout();
        this.setLayout(layout);
        p1.setBackground(Color.YELLOW);
        p2.setBackground(Color.BLUE);
        p3.setBackground(Color.GREEN);
        this.add(p1, "um");
        this.add(p2, "dois");
        this.add(p3, "tres");
        layout.show(this, "um");
    }

    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);
        ExemploCardayout cardlayout = new ExemploCardayout();

        JFrame janela = new JFrame("Exemplo CardLayout");
        janela.setBounds(50, 50, 500, 500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        janela.add(cardlayout);        
        
        janela.setVisible(true);
        while (true) {
            System.out.print("Digite um numero 1,2 e 3 (ou 0 para sair): ");
            int i = Integer.parseInt(texto.nextLine().trim());
            if (i == 1) {
    
                cardlayout.layout.show(cardlayout, "um");
            } else if (i == 2) {
                cardlayout.layout.show(cardlayout, "dois");
            } else if (i == 3) {
                cardlayout.layout.show(cardlayout, "tres");
            } else {
                System.exit(0);
            }            
        }        
    }

}
