//: generics/CaptureConversion.java
package ch15.generics;

/**
 * @author coofive
 */
public class CaptureConversion {
    static <T> void f1(Holder<T> holder) {
        T t = holder.get();
        System.out.println(t.getClass().getSimpleName());
    }

    static void f2(Holder<?> holder) {
        // Call with captured type
        f1(holder);
    }

    @SuppressWarnings("unchecked")
    public static void main(String[] args) {
        Holder raw = new Holder<Integer>(1);
        // f1(raw); // Produces warnings
        // No warnings
        f2(raw);
        Holder rawBasic = new Holder();
        // Warning
        rawBasic.set(new Object());
        // No warnings
        f2(rawBasic);
        // Upcast to Holder<?>, still figures it out:
        Holder<?> wildcarded = new Holder<Double>(1.0);
        f2(wildcarded);
    }
} /* Output:
Integer
Object
Double
*///:~
