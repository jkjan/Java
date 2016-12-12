package com.sd.gui;

import javax.awt.event.*;
import java.awt.*;
import javax.swing.*;

public class CalcAreaGUIMain2 extends JFrame implements ActionListener {
//ActionListener�� ��ư �������� ���ε� �� actionlistener �� ������ �� actionPerformed() ����
  JTextField field1;   //���� local scale �̾��� ������ ���������� �������
  JTextField field2;
  public CalcAreaGUIMain() {
     //JFrame f = new JFrame();
     JPanel panel = new JPanel(new GridLayout(3,2));
     getContentPane().add(panel);
     JLabel label1 = new JLabel("������");
     JLabel label2 = new JLabel("����");
     
     JTextField field1 = new JTextField(10);
     JTextField field2 = new JTextField(10*10);
     
     JButton b1 = new JButton("���");
     JButton b2 = new JButton("���");
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
      JButton b = (JButton)e.getSource(); //b�� ����ϴ� ��ư
      //field1.getText(); �̰� field1�� local scale�̶� �� ��. ���������� ������ְ� �ؿ� �� �����.
      Double r = Double.parseDouble(field1.getText());
      field2.setText(Double.toString(Math.PI*Math.pow(r,2)));
      b.setText("����߽��ϴ�.");
      
     }
     public static void main(String[] args) {
      CalcAreaGUIMain2 c = new CalcAreaGUIMain2();
      c.setDefaultCloseOperation(EXIT_ON_CLOSE);
      c.pack();
      c.setVisible(true);
      }
}