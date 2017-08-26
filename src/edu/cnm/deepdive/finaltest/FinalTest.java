package edu.cnm.deepdive.finaltest;

import java.util.Arrays;

public class FinalTest {
    
  public static void main(String[] args) {
  
    Reader reader = new Reader("resources/test-input.dat");
    System.out.println(Arrays.toString(reader.input[0]));

  }
}


