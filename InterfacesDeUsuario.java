/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package interfacesdeusuario;
import java.awt.*;
import javax.swing.*;
/**
 *
 * @author gambl3r
 */
public class InterfacesDeUsuario {

    public static void main(String[] args) {
       miMarco mainWindow = new miMarco();
       
       mainWindow.setTitle("Beta");
       
       mainWindow.setVisible(true);
       mainWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
}


class miMarco extends JFrame{

    public miMarco() {
        this.setBounds(500, 300, 800, 800);
        this.setResizable(false);
        Toolkit mipantalla=Toolkit.getDefaultToolkit();
        Image miIcono = mipantalla.getImage("icono.png");
        
    }
    
}