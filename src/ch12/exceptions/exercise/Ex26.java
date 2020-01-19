package ch12.exceptions.exercise;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 * exceptions/Ex26.java
 * <p>
 * ****************** Exercise 26 ******************
 * Change the file name string in MainException.java to
 * name a file that doesn't exist. Run the program and
 * note the result.
 * ************************************************
 *
 * @author coofive
 */
public class Ex26 {
    /**
     * Pass all exceptions to the console:
     */
    public static void main(String[] args) throws FileNotFoundException {
        // Open the file:
        FileInputStream file = new FileInputStream("DoesnotExist.file");
        // Use the file ...
        // Close the file:
        // file.close();
    }

}

/* Output:
Exception in thread "main" java.io.FileNotFoundException: DoesnotExist.file (系统找不到指定的文件。)
	at java.io.FileInputStream.open0(Native Method)
	at java.io.FileInputStream.open(FileInputStream.java:195)
	at java.io.FileInputStream.<init>(FileInputStream.java:138)
	at java.io.FileInputStream.<init>(FileInputStream.java:93)
	at ch12.exceptions.exercise.Ex26.main(Ex26.java:23)
 *///:~