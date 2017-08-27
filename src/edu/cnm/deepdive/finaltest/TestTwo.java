package edu.cnm.deepdive.finaltest;

import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;

public class TestTwo implements Comparator {

  @Override
  public int compare(Object arr1, Object arr2) {
    
    if ((Collections.min(Arrays.asList((Float[])arr1)) < 
        (Collections.min(Arrays.asList((Float[])arr2))))) {
      return -1;
    } else if ((Collections.min(Arrays.asList((Float[])arr1)) > 
        (Collections.min(Arrays.asList((Float[])arr2))))) {
      return 1;
    } else {
      return 0;
    }      
  }
}
