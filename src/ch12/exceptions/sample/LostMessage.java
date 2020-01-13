//: exceptions/LostMessage.java
package ch12.exceptions.sample;
// How an exception can be lost.

/**
 * @author coofive
 */
public class LostMessage {
    public static void main(String[] args) {
        try {
            LostMessage lm = new LostMessage();
            try {
                lm.f();
            } finally {
                lm.dispose();
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }
}

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "A very important exception!";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "A trivial exception";
    }
}


/* Output:
A trivial exception
	at ch12.exceptions.sample.LostMessage.dispose(LostMessage.java:27)
	at ch12.exceptions.sample.LostMessage.main(LostMessage.java:15)
*///:~