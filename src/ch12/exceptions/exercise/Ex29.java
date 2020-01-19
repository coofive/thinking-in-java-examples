package ch12.exceptions.exercise;

/**
 * exceptions/Ex29.java
 * <p>
 * ****************** Exercise 29 ******************
 * Modify all the exception types in StormyInning.java
 * so that they extend RuntimeException. and show
 * that no exception specifications or try blocks are
 * necessary. Remove the '//!' comments and show how
 * the methods can be compiled without specifications.
 * ************************************************
 *
 * @author coofive
 */
public class Ex29 {
    public static void main(String[] args) {
        StormyInning2 si = new StormyInning2();
        si.atBat();
    }
}

class Baseball2Exception extends RuntimeException {
}

class Foul2Exception extends Baseball2Exception {
}

class Strike2Exception extends Baseball2Exception {
}

abstract class AbstractInning2 {
    AbstractInning2() {
    }

    public void event() {
    }

    /**
     * atBat
     */
    abstract void atBat();

    void walk() {
    }
}

class Storm2Exception extends RuntimeException {
}

class RainedOut2Exception extends Storm2Exception {
}

class PopFoul2Exception extends RainedOut2Exception {
}

interface Storm2 {
    /**
     * event
     */
    void event();

    /**
     * rainHard
     */
    void rainHard();
}

class StormyInning2 extends AbstractInning2 implements Storm2 {
    StormyInning2() {
    }

    StormyInning2(String s) {
    }

    @Override
    public void rainHard() {
    }

    @Override
    void atBat() {
        throw new PopFoul2Exception();
    }
}

/* Output:
Exception in thread "main" ch12.exceptions.exercise.PopFoul2Exception
	at ch12.exceptions.exercise.StormyInning2.atBat(Ex29.java:82)
	at ch12.exceptions.exercise.Ex29.main(Ex29.java:19)
 *///:~