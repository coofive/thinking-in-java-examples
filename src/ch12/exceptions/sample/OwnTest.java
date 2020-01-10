package ch12.exceptions.sample;

/**
 * @author coofive
 */
public class OwnTest {
    public static void main(String[] args) {
        try {
            method1();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void method1() throws Exception {
        try {
            method2();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("method1 throw error", e);
        }
    }

    private static void method2() throws Exception {
        try {
            method3();
        } catch (Exception e) {
            e.printStackTrace();
            throw new Exception("method2 throw error", e);
        }
    }

    private static void method3() throws Exception {
        throw new Exception("method3 throw error");
    }
}
