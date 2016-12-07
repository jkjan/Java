package com.sd.gui;

import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.Container;  //Jupyter 노트북의 맨 첫번째 그림에서 볼 수 있듯이 Container 는 awt임

public class SimpleGUI {
    public void sayHello() {
        JFrame frame=new JFrame();
        JButton button=new JButton("hello");
        //(버튼 이름)
        
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