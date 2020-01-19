package ch12.exceptions.exercise;


/**
 * exceptions/Ex20.java
 * <p>
 * TIJ4 Chapter Exceptions, Exercise 20, page
 * <p>
 * ****************** Exercise 20 ******************
 * Modify StormyInning.java by adding an
 * UmpireArgument exception type and methods
 * that throw this exception. Test the modified
 * hierarchy.
 * ************************************************
 *
 * @author coofive
 */
public class Ex20 {
    public static void main(String[] args) {
        // Same code as before, still catches
        // the new exception:
        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoulException e) {
            System.out.println("Pop foul");
        } catch (RainedOutException e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic error");
        }
        // Strike not thrown in derived version.
        try {
            AbstractInning i = new StormyInning();
            i.atBat();
        } catch (StrikeException e) {
            System.out.println("Strike");
        } catch (FoulException e) {
            System.out.println("Foul");
        } catch (RainedOutException e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }
        // Or you can add code to catch the
        // specific type of exception:
        try {
            StormyInning si = new StormyInning();
            si.atBat();
            si.decision();
        } catch (PopFoulException e) {
            System.out.println("Pop foul");
        } catch (RainedOutException e) {
            System.out.println("Rained out");
        } catch (UmpireArgumentException e) {
            System.out.println("Argument with the umpire");
        } catch (BaseballException e) {
            System.out.println("Generic error");
        }
    }

}


class BaseballException extends Exception {
}

class FoulException extends BaseballException {
}

class StrikeException extends BaseballException {
}

class UmpireArgumentException extends BaseballException {
}

abstract class AbstractInning {
    AbstractInning() throws BaseballException {
    }

    void event() throws BaseballException {
    }

    /**
     * Throws  checked exceptions
     *
     * @throws StrikeException
     * @throws FoulException
     * @throws UmpireArgumentException
     */
    abstract void atBat() throws StrikeException, FoulException, UmpireArgumentException;

    /**
     * throws  checked exceptions
     *
     * @throws UmpireArgumentException
     */
    abstract void decision() throws UmpireArgumentException;

    void walk() {
    } // Throws nothing
}

class StormException extends Exception {
}

class RainedOutException extends StormException {
}

class PopFoulException extends FoulException {
}

interface Storm {
    /**
     * throw checked exceptions
     *
     * @throws RainedOutException
     */
    void event() throws RainedOutException;

    /**
     * throw checked exceptions
     *
     * @throws RainedOutException
     */
    void rainHard() throws RainedOutException;
}

class StormyInning extends AbstractInning implements Storm {
    StormyInning() throws RainedOutException, BaseballException {
    }

    StormyInning(String s) throws FoulException, BaseballException {
    }

    @Override
    public void rainHard() throws RainedOutException {
    }

    @Override
    public void event() {
    }

    @Override
    void atBat() throws FoulException, UmpireArgumentException {
        throw new UmpireArgumentException();
    }

    @Override
    void decision() throws UmpireArgumentException {
        throw new UmpireArgumentException();
    }
}