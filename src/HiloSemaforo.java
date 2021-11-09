
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
public class HiloSemaforo extends Thread{

    Ventana v;
    
    public HiloSemaforo(Ventana v){
        this.v = v;
    }
    
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
        try {
            while(true){
                v.l.v.setGreen();
                v.l.repaint();
                sleep(10000);
                v.l.v.setYellow();
                v.l.v.setGreen();
                v.l.repaint();
                sleep(5000);
                v.l.v.setRed();
                v.l.v.setYellow();
                v.l.repaint();
                sleep(15000);
                v.l.v.setRed();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloSemaforo.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}

class HiloSemaforo2 extends Thread{

    Ventana v;
    
    public HiloSemaforo2(Ventana v){
        this.v = v;
    }
    
    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        
        try {
            while(true){
                v.l.h.setRed();
                v.l.repaint();
                sleep(15000);
                v.l.h.setGreen();
                v.l.h.setRed();
                v.l.repaint();
                sleep(10000);
                v.l.h.setYellow();
                v.l.h.setGreen();
                v.l.repaint();
                sleep(5000);
                v.l.h.setYellow();
            }
        } catch (InterruptedException ex) {
            Logger.getLogger(HiloSemaforo2.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}
