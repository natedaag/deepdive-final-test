package edu.cnm.deepdive.finaltest;

import java.util.Arrays;
import java.util.Collections;

public class FinalTest {
    
  public static void main(String[] args) {
  
    Reader reader = new Reader("resources/test-input.dat");
    float[][] input = reader.input;
    System.out.println(Arrays.toString(reader.input[0]));
    for (float[] inputArray : input) {
      Collections.shuffle(Arrays.asList(inputArray));
      
    }
  }
}


