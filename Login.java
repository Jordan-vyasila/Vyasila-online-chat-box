
package nithotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPasswordField;
import javax.swing.JTextField;


public class Login extends javax.swing.JFrame implements ActionListener{

    JLabel l0,l1,l2;
    JTextField t1;
    JPasswordField t2;
    JButton b1,b2;
   
    public Login() {
        initComponents();
        
        l0=new JLabel("Login Here");
        l0.setBounds(200,0,200,100);
        l0.setFont(new Font("serif",Font.ITALIC,40));
        add(l0);
        
        l1=new JLabel("Username");
        l1.setBounds(20,70,220,50);
        add(l1);
        
        l2=new JLabel("Password");
        l2.setBounds(20,110,220,50);
        add(l2);
        
        t1=new JTextField();
        t1.setBounds(100,80,220,25);
        add(t1);
        
        t2=new JPasswordField();
        t2.setBounds(100,120,220,25);
        add(t2);
        
        b1=new JButton("Login");
        b1.setBounds(100,160,80,24);
        b1.setBackground(Color.green);
        b1.setFont(new Font("serif",Font.BOLD,18));
        b1.addActionListener(this);
        add(b1);
        
        b2=new JButton("Cancel");
        b2.setBounds(200,160,90,24);
        b2.setBackground(Color.red);
        b2.setFont(new Font("serif",Font.BOLD,18));
        b2.addActionListener(this);
        add(b2);
        
        ImageIcon pr=new ImageIcon(ClassLoader.getSystemResource("nithotel/images/nitlogo.jpg"));
        Image i=pr.getImage().getScaledInstance(100, 100,Image.SCALE_DEFAULT);
        ImageIcon prf=new ImageIcon(i);
        JLabel f=new JLabel(prf);
        f.setBounds(325, 40, 150, 160);
        add(f);
        getContentPane().setBackground(Color.WHITE);
        
        setLayout(null);
        setBounds(500,30,500,300);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==b1){
            String username=t1.getText();
            String password=t2.getText();
            conn c=new conn();
            
            String str="select * from registration where username='"+username+"' and password='"+password+"'";
            try {
               ResultSet rs= c.s.executeQuery(str);
               if(rs.next()){
               new Welcome().setVisible(true);
               this.setVisible(false);
               }else{
               JOptionPane.showMessageDialog(null, "Invalid Username Or Passwor");
               this.setVisible(false);
               }
            } catch (SQLException ex) {
                Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b2){
        System.exit(0);
        }
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

    /**
     *
     * @param args
     */
    public static void main(String[] args) {
                new Login();
            
    }
}

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables

