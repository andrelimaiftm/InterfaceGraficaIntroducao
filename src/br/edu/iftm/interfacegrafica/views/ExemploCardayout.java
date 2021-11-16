package br.edu.iftm.interfacegrafica.views;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import java.awt.CardLayout;
import java.awt.Color;
import java.util.Scanner;

public class ExemploCardayout {
    public static void main(String[] args) {

        Scanner texto = new Scanner(System.in);

        JFrame janela =  new JFrame("Exemplo CardLayout");
        janela.setBounds(50, 50, 500, 500);
        janela.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);       
        CardLayout layout = new CardLayout();        
        janela.setLayout(layout);

        JPanel p1 =  new JPanel();
        p1.setBackground(Color.YELLOW);
        JPanel p2 = new JPanel();
        p2.setBackground(Color.BLUE);
        JPanel p3 = new JPanel();
        p3.setBackground(Color.GREEN);
        janela.add(p1,"Um");
        janela.add(p2,"Dois");
        janela.add(p3, "Três");
        janela.setVisible(true);
        while(true){
           int i = Integer.parseInt(texto.nextLine().trim());
           if(i == 1){
               layout.show(janela, "um");
           }else if(i == 2){
            layout.show(janela, "dois");
           }else if(i == 3){
            layout.show(janela, "tres");
           }else{
               System.exit(0);
           }


        }
    }
    
}
