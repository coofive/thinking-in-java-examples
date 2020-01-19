//: exceptions/StormyInning.java
package ch12.exceptions.sample;
// Overridden methods may throw only the exceptions
// specified in their base-class versions, or exceptions
// derived from the base-class exceptions.


import javax.print.PrintException;
import javax.smartcardio.CardException;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.net.SocketException;

/**
 * @author coofive
 */
public class StormyInning extends AbstractInning implements Storm {
    public static void main(String[] args) {
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Strike not thrown in derived version.
        try {
            // What happens if you upcast?
            AbstractInning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
    }

    /**
     * OK to add new exceptions for constructors, but you
     * must deal with the base constructor exceptions:
     */
    public StormyInning() throws RainedOut, BaseballException {
    }

    public StormyInning(String s) throws Foul, BaseballException {
    }

    /**
     * Regular methods must conform to base class:
     * ! void walk() throws PopFoul {} //Compile error
     * Interface CANNOT add exceptions to existing
     * methods from the base class:
     * ! public void event() throws RainedOut {}
     * If the method doesn't already exist in the
     * base class, the exception is OK:
     */
    @Override
    public void rainHard() throws RainedOut {
    }


    /**
     * You can choose to not throw any exceptions,
     * even if the base version does:
     */
    @Override
    public void event() {
    }

    /**
     * Overridden methods can throw inherited exceptions:
     */
    @Override
    public void atBat() throws PopFoul {
    }


}

class BaseballException extends Exception {
}

class Foul extends BaseballException {
}

class Strike extends BaseballException {
}

abstract class AbstractInning {
    public AbstractInning() throws BaseballException {
    }

    public void event() throws BaseballException {
        // Doesn't actually have to throw anything
    }

    /**
     * Throws no checked exceptions
     *
     * @throws Strike extends BaseballException
     * @throws Foul   extends  BaseballException
     */
    public abstract void atBat() throws Strike, Foul;


    public void walk() {
    }
}

class StormException extends Exception {
}

class RainedOut extends StormException {
}

class PopFoul extends Foul {
}

interface Storm {
    /**
     * event
     *
     * @throws RainedOut StormException
     */
    void event() throws RainedOut;

    /**
     * rainHard
     *
     * @throws RainedOut StormException
     */
    void rainHard() throws RainedOut;
}

///:~