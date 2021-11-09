
import java.awt.Canvas;
import java.awt.Color;
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
public class Auto extends Canvas {
    private int x, y;
    private int orientacion;
    private Color color;
    
    public Auto(int x, int y, int orientacion, Color color){
        this.x = x;
        this.y = y;
        this.orientacion = orientacion;
        this.color = color;
    }
    
    public void build(Graphics2D g2){
        super.paint(g2);
         //------------ AUTO ------------//
         if(orientacion == 0 || orientacion == 2){
            g2.setColor(color);
            g2.fillRect(x, y, 40, 50);
         }
         
         else {
             g2.setColor(color);
             g2.fillRect(x, y, 50, 40);
         }
        
        //----------- TECHO -----------//
        g2.setColor(new Color(color.getRed(), color.getGreen(), color.getBlue()-50));
        if(orientacion == 0)g2.fillRect(x+5, y+20, 30, 15);
        if(orientacion == 1)g2.fillRect(x+15, y+5, 15, 30);
        if(orientacion == 2)g2.fillRect(x+5, y+15, 30, 15);
        if(orientacion == 3)g2.fillRect(x+20, y+5, 15, 30);
        
        //---------- VIDRIOS --------//
        
        g2.setColor(Color.white);
        if(orientacion == 0)g2.fillRect(x+5, y+35, 30, 5);
        if(orientacion == 1)g2.fillRect(x+30, y+5, 5, 30);
        if(orientacion == 2)g2.fillRect(x+5, y+30, 30, 5);
        if(orientacion == 3)g2.fillRect(x+35, y+5, 5, 30);
        
        g2.setColor(Color.white);
        if(orientacion == 0)g2.fillRect(x+5, y+15, 30, 5);
        if(orientacion == 1)g2.fillRect(x+10, y+5, 5, 30);
        if(orientacion == 2)g2.fillRect(x+5, y+10, 30, 5);
        if(orientacion == 3)g2.fillRect(x+15, y+5, 5, 30);
        
        //----------- FAROS ---------//
        
        g2.setColor(Color.white);
        if(orientacion == 0){
            g2.fillOval(x+5, y+3, 8, 6);
            g2.fillOval(x+26, y+3, 8, 6);
        }
        if(orientacion == 1){
            g2.fillOval(x+40, y+5, 6, 8);
            g2.fillOval(x+40, y+28, 6, 8);
        }
        if(orientacion == 2){
            g2.fillOval(x+5, y+41, 8, 6);
            g2.fillOval(x+26, y+41, 8, 6);
        }
        if(orientacion == 3){
            g2.fillOval(x+3, y+5, 6, 8);
            g2.fillOval(x+3, y+28, 6, 8);
        }
        
        //---------- LLANTAS ---------//
        if(orientacion == 0 || orientacion == 2){
            g2.setColor(Color.black);
            g2.fillRect(x-4, y+5, 4, 16);
            g2.setColor(Color.black);
            g2.fillRect(x-4, y+30, 4, 16);
            g2.setColor(Color.black);
            g2.fillRect(x+40, y+5, 4, 16);
            g2.setColor(Color.black);
            g2.fillRect(x+40, y+30, 4, 16);
        }
        
        else {
            g2.setColor(Color.black);
            g2.fillRect(x+4, y-4, 16, 3);
            g2.setColor(Color.black);
            g2.fillRect(x+4, y+40, 16, 3);
            g2.setColor(Color.black);
            g2.fillRect(x+30, y-4, 16, 3);
            g2.setColor(Color.black);
            g2.fillRect(x+30, y+40, 16, 3);
        }
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int isOrientacion() {
        return orientacion;
    }

    public void setO(int orientacion) {
        this.orientacion = orientacion;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }
}
