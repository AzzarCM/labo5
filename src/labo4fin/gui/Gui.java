/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labo4fin.gui;


import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import labo4fin.threads.AnimalThread;

/**
 *
 * @author LN710Q
 */
public class Gui extends JFrame{
    
    private JLabel [] labels;
    private JButton inicio, reiniciar;
    private String[] nombres = {"canguro","tortuga","dragon"};
    private int xFinal = 400;
    
    public Gui(){
        super("Carrera de animales xd");
        initialComponents();
    }
    
    public void initialComponents(){
        
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(null);
        labels = new JLabel[3];
        inicio = new JButton("Inicio");
        reiniciar = new JButton("Reiniciar");
        Container container = getContentPane();
        
        for(int i=0; i<3; i++){
            
            labels[i] = new JLabel();
            labels[i].setIcon(new ImageIcon(getClass().getResource(nombres[i]+ ".gif")));
            labels[i].setBounds(10,(i*220)+10, 200, 200);
            container.add(labels[i]);
        }
        inicio.setBounds(10, 0, 100, 30);
        reiniciar.setBounds(500, 0, 100, 30);
        container.add(inicio);
        container.add(reiniciar);
        
        inicio.addActionListener(new ActionListener(){
        
   
            @Override
            public void actionPerformed(ActionEvent e) {
            AnimalThread canguro = new AnimalThread("canguro", labels[0].getX(),labels[0].getY(),510,labels[0]);
            AnimalThread tortuga = new AnimalThread("tortuga", labels[1].getX(),labels[1].getY(),510,labels[1]);
            AnimalThread dragon = new AnimalThread("dragon", labels[2].getX(),labels[2].getY(),510,labels[2]);
            canguro.start();
            tortuga.start();
            dragon.start();            }
        });
        reiniciar.addActionListener(new ActionListener(){
            
            @Override
            public void actionPerformed(ActionEvent e) {
                
            if ("dragon", labels[2].getX(),labels[2].getY(),510,labels[2])
            AnimalThread canguro = new AnimalThread("canguro", labels[0].getX(),labels[0].getY(),510,labels[0]);
            AnimalThread tortuga = new AnimalThread("tortuga", labels[1].getX(),labels[1].getY(),510,labels[1]);
            AnimalThread dragon = new AnimalThread("dragon", labels[2].getX(),labels[2].getY(),510,labels[2]);
            
            
                       }
            
     
            
        });
    setSize(700,650);
    

        
    }
    public static void main(String[] args){
        java.awt.EventQueue.invokeLater(new Runnable(){
        @Override
        public void run(){
            new Gui().setVisible(true);
        }
        });
    }
}