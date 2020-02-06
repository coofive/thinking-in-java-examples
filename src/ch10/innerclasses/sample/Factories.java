//: innerclasses/Factories.java
package ch10.innerclasses.sample;


/**
 * @author coofive
 */
public class Factories {
    public static void main(String[] args) {
        serviceConsumer(Implementation1Impl.factory);
        // Implementations are completely interchangeable:
        serviceConsumer(Implementation2Impl.factory);
    }

    public static void serviceConsumer(ServiceFactory fact) {
        Service s = fact.getService();
        s.method1();
        s.method2();
    }
}

interface Service {
    /**
     * method1
     */
    void method1();

    /**
     * method2
     */
    void method2();
}

interface ServiceFactory {
    /**
     * get one
     *
     * @return
     */
    Service getService();
}

class Implementation1Impl implements Service {
    private Implementation1Impl() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation1Impl method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation1Impl method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implementation1Impl();
                }
            };
}

class Implementation2Impl implements Service {
    private Implementation2Impl() {
    }

    @Override
    public void method1() {
        System.out.println("Implementation2Impl method1");
    }

    @Override
    public void method2() {
        System.out.println("Implementation2Impl method2");
    }

    public static ServiceFactory factory =
            new ServiceFactory() {
                @Override
                public Service getService() {
                    return new Implementation2Impl();
                }
            };
}

/* Output:
Implementation1Impl method1
Implementation1Impl method2
Implementation2Impl method1
Implementation2Impl method2
*///:~