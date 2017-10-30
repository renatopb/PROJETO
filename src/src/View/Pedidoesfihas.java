package View;

import java.awt.Color;
import java.awt.event.*;
import javax.swing.*;

public class Pedidoesfihas {

    public static void main(String[] args) {
        JFrame tela = new JFrame("Pedidos de Esfihas");
        tela.setBounds(10, 10, 800, 600);
        tela.getContentPane().setBackground(new Color(126, 192, 238));
        tela.setLayout(null);

        JLabel texto = new JLabel("SABORES");
        texto.setBounds(100, 20, 200, 30);
        tela.add(texto);
        final JCheckBox frango = new JCheckBox("Frango");
        final JCheckBox carne = new JCheckBox("Carne");
        final JCheckBox queijo = new JCheckBox("Queijo");
        final JCheckBox Calabresa = new JCheckBox("Calabresa");
        final JCheckBox CalabresaQueijo = new JCheckBox("Calabresa c\\ Queijo");
        final JCheckBox FrangoQueijo = new JCheckBox("Frango c\\ Queijo");
        final JCheckBox CarneQueijo = new JCheckBox("Carne c\\ Queijo");
        final JCheckBox CarneHamburguer = new JCheckBox("Carne de Hamburguer");
        final JCheckBox Picanha = new JCheckBox("Picanha");
        
        JLabel.setLyout = new Jlabel("")

        frango.setBackground(new Color(126, 192, 238));
        carne.setBackground(new Color(126, 192, 238));
        queijo.setBackground(new Color(126, 192, 238));
        Calabresa.setBackground(new Color(126, 192, 238));
        CalabresaQueijo.setBackground(new Color(126, 192, 238));
        FrangoQueijo.setBackground(new Color(126, 192, 238));
        CarneQueijo.setBackground(new Color(126, 192, 238));
        CarneHamburguer.setBackground(new Color(126, 192, 238));
        Picanha.setBackground(new Color(126, 192, 238));

        frango.setBounds(100, 50, 200, 35);
        carne.setBounds(100, 80, 200, 35);
        queijo.setBounds(100, 110, 200, 35);
        Calabresa.setBounds(100, 140, 200, 35);
        CalabresaQueijo.setBounds(100, 170, 200, 35);
        FrangoQueijo.setBounds(100, 200, 200, 35);
        CarneQueijo.setBounds(100, 230, 200, 35);
        CarneHamburguer.setBounds(100, 260, 200, 35);
        Picanha.setBounds(100, 290, 200, 35);

        queijo.setSelected(true);
        tela.add(frango);
        tela.add(carne);
        tela.add(queijo);
        tela.add(Calabresa);
        tela.add(CalabresaQueijo);
        tela.add(FrangoQueijo);
        tela.add(CarneQueijo);
        tela.add(CarneHamburguer);
        tela.add(Picanha);

        tela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        tela.setVisible(true);

    }
}
