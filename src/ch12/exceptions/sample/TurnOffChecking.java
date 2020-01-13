//: exceptions/TurnOffChecking.java
package ch12.exceptions.sample;
// "Turning off" Checked exceptions.

import java.io.*;


/**
 * @author coofive
 */
public class TurnOffChecking {
    private final static int COUNT = 4;

    public static void main(String[] args) {
        WrapCheckedException wce = new WrapCheckedException();
        // You can call throwRuntimeException() without a try
        // block, and let RuntimeExceptions leave the method:
        wce.throwRuntimeException(3);
        // Or you can choose to catch exceptions:
        for (int i = 0; i < COUNT; i++) {
            try {
                if (i < 3) {
                    wce.throwRuntimeException(i);
                } else {
                    throw new SomeOtherException();
                }
            } catch (SomeOtherException e) {
                System.out.println("SomeOtherException: " + e);
                e.printStackTrace();
            } catch (RuntimeException re) {
                try {
                    throw new Exception(re);
                } catch (FileNotFoundException e) {
                    System.out.println("FileNotFoundException: " + e);
                    e.printStackTrace();
                } catch (IOException e) {
                    System.out.println("IOException: " + e);
                    e.printStackTrace();
                } catch (Throwable e) {
                    System.out.println("Throwable: " + e);
                    e.printStackTrace();
                }
            }
        }
    }
}

class WrapCheckedException {
    void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new FileNotFoundException();
                case 1:
                    throw new IOException();
                case 2:
                    throw new RuntimeException("Where am I?");
                default:
                    return;
            }
        } catch (Exception e) { // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}

class SomeOtherException extends Exception {
}


/* Output:
FileNotFoundException: java.io.FileNotFoundException
IOException: java.io.IOException
Throwable: java.lang.RuntimeException: Where am I?
SomeOtherException: SomeOtherException
*///:~