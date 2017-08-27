package edu.cnm.deepdive.finaltest;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedList;

public class Reader {

  Float[][] input = null;

  Reader(String file) {
    try (
        FileReader fileReader = new FileReader(file);
        BufferedReader buffer = new BufferedReader(fileReader);
        ) {
      LinkedList<Float[]> work = new LinkedList<>();
      String line;
      while ((line = buffer.readLine()) != null) {
        if (line.trim().length() > 0) {
          String[] values = line.trim().split("\\s+");
          Float[] floatValues = new Float[values.length];
          for (int i = 0; i < values.length; i++) {
            floatValues[i] = Float.parseFloat(values[i]);
          }
          work.add(floatValues);
        }
      }
      input = work.toArray(new Float[0][]); 
      
    } catch (FileNotFoundException ex) {
      ex.printStackTrace();
    } catch (IOException ex) {
      ex.printStackTrace();
    }
  }

}
