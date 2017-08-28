# deepdive-final-test
a simple program to read values of an input file, sort them and print them to an output file.

In run configurations, in the arguments tab, change the working directory to: ${workspace_loc:deepdive-final-test/src}

Within the main method, a reader is called, which opens the file, "test-input.dat", which is housed in the package, "resources".  the values of said file are contained within an array of arrays, which are then sorted to find the lowest value, and then reordered by that value - the lowest value in each array determines the position in the outer array.  then the values of each inner array are re-shuffled.  all of these arrays finally are printed to a file called "test-output.dat", which is also contained within the "resources" package.  finally, all values in the file are averaged and printed to a final line of the output file.

The main method contains orders to open the input file, then it calls the reader class, which contains a method to actually read that file, line by line, sorting the arrays for values, and which is used to read the input file.  The TestTwo class actually does the comparison of the minimum values of the arrays - which is what determines which array goes in which place in the array of arrays.  The writeOutput method is used to create the output file and to write all of the sorted/averaged arrays and values to that file.