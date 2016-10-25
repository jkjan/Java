package com.j5;
public class p5_selectshape {

enum Shape {TRIANGLE, SQUARE};
Shape sel = Shape.TRIANGLE;
int size = 100;
int sides = 0;
double angle = 0.0;

public void Select() {
selectshape(sel);
}

public void selectshape(Shape sel) {
switch(sel) {
  case TRIANGLE:
  sides=3;
  angle=120.0;
  break;
  case SQUARE:
  sides = 4;
  angle = 90.0;
  break;
  }
  
}

public static void main(String[] args) {
Select();
}

}