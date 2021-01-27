
package frame;
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class Frame extends JFrame {

    public Frame(){
        this.setSize(1200, 800);
        this.setDefaultCloseOperation(EXIT_ON_CLOSE);
        this.setTitle("Beta");
        this.setLocationRelativeTo(null); // Para que se ejecute en el centro
        this.getContentPane().setBackground(Color.LIGHT_GRAY);
        iniciarComponentes();
        
}
    private void iniciarComponentes(){
        JPanel panel = new JPanel();
        this.getContentPane().add(panel);  
        JLabel etiqueta = new JLabel("INICIO");
        panel.add(etiqueta);
        
    }
    
    
   
    public static void main(String[] args) {
        
        Frame f1 = new Frame();
        f1.setVisible(true);
        
    }
    
}
