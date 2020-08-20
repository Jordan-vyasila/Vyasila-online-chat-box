package nithotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Welcome extends javax.swing.JFrame  implements ActionListener{

    public Welcome() {
        initComponents();
        setBounds(150, 100, 1080, 607);
        //setSize(1080,607);
        //setLocation(0,0);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("nithotel/images/im5.jpg"));
        JLabel ii = new JLabel(im);
        ii.setBounds(0, 0, 1080, 607);
       add(ii);

        JLabel h1 = new JLabel("Nationa Institute Of Transport Hotel");
        h1.setForeground(Color.RED);
        h1.setFont(new Font("serif", Font.PLAIN, 40));
        h1.setBounds(0, 0, 2000, 40);
        ii.add(h1);

        JLabel h = new JLabel("Welcome to NIT Hotel");
        h.setForeground(Color.WHITE);
        h.setFont(new Font("serif", Font.BOLD, 60));
        h.setBounds(200, 100, 2000, 100);
        ii.add(h);

        JLabel hr = new JLabel("You deserve to be here");
        hr.setForeground(Color.YELLOW);
        hr.setFont(new Font("serif", Font.BOLD, 40));
        hr.setBounds(300, 160, 2000, 100);
        ii.add(hr);

        JLabel hrb = new JLabel("Prepared By VyasilaBoy&ChaawaTheGreat@2020");
        hrb.setForeground(Color.WHITE);
        hrb.setFont(new Font("serif", Font.ITALIC, 20));
        hrb.setBounds(440, 504, 1080, 70);
        ii.add(hrb);
        
        JPanel p1=new JPanel();
        p1.setBounds(0,0,1080, 44);
        p1.setBackground(Color.CYAN);
        ii.add(p1);
        
        JPanel p2=new JPanel();
        p2.setBounds(0,500,1080, 67);
        p2.setBackground(Color.BLACK);
        ii.add(p2);
        
        JButton b1=new JButton("Registration");
        b1.setBackground(Color.GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFont(new Font("serif", Font.BOLD, 16));
        b1.setBounds(740,0,150,44);
        b1.addActionListener(this);
        ii.add(b1);
        
        JButton b2=new JButton("Login");
        b2.setBackground(Color.GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFont(new Font("serif", Font.BOLD, 16));
        b2.setBounds(900,0,150,44);
        b2.addActionListener(this);
        ii.add(b2);

       
        setLayout(null);
        setVisible(true);
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
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    public static void main(String args[]) {
       
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Welcome().setVisible(true);
            }
        });
    }

    public void actionPerformed(ActionEvent e) {
        if(e.getActionCommand().equals("Login")){
          new Login().setVisible(true);
    this.setVisible(false);
        }
        else if(e.getActionCommand().equals("Registration")){
          new Registration().setVisible(true);
    this.setVisible(false);
        }
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
