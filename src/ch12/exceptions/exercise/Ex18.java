package ch12.exceptions.exercise;


/**
 * exceptions/Ex18.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 18, page 479
 * <p>
 * ****************** Exercise 18 ******************
 * Add a second level of exception loss to
 * LostMessage.java so that the HoHumException is
 * itself replaced by a third exception.
 * ************************************************
 *
 * @author coofive
 */
public class Ex18 {
    public static void main(String[] args) {
        try {
            LostMessage2 lm = new LostMessage2();
            try {
                try {
                    lm.f();
                } finally {
                    lm.dispose();
                }
            } finally {
                lm.cleanup();
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

class YetAnotherException extends Exception {
    @Override
    public String toString() {
        return "Yet another exception";
    }
}

class LostMessage2 {
    void f() throws VeryImportantException {
        throw new VeryImportantException();
    }

    void dispose() throws HoHumException {
        throw new HoHumException();
    }

    void cleanup() throws YetAnotherException {
        throw new YetAnotherException();
    }
}

class VeryImportantException extends Exception {
    @Override
    public String toString() {
        return "ExA very important exception!";
    }
}

class HoHumException extends Exception {
    @Override
    public String toString() {
        return "ExA trivial exception";
    }
}

/* Output: Yet another exception *///:~
