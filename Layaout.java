import java.awt.*;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class Main {
    public static void main(String[] args){
        Marco_Layout marco = new Marco_Layout();
        marco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        marco.setVisible(true);
    }
}

class Marco_Layout extends JFrame{

    public Marco_Layout(){
        this.setTitle("Prueba acciones");
        this.setBounds(600, 350, 600, 300);

        Panel_Layout lamina = new Panel_Layout();

        /*
        FlowLayout disposicion = new FlowLayout(FlowLayout.CENTER);
        setLayout(disposicion); */

        add(lamina);
    }
}

class Panel_Layout extends JPanel{
    public Panel_Layout(){

        setLayout(new BorderLayout());

        add(new JButton("Amarillo"), BorderLayout.NORTH);
        add(new JButton("Rojo"), BorderLayout.EAST);
        add(new JButton("Azul"),BorderLayout.WEST);
        add(new JButton("Verde"),BorderLayout.CENTER);
    }
}