
package nithotel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JFrame;
import javax.swing.JLabel;


public class Single extends JFrame {
    Single(){

        JLabel h = new JLabel("Select The Room You Want");
        h.setForeground(Color.BLACK);
        h.setFont(new Font("serif", Font.BOLD, 20));
        h.setBounds(180, 0, 2000, 27);
        add(h);
    
        setBounds(370,130,600,400);
        setLayout(null);
        setVisible(true);
    }
    
    public static void main(String[] args){
        new Single();
    
    }
}
