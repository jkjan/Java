package com.sd.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;  //Jupyter ��Ʈ���� �� ù��° �׸����� �� �� �ֵ��� Container �� awt��

public class SimpleGUI {
    public void sayHello() {
        JFrame frame=new JFrame();
        JButton button=new JButton("hello");
        //(��ư �̸�)
        
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        //frame.getContentPane().add(button);
        Container pane=frame.getContentPane();
        pane.add(button);
        //GroupLayout gl = new GroupLayout(pane);
        //pane.setLayout(gl);
        frame.setSize(100,100);
        frame.setVisible(true);
    }
}