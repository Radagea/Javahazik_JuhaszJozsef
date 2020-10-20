
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Radagea
 */
public class Idő extends JFrame implements ActionListener{
    
    private JLabel nap1, óra1, perc1, mp1,nap2, óra2, perc2, mp2,nap3, óra3, perc3, mp3;
    
    private JButton gomb;
    
    private JTextField[] bemenet = new JTextField[12];
    
    private JPanel p1;
    private JPanel p2;
    private JPanel p3;
    private JPanel p4;
    
    
    public Idő(String title) throws HeadlessException {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        this.nap1 = new JLabel("Nap");
        this.óra1 = new JLabel("Óra");
        this.perc1 = new JLabel("Perc");
        this.mp1 = new JLabel("Másodperc");
        this.nap2 = new JLabel("Nap");
        this.óra2 = new JLabel("Óra");
        this.perc2 = new JLabel("Perc");
        this.mp2 = new JLabel("Másodperc");
        this.nap3 = new JLabel("Nap");
        this.óra3 = new JLabel("Óra");
        this.perc3 = new JLabel("Perc");
        this.mp3 = new JLabel("Másodperc");
        
        this.gomb=new JButton("Kiszámol");
        this.gomb.setFont(new java.awt.Font("Arial", Font.BOLD, 39));
        this.gomb.addActionListener(this);
        
        this.p1 = new JPanel();
        this.p2 = new JPanel();
        this.p3 = new JPanel();
        
        for (int i = 0; i < 12; i++) {
          this.bemenet[i] = new JTextField(2);  
        }
        
        
        GridLayout gr1 = new GridLayout(2, 8);
        GridLayout gml= new GridLayout(1,8);
        GridLayout dis = new GridLayout(3,1);
        GridLayout ered = new GridLayout(1,8);
        p1.setLayout(gr1);
        p2.setLayout(gml);
        p3.setLayout(ered);
        this.setLayout(dis);
        
        
        p1.add(bemenet[0]);
        p1.add(nap1);
        p1.add(bemenet[1]);
        p1.add(óra1);
        p1.add(bemenet[2]);
        p1.add(perc1);
        p1.add(bemenet[3]);
        p1.add(mp1);
        
        
        
        p1.add(bemenet[4]);
        p1.add(nap2);
        p1.add(bemenet[5]);
        p1.add(óra2);
        p1.add(bemenet[6]);
        p1.add(perc2);
        p1.add(bemenet[7]);
        p1.add(mp2);
        
        p2.add(gomb);
        
        
        p3.add(bemenet[8]);
        p3.add(nap3);
        p3.add(bemenet[9]);
        p3.add(óra3);
        p3.add(bemenet[10]);
        p3.add(perc3);
        p3.add(bemenet[11]);
        p3.add(mp3);
        
        this.add(p1);
        this.add(p2);
        this.add(p3);
        
        pack();
    }
    
    public static void main(String[] args) {
        Idő l = new Idő("Idő átalakító");
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        int nap1,nap2,óra1,óra2,perc1,perc2,mp1,mp2;
        int vnap,vóra,vperc,vmp;
        for (int i = 0; i < bemenet.length; i++) {
            if (bemenet[i].getText().equals("")) {
                bemenet[i].setText("0");
            }
        }
        nap1 = Integer.parseInt(bemenet[0].getText());
        óra1 = Integer.parseInt(bemenet[1].getText());
        perc1 = Integer.parseInt(bemenet[2].getText());
        mp1 = Integer.parseInt(bemenet[3].getText());
        nap2 = Integer.parseInt(bemenet[4].getText());
        óra2 = Integer.parseInt(bemenet[5].getText());
        perc2 = Integer.parseInt(bemenet[6].getText());
        mp2 = Integer.parseInt(bemenet[7].getText());
        
        vnap = nap1+nap2;
        vóra = óra1+óra2;
        vperc = perc1+perc2;
        vmp = mp1+mp2;
        
        if (vmp > 60) {
            vperc = vperc+vmp/60;
            vmp = vmp%60;
        }
        if (vperc > 60) {
            vóra = vóra+vperc/60;
            vperc = vperc%60;
        }
        if (vóra >24) {
            vnap = vnap+vóra/24;
            vóra = vóra%24;
        }
        
        bemenet[8].setText(Integer.toString(vnap));
        bemenet[9].setText(Integer.toString(vóra));
        bemenet[10].setText(Integer.toString(vperc));
        bemenet[11].setText(Integer.toString(vmp));
    
    }

}
