package com.sd.gui;

import javax.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener {
//ActionListener는 버튼 눌러지면 바인딩 된 actionlistener 가 실행이 됨 actionPerformed() 실행
  JTextField field1;   //본래 local scale 이었던 변수를 전역변수로 만들어줌
  JTextField field2;
  public CalcAreaGUIMain() {
     //JFrame f = new JFrame();
     JPanel panel = new JPanel(new GridLayout(3,2));
     getContentPane().add(panel);
     JLabel label1 = new JLabel("반지름");
     JLabel label2 = new JLabel("면적");
     
     JTextField field1 = new JTextField(10);
     JTextField field2 = new JTextField(10*10);
     
     JButton b1 = new JButton("계산");
     JButton b2 = new JButton("취소");
     b1.setPreferredSize(new Dimension(40,40));
     b1.addActionListener(this);
     panel.add(label1);
     panel.add(field1);
     panel.add(label2);
     panel.add(field2);
     panel.add(b1);
     panel.add(b2); 
     
     
     pack();
     setVisible(true);
     }
     void actionPerformed(ActionEvent e) {
      JButton b = (JButton)e.getSource(); //b는 계산하는 버튼
      //field1.getText(); 이건 field1이 local scale이라 안 됨. 전역변수로 만들어주고 밑에 걸 써야함.
      Double r = Double.parseDouble(field1.getText());
      field2.setText(Double.toString(Math.PI*Math.pow(r,2)));
      b.setText("계산했습니다.");
      
     }
     public static void main(String[] args) {
      CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
      c.setDefaultCloseOperation(EXIT_ON_CLOSE);
      c.pack();
      c.setVisible(true);
      }
}