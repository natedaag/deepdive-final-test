package edu.cnm.deepdive.finaltest;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class FinalTest {

  private static final String OUTPUT_NAME = "resources/test-output.dat";


  private static Comparator comparator = new TestTwo();

  public static void main(String[] args) {

    Reader reader = new Reader("resources/test-input.dat");
    Float[][] input = reader.input;
    System.out.println(Arrays.toString(input[0])); // print array[0]
    for (Float[] inputArray : input) { // iterate over the array - make it shuffle the items.
      // Collections.sort(Arrays.asList(inputArray));
      Collections.shuffle(Arrays.asList(inputArray));
      // Collections.min(Arrays.asList(inputArray));
    }
    Arrays.asList(input).sort(comparator);
    // System.out.println(Arrays.toString(input[0]));
    writeOutput(OUTPUT_NAME, input);
  }

  private static void writeOutput(String filename, Float[][] found) {

    Float sum = 0f;
    Float counter = 0.0f;

    try (FileOutputStream stream = new FileOutputStream(filename);
        OutputStreamWriter writer = new OutputStreamWriter(stream);
        PrintWriter printer = new PrintWriter(writer);) {
      for (Float[] needle : found) {
        int i = 1;
        for (Float number : needle) {
          counter++;
          sum += number;

          if (i++ == needle.length) {
            printer.printf("%.3f", number);
          } else {
            printer.printf("%.3f|", number);
          }
        }
        printer.println();
      }
      float average = (sum / counter);
      printer.print(average);
    } catch (IOException ex) {
      ex.printStackTrace();
      throw new RuntimeException(ex);
    }
  }


}
