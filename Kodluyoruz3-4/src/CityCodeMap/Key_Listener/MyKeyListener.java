package CityCodeMap.Key_Listener;

import javax.swing.*;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

public class MyKeyListener implements KeyListener {

  public  MyKeyListener(){

    JFrame frame = new JFrame();
    frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    frame.addKeyListener(this);
    frame.setVisible(true);
}


    @Override
    public void keyTyped(KeyEvent e) {

    }

    @Override
    public void keyPressed(KeyEvent e) {

        if (e.isControlDown() && e.getKeyCode()==KeyEvent.VK_X){
            System.exit(0);
        }
        }


    @Override
    public void keyReleased(KeyEvent e) {

    }
}
