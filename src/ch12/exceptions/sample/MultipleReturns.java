//: exceptions/MultipleReturns.java
package ch12.exceptions.sample;

/**
 * @author coofive
 */
public class MultipleReturns {
    private final static int POINT_1 = 1;
    private final static int POINT_2 = 2;
    private final static int POINT_3 = 3;
    private final static int POINT_4 = 4;

    public static void main(String[] args) {
        for (int i = 1; i <= POINT_4; i++) {
            f(i);
        }
    }

    public static void f(int i) {
        System.out.println("Initialization that requires cleanup");
        try {
            System.out.println("Point 1");
            if (i == POINT_1) {
                return;
            }
            System.out.println("Point 2");
            if (i == POINT_2) {
                return;
            }
            System.out.println("Point 3");
            if (i == POINT_3) {
                return;
            }
            System.out.println("End");
            return;
        } finally {
            System.out.println("Performing cleanup");
        }
    }
}
/* Output:
Initialization that requires cleanup
Point 1
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
Performing cleanup
Initialization that requires cleanup
Point 1
Point 2
Point 3
End
Performing cleanup
*///:~