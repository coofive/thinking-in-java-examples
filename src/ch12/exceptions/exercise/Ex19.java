package ch12.exceptions.exercise;

/**
 * exceptions/Ex19.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 19, page 479
 * <p>
 * ****************** Exercise 19 ******************
 * Repair the problem in LostMessage.java by
 * guarding the call in the finally clause.
 * ************************************************
 *
 * @author coofive
 */
public class Ex19 {
    public static void main(String[] args) {
        LostMessage2 lm = new LostMessage2();
        try {
            try {
                try {
                    lm.f();
                } finally {
                    try {
                        lm.dispose();
                    } catch (HoHumException e) {
                        System.out.println(e);
                    }

                }
            } finally {
                try {
                    lm.cleanup();
                } catch (YetAnotherException e) {
                    System.out.println(e);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}

/*
ExA trivial exception
Yet another exception
ExA very important exception!
*///:~
