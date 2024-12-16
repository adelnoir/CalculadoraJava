package Aula11;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;
import javax.swing.border.Border;

public class Main {
 
    public static void main(String[] args) {

        // Criação e formatação da janela
        JFrame frame = new JFrame("Calculadora");
        frame.setPreferredSize(new Dimension(280,400));
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new GridLayout(5,2,10,10));
        frame.getContentPane().setBackground(Color.black);
      
        // Fontes
        Font fonte = new Font("Comic Sans MS", Font.PLAIN, 12);
        Font fonteBold = new Font("Comic Sans MS", Font.BOLD,12);

        // Bordas
        Border bordaBranca = BorderFactory.createLineBorder(Color.white);

        // Criação das labels
        JLabel labelNumero1 = new JLabel("Número 1: ");
        JLabel labelNumero2 = new JLabel("Número 2: ");
        JLabel labelResultado = new JLabel("Resultado: ");
        
        // Formatação das labels
        labelNumero1.setBorder(bordaBranca);
        labelNumero2.setBorder(bordaBranca);
        labelResultado.setBorder(bordaBranca);
        labelNumero1.setFont(fonte);
        labelNumero2.setFont(fonte);
        labelResultado.setFont(fonteBold);
        labelNumero1.setForeground(Color.white);
        labelNumero2.setForeground(Color.white);
        labelResultado.setForeground(Color.white);

        // Criação dos campos de texto
        JTextField campoNumero1 = new JTextField(20);
        JTextField campoNumero2 = new JTextField(20);
        JTextField campoResultado = new JTextField(20);
        
        // Formatação e restrição dos campos de texto
        campoNumero1.setHorizontalAlignment(JTextField.CENTER);
        campoNumero2.setHorizontalAlignment(JTextField.CENTER);
        campoResultado.setHorizontalAlignment(JTextField.CENTER);
        campoNumero1.setFont(fonte);
        campoNumero2.setFont(fonte);
        campoResultado.setFont(fonteBold);
        campoResultado.setEditable(false);
        
        // Criação dos botões
        JButton botaoSoma = new JButton("+");
        JButton botaoSubtrair = new JButton("-");
        JButton botaoMultiplicar = new JButton("*");
        JButton botaoDividir = new JButton("/");
        
        // Formatação dos botões
        Dimension tamanhoBotao = new Dimension(50,40);
        botaoSoma.setPreferredSize(tamanhoBotao);
        botaoSubtrair.setPreferredSize(tamanhoBotao);
        botaoMultiplicar.setPreferredSize(tamanhoBotao);
        botaoDividir.setPreferredSize(tamanhoBotao);
        botaoSoma.setBackground(Color.white);
        botaoSubtrair.setBackground(Color.white);
        botaoMultiplicar.setBackground(Color.white);
        botaoDividir.setBackground(Color.white);
        
        // Ações dos botões
        botaoSoma.addActionListener(new ActionListener() 
            {
             @Override
             public void actionPerformed(ActionEvent e)
                {
                    try {
                        double num1 = Double.parseDouble(campoNumero1.getText());
                        double num2 = Double.parseDouble(campoNumero2.getText());
                        double resultado = num1 + num2;

                        campoResultado.setText(String.valueOf(resultado));
                    } 
                    catch (NumberFormatException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.", "ERRO",JOptionPane.ERROR_MESSAGE);
                    }

                    
                }   
            }
        );

        
        botaoSubtrair.addActionListener(new ActionListener() 
            {
             @Override
             public void actionPerformed(ActionEvent e)
                {
                    try {
                        double num1 = Double.parseDouble(campoNumero1.getText());
                        double num2 = Double.parseDouble(campoNumero2.getText());
                        double resultado = num1 - num2;

                        campoResultado.setText(String.valueOf(resultado));
                    } 
                    catch (NumberFormatException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.", "ERRO",JOptionPane.ERROR_MESSAGE);
                    }

                    
                }   
            }
        );


        botaoDividir.addActionListener(new ActionListener() 
            {
             @Override
             public void actionPerformed(ActionEvent e)
                {
                    try {
                        double num1 = Double.parseDouble(campoNumero1.getText());
                        double num2 = Double.parseDouble(campoNumero2.getText());

                        if (num2 == 0)
                        {
                            JOptionPane.showMessageDialog(null, "Divisão por zero...");
                        }
                        else
                        {
                            double resultado = num1 / num2;
                            campoResultado.setText(String.valueOf(resultado));
                        }
                    } 
                    catch (NumberFormatException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.", "ERRO",JOptionPane.ERROR_MESSAGE);
                    }

                    
                }   
            }
        );

        
        botaoMultiplicar.addActionListener(new ActionListener() 
            {
             @Override
             public void actionPerformed(ActionEvent e)
                {
                    try {
                        double num1 = Double.parseDouble(campoNumero1.getText());
                        double num2 = Double.parseDouble(campoNumero2.getText());
                        double resultado = num1 * num2;

                        campoResultado.setText(String.valueOf(resultado));
                    } 
                    catch (NumberFormatException ex) 
                    {
                        JOptionPane.showMessageDialog(null, "Por favor, insira números válidos.", "ERRO",JOptionPane.ERROR_MESSAGE);
                    }

                    
                }   
            }
        );


    // Adicionar os componentes à janela
    frame.add(labelNumero1);
    frame.add(campoNumero1);
    frame.add(labelNumero2);
    frame.add(campoNumero2);
    frame.add(labelResultado);
    frame.add(campoResultado);
    frame.add(botaoSoma);
    frame.add(botaoSubtrair);
    frame.add(botaoMultiplicar);
    frame.add(botaoDividir);
    
    // Ajustar o tamanho da janela e a torna visível
    frame.pack();
    frame.setVisible(true);

    }
}
