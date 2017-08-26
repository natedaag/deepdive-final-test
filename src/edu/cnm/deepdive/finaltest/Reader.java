package edu.cnm.deepdive.finaltest;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Reader {

  float[][] input = null;

  Reader(String file) {
    File inputFile = new File(file);
    try (
        FileReader reader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(reader);
        ) {
      LinkedList<float[]> work = new LinkedList<>();
      String line;
      while ((line = buffer.readLine()) != null) {
        if (line.trim().length() > 0) {
          String[] values = line.trim().split("\\s+");
          float[] floatValues = new float[values.length];
          for (int i = 0; i < values.length; i++) {
            floatValues[i] = Float.parseFloat(values[i]);
          }
          work.add(floatValues);
        }
      }
      input = work.toArray(new float[0][]); 
      
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
