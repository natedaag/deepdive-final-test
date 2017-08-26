package edu.cnm.deepdive.finaltest;

import java.util.ArrayList;
import java.util.Enumeration;
import java.util.MissingResourceException;
import java.util.ResourceBundle;
import java.io;

public class FinalTest {
  
  private static final String TEST_BUNDLE = "resources/test-input.dat";

  public static void main(String[] args) {
    ResourceBundle messageBundle = null;
    try {
      messageBundle = ResourceBundle.getBundle(TEST_BUNDLE);
    } catch (MissingResourceException ex) {
     ex.printStackTrace();
    }
  }
  
  protected void setupPool() {
    ResourceBundle bundle = ResourceBundle.getBundle(wordList);
    ArrayList pool = new ArrayList<>();
    Enumeration<String> keyEnum = bundle.getKeys();
    while ( keyEnum.hasMoreElements()) {
      String key = keyEnum.nextElement();
      String word = bundle.getString(key);
      pool.add(word);
    }
  }

}
