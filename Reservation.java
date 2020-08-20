package nithotel;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;


public class Reservation extends javax.swing.JFrame implements ActionListener{

    JMenuBar mb;
    JMenu m1,m2,m3,m4;
    JMenuItem i1,i2,i3,i4,i5,i6,i7,i8,i9,i10,i11,i12,i13,i14,i15;
    
    public Reservation() {
        initComponents();
        initComponents();
        setBounds(150, 10, 1080, 607);

        ImageIcon im = new ImageIcon(ClassLoader.getSystemResource("nithotel/images/im2.jpg"));
        JLabel ii = new JLabel(im);
        ii.setBounds(0, 0, 1080, 607);
       add(ii);

        JLabel h1 = new JLabel("Nationa Institute Of Transport Hotel Reservation");
        h1.setForeground(Color.white);
        h1.setFont(new Font("serif", Font.BOLD, 40));
        h1.setBounds(140, 0, 2000, 50);
        ii.add(h1);

        JLabel h = new JLabel("Choose What You Want And Be Funny!!. Welcome Again Dear Customer");
        h.setForeground(Color.WHITE);
        h.setFont(new Font("serif", Font.BOLD, 20));
        h.setBounds(240, 50, 2000, 27);
        ii.add(h);

        JLabel hd = new JLabel("There are best");
        hd.setForeground(Color.WHITE);
        hd.setFont(new Font("serif", Font.BOLD, 20));
        hd.setBounds(240, 150, 2000, 27);
        ii.add(hd);

        ImageIcon hdi = new ImageIcon(ClassLoader.getSystemResource("nithotel/images/im3.jpg"));
        JLabel ij = new JLabel(hdi);
        ij.setBounds(240, 153, 100, 300);
       add(ij);
        
        mb=new JMenuBar();
        mb.setBounds(300, 100, 400, 20);
       ii.add(mb);
       
       m1=new JMenu("Order Rooms");
        m1.setBounds(0, 190, 100, 30);
       mb.add(m1);
       
       m2=new JMenu("Booking Rooms");
        m2.setBounds(5, 170, 200, 30);
       mb.add(m2);
       
       m3=new JMenu("Order Foods");
        m3.setBounds(10, 170, 200, 30);
       mb.add(m3);
       
       m4=new JMenu("Confferences Rooms");
        m4.setBounds(15, 170, 200, 30);
       mb.add(m4);
       
       i1=new JMenuItem("For Single");
       i1.addActionListener(this);
       m1.add(i1);
       
       i2=new JMenuItem("For Couple");
       i2.addActionListener(this);
       m1.add(i2);
       
       i3=new JMenuItem("For Family");
       i3.addActionListener(this);
       m1.add(i3);
       
       i4=new JMenuItem("For a Days");
       i4.addActionListener(this);
       m2.add(i4);
       
       i5=new JMenuItem("For a Weeks");
       i5.addActionListener(this);
       m2.add(i5);
       
       i6=new JMenuItem("For a Months");
       i6.addActionListener(this);
       m2.add(i6);
       
       i7=new JMenuItem("Breakfast");
       i7.addActionListener(this);
       m3.add(i7);
       
       i8=new JMenuItem("Lunch");
       i8.addActionListener(this);
       m3.add(i8);
       
       i9=new JMenuItem("Dinner");
       i9.addActionListener(this);
       m3.add(i9);
       
       i10=new JMenuItem("Large Confference");
       i10.addActionListener(this);
       m4.add(i10);
       
       i11=new JMenuItem("Normal Confference");
       i11.addActionListener(this);
       m4.add(i11);
       
       i12=new JMenuItem("Small Confference");
       i12.addActionListener(this);
       m4.add(i12);
       
       i13=new JMenuItem("Social Meeting");
       i13.addActionListener(this);
       m4.add(i13);
       
       i14=new JMenuItem("Family Meeting");
       i14.addActionListener(this);
       m4.add(i14);
       
        
        
        setLayout(null);
        setVisible(true);
    }

    public void actionPerformed(ActionEvent ae){
    if(ae.getActionCommand().equals("For Single")){
        new Single().setVisible(true);
        
    }
    else if(ae.getActionCommand().equals("For Couple")){
        new Couple().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("For Family")){
        new Family().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("For a Days")){
        new Days().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("For a Weeks")){
        new Weeks().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("For a Months")){
        new Months().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("Breakfast")){
        new Breakfast().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("Lunch")){
        new Lunch().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("Dinner")){
        new Dinner().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("Large Confference")){
        new Largec().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("Normal Confference")){
        new Normalc().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("Small Confference")){
        new Smallc().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("Family Meeting")){
        new Familym().setVisible(true);
    
    }
    else if(ae.getActionCommand().equals("Social Meeting")){
        new Socialm().setVisible(true);
    
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
    }// </editor-fold>//GEN-END:initComponents

   
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Reservation.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new Reservation().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    // End of variables declaration//GEN-END:variables
}
