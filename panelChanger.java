import java.awt.event.KeyEvent; 
import java.awt.event.KeyListener;
import java.awt.Color;

import javax.swing.*; 

public class panelChanger {

    public panelChanger()
    {
        JFrame frame = new JFrame("panelChanger"); 
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
        frame.setSize(400,400); 

        JPanel panel = new JPanel(); 

        frame.addKeyListener(new KeyListener() {

            @Override
            public void keyTyped(KeyEvent e) {

            }

            @Override
            public void keyPressed(KeyEvent e) {
                int keyCode = e.getKeyCode(); 
                switch(keyCode){
                    case KeyEvent.VK_UP:
                    
                        panel.setBackground(Color.red); 
                        break; 
                    case KeyEvent.VK_DOWN: 
                        panel.setBackground(Color.blue);
                        break;  
                    case KeyEvent.VK_RIGHT: 
                        panel.setBackground(Color.white); 
                        break;  
                    case KeyEvent.VK_LEFT:  
                        panel.setBackground(Color.black); 
                        break;  
                        
                }

            }

            @Override
            public void keyReleased(KeyEvent e) {

            }
        });
        frame.add(panel); 
        frame.setVisible(true); 

    }


    public static void main(String[] args)
    {
        new panelChanger(); 
    }
}