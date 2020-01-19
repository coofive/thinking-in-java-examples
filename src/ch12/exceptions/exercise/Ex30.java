package ch12.exceptions.exercise;

/**
 * exceptions/Ex30.java
 * <p>
 * ****************** Exercise 30 ******************
 * Modify main() in Human.java so that the
 * technique in TurnOffChecking.java is used to
 * handle the different types of exceptions.
 * ************************************************
 *
 * @author coofive
 */
public class Ex30 {
    public static void main(String[] args) {
        // Let RuntimeExceptions go out of the method:
        throwRuntimeException(2);
        // Or let catch exceptions:
        final int size = 2;
        for (int i = 0; i < size; i++) {
            try {
                throwRuntimeException(i);
            } catch (RuntimeException re) {
                try {
                    throw re.getCause();
                } catch (SneezeException e) {
                    System.out.println("Caught Sneeze");
                } catch (AnnoyanceException e) {
                    System.out.println("Caught Annoyance");
                } catch (Throwable t) {
                    System.out.println(t);
                }
            }
        }
    }

    static void throwRuntimeException(int type) {
        try {
            switch (type) {
                case 0:
                    throw new AnnoyanceException();
                case 1:
                    throw new SneezeException();
                default:
                    return;
            }
        } catch (Exception e) {
            // Adapt to unchecked:
            throw new RuntimeException(e);
        }
    }
}


class AnnoyanceException extends Exception {
}

class SneezeException extends AnnoyanceException {
}