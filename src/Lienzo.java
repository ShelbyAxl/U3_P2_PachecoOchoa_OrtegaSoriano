
import java.awt.BasicStroke;
import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class Lienzo extends Canvas{
    
    int i = -100, j = -100, k = -100, l = -100;   
    
    Color red = new Color(188,0,0);
    Color green = new Color(0,170,0); 
    Color yellow = new Color(170,170,0);
    
    Semaforo v = new Semaforo(160, 17);
    Semaforo h = new Semaforo(490,285);
        
    @Override
    public void paint(Graphics g) {
        super.paint(g);
        
        Graphics2D g2 = (Graphics2D)g;
        this.setBackground(Color.gray);
        
        g2.setStroke(new BasicStroke(6));
        
        //------------------------ B A N Q U E T A S -------------------------//
        
        
        // ------------- 0 , 0 ------------//
        g2.setColor(new Color(181,181,181));
        g2.fillRect(0, 0, 233, 133);
        g2.setColor(Color.yellow);
        g2.drawRect(-3, -3, 233, 133);
        
        // ------------- 0 , 1 ------------//
        g2.setColor(new Color(181,181,181));
        g2.fillRect(466, 0, 233, 133);
        g2.setColor(Color.yellow);
        g2.drawRect(469, -3, 233, 133);
        
        // ------------- 1 , 0 ------------//
        g2.setColor(new Color(181,181,181));
        g2.fillRect(-3, 269, 233, 133);
        g2.setColor(Color.yellow);
        g2.drawRect(-3, 269, 233, 133);
        
        // ------------- 1 , 1 ------------//
        g2.setColor(new Color(181,181,181));
        g2.fillRect(466, 266, 233, 133);
        g2.setColor(Color.yellow);
        g2.drawRect(469, 269, 233, 133);
        
        
        //------------------ L I N E A S  D I V I S O R A S ------------------//
        
        
        //------------ HORIZONTAL ------------//
        g2.setColor(Color.white);
        for(int k = 0; k < 13; k++)g2.fillRect(k*120+33, 196, 35, 8);
        //------------- VERTICAL -------------//
        g2.setColor(Color.white);
        for(int k = 0; k < 13; k++)g2.fillRect(346, k*120, 8, 35);
        
        
        //------------------------ S E M A F O R O S -------------------------//
              
        v.build(g2);
        h.build(g2);

        // ---------------------------- A U T O S ----------------------------//
        
        Auto n1 = new Auto(390, 400-i, 0, new Color(190,255,120));
        Auto n2 = new Auto(j, 215, 1, new Color(212,72,72));
        Auto n3 = new Auto(270, k, 2, new Color(0,50,161));
        Auto n4 = new Auto(700-l, 145, 3, new Color(255,195,57));
                
        n1.build(g2);
        n2.build(g2);
        n3.build(g2);
        n4.build(g2);
        
    }

    @Override
    public void update(Graphics grphcs) {
        super.update(grphcs); //To change body of generated methods, choose Tools | Templates.  
    }
}
