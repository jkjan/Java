package com.sd.io;

import java.io.File;
import java.io.FileReader;

public class PrintFile {
  void print() throws Exception {
    File f = new File("noname.txt");
    FileReader fr = new FileReader(f);
  }

}