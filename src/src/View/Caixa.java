package View;

import javax.swing.*;
import java.awt.*;

class Caixa {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Caixa");
        
        tela.setBounds(100, 100, 800, 700);
        tela.getContentPane().setBackground(new Color(126,192,238));
        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        tela.setLayout(null);
        
        JButton botao = new JButton("Açai");
        botao.setBounds(200, 170, 150, 150);
        botao.setBackground(new Color(104,34,139));
        botao.setForeground(Color.WHITE);
        botao.setToolTipText("Pedidos de Açai");
        tela.add(botao);
        JButton botao1 = new JButton("Esfihas");
        botao1.setBounds(400, 170, 150, 150);
        botao1.setBackground(new Color(255,127,0));
        botao1.setForeground(Color.WHITE);
        botao1.setToolTipText("Pedidos de Esfihas");
        tela.add(botao1);
        JButton botao2 = new JButton("Combo");
        botao2.setBounds(300, 360,  150, 150);
        botao2.setBackground(new Color(0,0,0));
        botao2.setForeground(Color.WHITE);
        botao2.setToolTipText("Pedidos de Combo");
        tela.add(botao2);
        tela.setVisible(true);
    }
}
