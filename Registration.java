
package nithotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;

public class Registration extends javax.swing.JFrame implements ActionListener {
    
    JLabel l1,l2,l3,l4,l5,l6;
    JTextField t1,t2,t3,t4;
    JPasswordField p1,p2;
    JButton b1,b2;

    public Registration() {
        initComponents();
        
        JLabel h1=new JLabel("Welcome to make Registration");
        h1.setBounds(300,0,400,40);
        h1.setFont(new Font("serif",Font.ITALIC,30));
        h1.setForeground(Color.yellow);
        add(h1);
        
        JLabel h2=new JLabel("Make sure that data you use are Valid");
        h2.setBounds(330,30,400,40);
        h2.setFont(new Font("serif",Font.PLAIN,17));
        h2.setForeground(Color.yellow);
        add(h2);
        
        l1=new JLabel("Enter First Name");
        l1.setBounds(150,100,300,25);
        l1.setForeground(Color.white);
        add(l1);
        
        l2=new JLabel("Enter Last Name");
        l2.setBounds(150,150,300,25);
        l2.setForeground(Color.white);
        add(l2);
        
        l3=new JLabel("Enter Username");
        l3.setBounds(150,200,300,25);
        l3.setForeground(Color.white);
        add(l3);
        
        l4=new JLabel("Enter Email");
        l4.setBounds(150,250,300,25);
        l4.setForeground(Color.white);
        add(l4);
        
        l5=new JLabel("Enter Password");
        l5.setBounds(150,300,300,25);
        l5.setForeground(Color.white);
        add(l5);
        
        l6=new JLabel("Confirm Password");
        l6.setBounds(150,350,300,25);
        l6.setForeground(Color.white);
        add(l6);
        
        t1=new JTextField();
        t1.setBounds(300,100,300,25);
        add(t1);
        
        t2=new JTextField();
        t2.setBounds(300,150,300,25);
        add(t2);
        
        t3=new JTextField();
        t3.setBounds(300,200,300,25);
        add(t3);
        
        t4=new JTextField();
        t4.setBounds(300,250,300,25);
        add(t4);
        
        p1=new JPasswordField();
        p1.setBounds(300,300,300,25);
        add(p1);
        
        p2=new JPasswordField();
        p2.setBounds(300,350,300,25);
        add(p2);
        
        b1=new JButton("Register");
        b1.setBounds(150,400,100,25);
        b1.setBackground(Color.green);
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Cancel");
        b2.setBounds(300,400,100,25);
        b2.setBackground(Color.red);
        b2.addActionListener(this);
        add(b2);
           
        
        
        
        
        setLayout(null);
        setBounds(220,10,950,600);
        getContentPane().setBackground(Color.DARK_GRAY);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
    
    }

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 300, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    
    public static void main(String args[]) {
                new Registration();
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
