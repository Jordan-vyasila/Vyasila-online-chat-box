/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package nithotel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;

/**
 *
 * @author Tito Vyasila
 */
public class Smallc  extends JFrame {
    Smallc(){

        JLabel h = new JLabel("Select Couple Room You Want");
        h.setForeground(Color.BLACK);
        h.setFont(new Font("serif", Font.BOLD, 20));
        h.setBounds(180, 0, 2000, 27);
        add(h);
    
        setBounds(370,130,600,400);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Smallc();
    
    }
    
}