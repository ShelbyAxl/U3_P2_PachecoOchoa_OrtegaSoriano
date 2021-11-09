
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
public class Semaforo extends Canvas{
    Color red = new Color(188,0,0), green = new Color(0,170,0), yellow = new Color(170,170,0);
    int x, y;
    boolean R, G, Y;
    
    public Semaforo(int x, int y){
        this.x = x;
        this.y = y;
        R = G = Y = false;
    }
    
    public void build(Graphics2D g2){
        super.paint(g2);
        g2.setColor(new Color(60,63,65));
        g2.fillRect(x, y, 45, 100);
        //ROJO
        g2.setColor(red);
        g2.fillOval(x+10, y+7, 26, 26);
        //AMARILLO
        g2.setColor(yellow);
        g2.fillOval(x+10, y+36, 26, 26);
        //VERDE
        g2.setColor(green);
        g2.fillOval(x+10, y+65, 26, 26);

    }

    public Color getRed() {
        return red;
    }

    public void setRed() {
        if(!isR())red = new Color(255,0,0);
        else red = new Color(188,0,0);
        R = !R;
    }

    public Color getGreen() {
        return green;
    }

    public void setGreen() {
        if(!isG()) green = new Color(0,255,0);
        else green = new Color(0,170,0);
        G =! G;
    }

    public Color getYellow() {
        return yellow;
    }

    public void setYellow() {
        if(!isY()) yellow = new Color(255,255,0);
        else yellow = new Color(170,170,0);
        Y = !Y;
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

    public boolean isR() {
        return R;
    }

    public void setR(boolean R) {
        this.R = R;
    }

    public boolean isG() {
        return G;
    }

    public void setG(boolean G) {
        this.G = G;
    }

    public boolean isY() {
        return Y;
    }

    public void setY(boolean Y) {
        this.Y = Y;
    }
}
