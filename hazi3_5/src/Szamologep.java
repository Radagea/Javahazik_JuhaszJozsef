/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
/**
 *
 * @author Radagea
 */
public class Szamologep extends JFrame implements ActionListener{

    
    private JPanel szampanel;
    private JPanel sor1;
    private JPanel billentyuk;
    
    private JButton ures,backspace,ce,c,mc,mr,ms,mplus,oszt,szor,min,plus,sqrt,szaz,perx,egyenlo,tizedes,plusminus;
    private JButton[] szamok = new JButton[10];
    
    private JTextField kijelzo;
    
    private int num1,num2;
    
    
    public Szamologep(String title) {
        super(title);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setResizable(false);
        
        //JButton
        this.ures = new JButton("");
        this.backspace = new JButton("<html><body><font color=#FF0000>BACKSPACE</font></body></html>");
        this.ce = new JButton("<html><body><font color=#FF0000>CE</font></body></html>");
        this.c = new JButton("<html><body><font color=#FF0000>C</font></body></html>");
        this.mc = new JButton("<html><body><font color=#FF0000>MC</font></body></html>");
        this.mr = new JButton("<html><body><font color=#FF0000>MR</font></body></html>");
        this.ms = new JButton("<html><body><font color=#FF0000>MS</font></body></html>");
        this.mplus = new JButton("<html><body><font color=#FF0000>M+</font></body></html>");
        this.oszt= new JButton("<html><body><font color=#FF0000>/</font></body></html>");
        this.szor= new JButton("<html><body><font color=#FF0000>*</font></body></html>");
        this.min= new JButton("<html><body><font color=#FF0000>-</font></body></html>");
        this.plus= new JButton("<html><body><font color=#FF0000>+</font></body></html>");
        this.egyenlo= new JButton("<html><body><font color=#FF0000>=</font></body></html>");
        this.sqrt = new JButton("sqrt");
        this.szaz = new JButton("%");
        this.perx = new JButton("1/X");
        this.tizedes = new JButton(".");
        this.plusminus = new JButton("+/-");
        
        //JButton a számokhoz:
        for (int i = 0; i < 10; i++) {
            this.szamok[i] = new JButton(Integer.toString(i));
        }
        
        //ActionListenerek --- ha az operátorok is tömbbe lettek volna egyszerűbb lenne.
        this.c.addActionListener(this);
        this.plus.addActionListener(this);
        this.egyenlo.addActionListener(this);
        
        //ActionListener - számokhoz
        for (int i = 0; i < 10; i++) {
            szamok[i].addActionListener(this);
        }
        
        //JTextField (kijelző:
        this.kijelzo = new JTextField(20);
        kijelzo.setEditable(false);
       
        //JPanel
        this.szampanel = new JPanel();
        this.sor1 = new JPanel();
        this.billentyuk = new JPanel();
        
        //grid layoutok:
        GridLayout panel = new GridLayout(1,1);
        GridLayout sor = new GridLayout(1,4);
        GridLayout alap = new GridLayout(4,6);
        GridLayout fo = new GridLayout(3,1);
        billentyuk.setLayout(alap);
        sor1.setLayout(sor);
        szampanel.setLayout(panel);
        this.setLayout(fo);
        
        //Panelhez adás:
        szampanel.add(kijelzo);
        
        sor1.add(ures);
        sor1.add(backspace);
        sor1.add(ce);
        sor1.add(c);
        
        billentyuk.add(mc);
        billentyuk.add(szamok[7]);
        billentyuk.add(szamok[8]);
        billentyuk.add(szamok[9]);
        billentyuk.add(oszt);
        billentyuk.add(sqrt);
        billentyuk.add(mr);
        billentyuk.add(szamok[4]);
        billentyuk.add(szamok[5]);
        billentyuk.add(szamok[6]);
        billentyuk.add(szor);
        billentyuk.add(szaz);                               //juj ezt lehet egyszerűbben is ment volna...
        billentyuk.add(ms);
        billentyuk.add(szamok[1]);
        billentyuk.add(szamok[2]);
        billentyuk.add(szamok[3]);
        billentyuk.add(min);
        billentyuk.add(perx);
        billentyuk.add(mplus);
        billentyuk.add(szamok[0]);
        billentyuk.add(plusminus);
        billentyuk.add(tizedes);
        billentyuk.add(plus);
        billentyuk.add(egyenlo);
        
        this.add(szampanel);
        this.add(sor1);
        this.add(billentyuk);
        
        pack();
    }
    
    
    
    public static void main(String[] args) {
        Szamologep gep = new Szamologep("Számológép");
    }
    
    
    

    @Override
    public void actionPerformed(ActionEvent e) {
        for (int i = 0; i < 10; i++) {
            if (e.getSource()==szamok[i]) {
               kijelzo.setText(kijelzo.getText()+Integer.toString(i));
            }
        }
        
        if (e.getSource()==this.c) {
            kijelzo.setText("");
        }
        
        
        if (e.getSource()==this.plus) {
            num1 = Integer.parseInt(kijelzo.getText());
            kijelzo.setText("");
        }
        
        if (e.getSource()==this.egyenlo) {
            num2=Integer.parseInt(kijelzo.getText());
            kijelzo.setText(Integer.toString(num1+num2));
        }
        
    }
}
