/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package graficos;
import javax.swing.*;
import java.awt.*;
import java.awt.geom.Rectangle2D;
import java.awt.geom.*;

public class Graficos {

    public static void main(String[] args) {
        
        MarcoConTexto mimarco = new MarcoConTexto();
        mimarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
   
    }
    
}

class MarcoConTexto extends JFrame{

        public MarcoConTexto() {
            this.setVisible(true);
            this.setSize(600, 500);
            this.setTitle("Marcos con texto");
            
            Panel mipanel = new Panel();
            add(mipanel);
            
        }
        
    }

class Panel extends JPanel{

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
       /* g.drawRect(50, 50, 200, 200);
        g.drawLine(0, 20, 50, 50);
        g.drawArc(300, 300, 100, 100, 100, 250);
        //g.drawString("Graficos", 100, 100); */
       
       Graphics2D g2 =(Graphics2D) g;
       
       Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
       g2.setPaint(Color.RED);
       g2.draw(rectangulo);
       
       
       Ellipse2D elipse = new Ellipse2D.Double();
       elipse.setFrame(rectangulo);
       g2.draw(elipse);
       
       g2.draw(new Line2D.Double(100, 100, 300, 250));
       
       double CentroenX=rectangulo.getCenterX();
       double CentroenY=rectangulo.getCenterY();
       
       double radio = 150;
       
       Ellipse2D circulo = new Ellipse2D.Double();
       circulo.setFrameFromCenter(CentroenX, CentroenY, CentroenX+radio, CentroenY+radio);
       
       g2.draw(circulo);
       
       
       
       
    }
}


