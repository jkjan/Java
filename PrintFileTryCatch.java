package com.sd.io;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class PrintFileTryCatch {
  public void print() {
    try{ 
      File f = new File("noname.txt");
      FileReader fr = new FileReader(f);
      fr.close();
      }
      catch (IOExepction e) {
      e.printStactTrace();
      }
 } 
}