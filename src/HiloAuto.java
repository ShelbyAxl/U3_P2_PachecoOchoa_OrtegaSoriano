
import static java.lang.Thread.sleep;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author luisa
 */
public class HiloAuto extends Thread{

    Ventana l;
    
    public HiloAuto(Ventana l){
        this.l = l;
    }
    
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while(true){
            try {
                if(!l.l.v.isR() || l.l.i != 100)l.l.i = l.l.i == 452 ? -100 : l.l.i + 4;
                l.l.repaint();
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloAuto.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}

class HiloAuto2 extends Thread{
    
    Ventana l;
    
    public HiloAuto2(Ventana l){
        this.l = l;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while(true){
            if(!l.l.h.isR() || l.l.j != 152)l.l.j = l.l.j == 752 ? -100 : l.l.j + 6;
            l.l.repaint();
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloAuto2.class.getName()).log(Level.SEVERE, null, ex);
            } 
        }        
    }
}

class HiloAuto3 extends Thread{
    
    Ventana l;
    
    public HiloAuto3(Ventana l){
        this.l = l;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while(true){
            if(!l.l.v.isR() || l.l.k != 68)l.l.k = l.l.k == 452 ? -100 : l.l.k + 4;
            l.l.repaint();
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloAuto3.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
}

class HiloAuto4 extends Thread{
    
    Ventana l;
    
    public HiloAuto4(Ventana l){
        this.l = l;
    }

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        while(true){
            if(!l.l.h.isR() || l.l.l != 200)l.l.l = l.l.l == 752 ? -100 : l.l.l + 6;
            l.l.repaint();
            try {
                sleep(50);
            } catch (InterruptedException ex) {
                Logger.getLogger(HiloAuto4.class.getName()).log(Level.SEVERE, null, ex);
            }
        }        
    }
}